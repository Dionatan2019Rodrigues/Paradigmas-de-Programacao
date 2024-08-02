package DAO;

import java.sql.Connection;
import java.sql.SQLException;

public class VendaDao {
    private Connection connection;

    public VendaDao(Connection connection) {
        this.connection = connection;
    }
}
