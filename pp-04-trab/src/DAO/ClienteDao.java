package DAO;

import java.sql.Connection;
import java.sql.SQLException;

public class ClienteDao {
    private Connection connection;

    public ClienteDao(Connection connection) {
        this.connection = connection;
    }
}
