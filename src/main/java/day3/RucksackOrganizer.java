package day3;

import lombok.experimental.UtilityClass;

import java.util.List;

import static java.lang.Character.isUpperCase;
import static util.FileUtil.readFilePerLine;
import static util.StringUtil.getPositionInAlphabet;
import static util.StringUtil.getOverlappingCharacter;

@UtilityClass
public class RucksackOrganizer {

    public static int findSumOfOverlappingItems(String filename){
        List<String> fileContent = readFilePerLine(filename);
        return fileContent.stream().map(c -> getPriorityOfOverlappingRuckSackItems(new Rucksack(c))).reduce(Integer::sum).orElse(0);
    }

    public static int findSumOfGroupBadges(String filename){
        List<String> fileContent = readFilePerLine(filename);
        var sum = 0;
        for(var index =0; index<fileContent.size()-2; index=index+3) {
            Character overlap = findGroupBadge(fileContent.get(index), fileContent.get(index + 1), fileContent.get(index + 2));
            sum +=  getPriority(overlap);
        }
        return sum;
    }

    private static int getPriorityOfOverlappingRuckSackItems(Rucksack rucksack) {
        var overLappingItems =  getOverlappingCharacter(rucksack.getFirstCompartment(), rucksack.getSecondCompartment());
        return overLappingItems.stream().map(RucksackOrganizer::getPriority).reduce(Integer::sum).orElse(0);
    }

    private static int getPriority(Character c){
        var priority = getPositionInAlphabet(c);
        if(isUpperCase(c)){
            return priority + 26;
        }
        return priority;
   }

    private static Character findGroupBadge(String firstRucksack, String secondRucksack, String  thirdRucksack){
        var firstOverlap =  getOverlappingCharacter(firstRucksack, secondRucksack);
        var secondOverlap =  getOverlappingCharacter(firstRucksack, thirdRucksack);
        firstOverlap.retainAll(secondOverlap);
        return firstOverlap.stream().findFirst().orElseThrow(() -> new RuntimeException("Expected exactly one matching character"));
    }

}
