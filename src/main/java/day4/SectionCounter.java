package day4;

import lombok.experimental.UtilityClass;

import java.util.function.Predicate;

import static util.FileUtil.readFilePerLine;

@UtilityClass
public class SectionCounter {

    public static long countFullOverlap(String fileName){
        return countFilteredSectionPairs(fileName, SectionPair::hasFullOverlap);
    }

    public static long countOverlap(String fileName){
        return countFilteredSectionPairs(fileName, SectionPair::hasOverlap);
    }

    private static long countFilteredSectionPairs(String fileName, Predicate<SectionPair> filter){
        return readFilePerLine(fileName).stream().map(SectionPair::new).filter(filter).count();
    }


}
