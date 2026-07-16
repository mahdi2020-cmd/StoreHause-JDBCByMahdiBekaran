package AT.ProgrammingByMahdiBekaran;

import AT.ProgrammingByMahdiBekaran.model.Catagory;
import AT.ProgrammingByMahdiBekaran.service.CatagoryService;

import java.sql.SQLException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ProgrammingByMahdiBekaran {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws SQLException {

        System.out.println("Please the Catagory auswahlen ? :) ");
        String name = scanner.nextLine();

        CatagoryService catagoryService = new CatagoryService();
        catagoryService.save(name);

    }
}