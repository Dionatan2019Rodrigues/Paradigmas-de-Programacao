import java.sql.*; // utilizado em (Connection/PreparedStatement/ResultSet)
import java.util.List; // utilizado para criar Listas 

public class AcademiaController {
    // Configurações do banco de dados MySQL
    private static final String URL = "jdbc:mysql://localhost:3306/nome_do_seu_banco";
    private static final String USER = "seu_usuario";
    private static final String PASSWORD = "sua_senha";

    // Conexão com o banco de dados
    private Connection connection;

    public AcademiaController() {
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para cadastrar um aluno
    public void cadastrarAluno(String cpf, String nome, Date dataNascimento) throws SQLException {
        String query = "INSERT INTO alunos (cpf, nome, data_nascimento) VALUES (?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, cpf);
        preparedStatement.setString(2, nome);
        preparedStatement.setDate(3, dataNascimento);
        preparedStatement.executeUpdate();
    }

    // Método para buscar um aluno pelo CPF
    public void buscarAlunoPorCPF(String cpf) throws SQLException {
        String query = "SELECT * FROM alunos WHERE cpf = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, cpf);
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            System.out.println("CPF: " + resultSet.getString("cpf"));
            System.out.println("Nome: " + resultSet.getString("nome"));
            System.out.println("Data de Nascimento: " + resultSet.getDate("data_nascimento"));
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }

    // Outros métodos de CRUD podem ser implementados de maneira semelhante

    public static void main(String[] args) {
        AcademiaController academiaController = new AcademiaController();

        try {
            // Exemplo de cadastro de aluno
            academiaController.cadastrarAluno("12345678900", "Fulano", Date.valueOf("2000-01-01"));

            // Exemplo de busca de aluno pelo CPF
            academiaController.buscarAlunoPorCPF("12345678900");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
