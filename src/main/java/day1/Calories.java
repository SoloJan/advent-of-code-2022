package day1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static util.FileUtil.readFilePerLine;

public class Calories {

    public static int mostCalories(String filename) {
        var calories = getSortedListOfCalories(filename);
        return calories.get(0);
    }

    public static int caloriesOfTopThree(String filename) {
        List<Integer> sortedList = getSortedListOfCalories(filename);
        return sortedList.get(0) + sortedList.get(1) +  sortedList.get(2);
    }

    private static List<Integer> getSortedListOfCalories(String filename) {
        List<String> fileContent = readFilePerLine(filename);
        int currentSum = 0;
        var list = new ArrayList<Integer>();
        for (String calorie : fileContent) {
            if (calorie.isEmpty()) {
                list.add(currentSum);
                currentSum = 0;
            } else {
                currentSum += Integer.valueOf(calorie);
            }
        }
        list.add(currentSum);
        var  sortedList =   list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        return sortedList;
    }


}
