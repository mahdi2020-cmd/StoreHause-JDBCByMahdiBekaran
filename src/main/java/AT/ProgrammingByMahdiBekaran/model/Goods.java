package AT.ProgrammingByMahdiBekaran.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Goods {
    private int id ;
    private String name ;
    private int inventory ;
    private int catagoryId ;

    public Goods(String name, int inventory, int catagoryId) {
        this.name = name;
        this.inventory = inventory ;
        this.catagoryId = catagoryId;
    }

}
