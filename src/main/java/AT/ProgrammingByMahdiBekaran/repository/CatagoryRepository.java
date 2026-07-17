package AT.ProgrammingByMahdiBekaran.repository;

import AT.ProgrammingByMahdiBekaran.model.Catagory;
import AT.ProgrammingByMahdiBekaran.utilitie.JDbcConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatagoryRepository {

    Connection connection = JDbcConnection.connection();

    public CatagoryRepository() throws SQLException {
    }

    public int save(String catagory) throws SQLException {

        String query = "INSERT INTO storhaus(name) VALUES (?)";
        final PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, catagory);
        final int i = preparedStatement.executeUpdate();
        //JDbcConnection.closeResources(connection, preparedStatement);

        preparedStatement.close();
        connection.close();
        return i;
    }
    public boolean FindByName(String catagory) throws SQLException {
        String query = "SELECT * FROM storhaus s WHERE s.name = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, catagory);
        final ResultSet resultSet = preparedStatement.executeQuery();
        boolean find = resultSet.next();
//        resultSet.close();
//        preparedStatement.close();
//        connection.close();
        System.out.println(find);

        return find;


    }
}
