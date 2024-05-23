package conexao;  // nome do pacote ou seja da pasta

import java.sql.Connection; // usado para o tipo Connection 
import java.sql.DriverManager; // usado para abrir uma conexao com o DB 
import java.sql.SQLException; // usado nos cath(exceções)

public class Conexao {
    
    private static final String url = "jdbc:mysql://localhost:3306/academia";
    private static final String user = "root";
    private static final String password = "Dion2020Enem@";

    private static Connection conn;

    public static Connection getConexao(){
        try {
            if(conn == null){
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection(url, user, password);
                return conn;
            }else{
                return conn;
            }
        }
        catch (SQLException | ClassNotFoundException e) {
            System.out.println("Ocorreu um erro ao acessar o banco: "+ e.getMessage());
            e.printStackTrace();
            return null;
        }
    }


}
