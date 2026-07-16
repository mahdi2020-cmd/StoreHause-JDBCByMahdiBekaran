package AT.ProgrammingByMahdiBekaran.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Catagory {
    private int id;
    private String name;

    public Catagory(String name) {
        this.name = name ;
    }
}
