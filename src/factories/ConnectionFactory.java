package factories;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/db_aluno?useTimezone=true&serverTimezone=UTC&useSSL=false";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "coti";

    public static Connection getConnection() throws Exception {
        return DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
    }
}
