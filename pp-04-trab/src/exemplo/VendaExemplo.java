package exemplo;

import DAO.VendaDao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class VendaExemplo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/Loja";
        String user = "root";
        String password = "Dion2020Enem@";
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            VendaDao dao = new VendaDao(connection);
            // Local para possíveis exemplos de uso do DAO aqui
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
