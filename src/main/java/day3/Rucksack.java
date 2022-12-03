package day3;

import lombok.Data;

@Data
public class Rucksack {

    private String firstCompartment;
    private String secondCompartment;
    private String content;

    public Rucksack(String content){
        var middle = (int) content.length() / 2;
        this.content = content;
        this.firstCompartment = content.substring(0, middle);
        this.secondCompartment = content.substring(middle);
    }

}
