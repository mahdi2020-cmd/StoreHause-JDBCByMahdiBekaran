package AT.ProgrammingByMahdiBekaran;

import AT.ProgrammingByMahdiBekaran.model.Catagory;
import AT.ProgrammingByMahdiBekaran.model.Goods;
import AT.ProgrammingByMahdiBekaran.service.CatagoryService;
import AT.ProgrammingByMahdiBekaran.service.GoodsService;

import java.sql.SQLException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ProgrammingByMahdiBekaran {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws SQLException {

//        System.out.println("Please the Catagory auswahlen ? :) ");
//        String name = scanner.nextLine();
//
//        CatagoryService catagoryService = new CatagoryService();
//        catagoryService.save(name);

        System.out.println("Please the Catagory auswahlen ? :) ");
        String name = scanner.nextLine();
        System.out.println("Please the Enter inventory ? :) ");
        int inventory = scanner.nextInt();
        System.out.println("Please the Enter catagoryId? :) ");
        int catagoryId = scanner.nextInt();

        Goods goods = new Goods(name, inventory, catagoryId);
        GoodsService goodsService = new GoodsService();
        goodsService.save(goods);
        System.out.println(goods);
    }
}