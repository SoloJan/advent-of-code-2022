package day4;

import lombok.Data;

@Data
public class Section {

     private final long start;
     private final long end;

    public Section(String section){
        var sections =  section.split("-");
        start = Long.valueOf(sections[0]);
        end = Long.valueOf(sections[1]);
    }

}
