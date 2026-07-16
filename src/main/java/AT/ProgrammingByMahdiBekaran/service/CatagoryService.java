package AT.ProgrammingByMahdiBekaran.service;

import AT.ProgrammingByMahdiBekaran.model.Catagory;
import AT.ProgrammingByMahdiBekaran.repository.CatagoryRepository;

import java.sql.SQLException;
import java.util.Scanner;

public class CatagoryService {

   /* private final CatagoryRepository catagoryRepository = new CatagoryRepository();

    public CatagoryService() throws SQLException {
    } */

    private final CatagoryRepository catagoryRepository;

    public CatagoryService() throws SQLException {
        catagoryRepository = new CatagoryRepository();
    }


    public void save(String catagory) throws SQLException {
        if (catagoryRepository.uniqeName(catagory)) {
            System.out.println("catagory cant save ! weil this name Exists");

        } else {
            catagoryRepository.save(catagory);
            System.out.println("catagory successfully saved :) "); }


    }
}
