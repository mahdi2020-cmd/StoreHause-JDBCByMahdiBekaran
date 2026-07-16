package AT.ProgrammingByMahdiBekaran.utilitie;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDbcConnection {
    private static final String url = "jdbc:postgresql://localhost:5432/storhous";
    private static final String username= "postgres";
    private static final String password = "21212";


    public static Connection connection() throws SQLException {

        final Connection connection = DriverManager.getConnection(url, username, password);
        System.out.println("to database connented :) ");
        return connection;
    }
    public static void closeResources(Connection con, PreparedStatement ps) {
        try {
            if (ps != null)
                ps.close();
            if (con != null)
                con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
