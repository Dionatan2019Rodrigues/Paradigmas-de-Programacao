package exemplo;

import DAO.ClienteDao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ClienteExemplo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/Loja";
        String user = "root";
        String password = "Dion2020Enem@";
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            ClienteDao dao = new ClienteDao(connection);
            // Local para possíveis exemplos de uso do DAO aqui
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
