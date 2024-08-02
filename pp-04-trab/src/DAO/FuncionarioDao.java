package DAO;

import java.sql.Connection;
import java.sql.SQLException;

public class FuncionarioDao {
    private Connection connection;

    public FuncionarioDao(Connection connection) {
        this.connection = connection;
    }
}
