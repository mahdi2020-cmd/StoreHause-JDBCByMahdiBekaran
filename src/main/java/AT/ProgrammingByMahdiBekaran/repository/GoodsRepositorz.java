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
}
