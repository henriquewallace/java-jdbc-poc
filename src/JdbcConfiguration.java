import java.sql.*;

public class JdbcConfiguration {
    public static void main(String[] args) {
        try {
            Statement statement = postgreSqlConnection();
            String name = findUserNameById(statement);

            System.out.println(name);

        } catch (SQLException ex) {
            ex.getMessage();
        }
    }

    private static Statement postgreSqlConnection() throws SQLException {
        Connection connection = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5433/proposaldb", "postgres", "123");

            assert connection != null;
            return connection.createStatement();
    }

    private static String findUserNameById(Statement statement) throws SQLException {
        var sql = "select name from tb_user where id = 1";
        ResultSet resultSet = statement.executeQuery(sql);
        resultSet.next();

        return resultSet.getString(1);
    }
}
