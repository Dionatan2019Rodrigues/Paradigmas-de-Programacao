import utilidade.FileGenerator; // importa a classe FileGenerator
import utilidade.Util; // importa a classe Util

import java.sql.Connection; 
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GeradorClasses {
    // Configurações do banco de dados
    private static final String URL = "jdbc:mysql://localhost:3306/Loja";
    private static final String USER = "root";
    private static final String PASSWORD = "Dion2020Enem@";
    private static final String SCHEMA = "Loja";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            DatabaseMetaData metaData = connection.getMetaData();
            ResultSet tables = metaData.getTables(SCHEMA, null, "%", new String[]{"TABLE"});
            while (tables.next()) {
                String tableName = tables.getString("TABLE_NAME");
                System.out.println("Gerando classes para a tabela: " + tableName);

                // Obter metadados das colunas da tabela
                ResultSet columns = metaData.getColumns(SCHEMA, null, tableName, null);

                // Gerar as classes
                generateEntityClass(tableName, columns);
                generateDaoClass(tableName);
                generateExampleClass(tableName);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void generateEntityClass(String tableName, ResultSet columns) throws SQLException {
        String className = Util.toCamelCase(tableName);
        StringBuilder classContent = new StringBuilder();
        classContent.append("package entidade;\n\n");
        classContent.append("public class ").append(className).append(" {\n");

        while (columns.next()) {
            String columnName = columns.getString("COLUMN_NAME");
            String columnType = Util.getJavaType(columns.getString("TYPE_NAME"));
            classContent.append("    private ").append(columnType).append(" ").append(columnName).append(";\n");
        }

        classContent.append("}\n");

        FileGenerator.generateFile("src/entidade/" + className + ".java", classContent.toString());
    }

    private static void generateDaoClass(String tableName) {
        String entityName = Util.toCamelCase(tableName);
        String className = entityName + "Dao";
        StringBuilder classContent = new StringBuilder();
        classContent.append("package DAO;\n\n");
        classContent.append("import java.sql.Connection;\n");
        classContent.append("import java.sql.SQLException;\n\n");
        classContent.append("public class ").append(className).append(" {\n");
        classContent.append("    private Connection connection;\n\n");
        classContent.append("    public ").append(className).append("(Connection connection) {\n");
        classContent.append("        this.connection = connection;\n");
        classContent.append("    }\n");
        // Adicionar métodos CRUD aqui
        classContent.append("}\n");

        FileGenerator.generateFile("src/DAO/" + className + ".java", classContent.toString());
    }

    private static void generateExampleClass(String tableName) {
        String entityName = Util.toCamelCase(tableName);
        String className = entityName + "Exemplo";
        StringBuilder classContent = new StringBuilder();
        classContent.append("package exemplo;\n\n");
        classContent.append("import DAO.").append(entityName).append("Dao;\n");
        classContent.append("import java.sql.Connection;\n");
        classContent.append("import java.sql.DriverManager;\n");
        classContent.append("import java.sql.SQLException;\n\n");
        classContent.append("public class ").append(className).append(" {\n");
        classContent.append("    public static void main(String[] args) {\n");
        classContent.append("        String url = \"").append(URL).append("\";\n");
        classContent.append("        String user = \"").append(USER).append("\";\n");
        classContent.append("        String password = \"").append(PASSWORD).append("\";\n");
        classContent.append("        try (Connection connection = DriverManager.getConnection(url, user, password)) {\n");
        classContent.append("            ").append(entityName).append("Dao dao = new ").append(entityName).append("Dao(connection);\n");
        classContent.append("            // Local para possíveis exemplos de uso do DAO aqui\n");
        classContent.append("        } catch (SQLException e) {\n");
        classContent.append("            e.printStackTrace();\n");
        classContent.append("        }\n");
        classContent.append("    }\n");
        classContent.append("}\n");

        FileGenerator.generateFile("src/exemplo/" + className + ".java", classContent.toString());
    }

}
