import java.sql.*;

public class JdbcConfiguration {
    public static void main(String[] args) {

    }

    private void postgreSqlConnection() {
        try {
            Connection connection = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5433/proposaldb", "postgres", "123");

            Statement statement = connection.createStatement();
        } catch (SQLException ex) {
            ex.getMessage();
        }
    }
}
