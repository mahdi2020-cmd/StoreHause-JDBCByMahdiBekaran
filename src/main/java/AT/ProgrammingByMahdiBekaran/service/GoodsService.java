package AT.ProgrammingByMahdiBekaran.service;

import AT.ProgrammingByMahdiBekaran.model.Goods;
import AT.ProgrammingByMahdiBekaran.repository.GoodsRepositorz;

import java.sql.SQLException;

public class GoodsService {

    private final GoodsRepositorz goodsRepositorz ;

    public GoodsService() throws SQLException {
        goodsRepositorz = new GoodsRepositorz();
    }

    public void save(Goods goods) throws SQLException {
        if (goodsRepositorz.findByName(goods.getName())){
            System.out.println("this name exist in data base");
        }else {
            goodsRepositorz.save(goods);
            System.out.println("this data succeffullt to goods database seved :)");
        }
    }

    // this method for delete
    public void removeFromGoods(int id) throws SQLException {
        if (!goodsRepositorz.isExistsById(id))
            System.out.println("this thing nicht exists !");
        goodsRepositorz.removeByID(id);
        System.out.println("this item successfully removed :) ");

    }
}
