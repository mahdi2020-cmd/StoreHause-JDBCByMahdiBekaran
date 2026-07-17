package AT.ProgrammingByMahdiBekaran.repository;

import AT.ProgrammingByMahdiBekaran.model.Goods;
import AT.ProgrammingByMahdiBekaran.utilitie.JDbcConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GoodsRepositorz {
    private final JDbcConnection jDbcConnection ;

    public GoodsRepositorz() throws SQLException {
        jDbcConnection = new JDbcConnection();
    }

    final Connection connection = JDbcConnection.connection();

    public int save(Goods goods) throws SQLException {
        String query = "INSERT INTO goods(name, inventory, catagoryid) VALUES (?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, goods.getName());
        preparedStatement.setInt(2, goods.getInventory());
        preparedStatement.setInt(3,goods.getCatagoryId());
        System.out.println(goods.getCatagoryId());
        final int i = preparedStatement.executeUpdate();
        preparedStatement.close();
        connection.close();
        return i;
    }

    // check the name
    public boolean findByName(String name) throws SQLException {
        String query = "SELECT * FROM goods g WHERE g.name = ? ";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, name);
        final ResultSet resultSet = preparedStatement.executeQuery();
        boolean find = resultSet.next();
        return find;

    }
    //check the id exists oder
    public boolean isExistsById(int id) throws SQLException {
        String query = "SELECT * FROM goods g WHERE g.id = ? ";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, id);
        final ResultSet resultSet = preparedStatement.executeQuery();
        final boolean next = resultSet.next();
        return next;
    }

    // remove method
    public int removeByID(int id) throws SQLException {
        String query = "DELETE FROM goods g WHERE g.id = ? ";
        final PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, id);
        final int i = preparedStatement.executeUpdate();
        return i;

    }
}
