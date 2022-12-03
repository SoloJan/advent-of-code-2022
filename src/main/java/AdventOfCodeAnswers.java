import static day1.Calories.caloriesOfTopThree;
import static day1.Calories.mostCalories;
import static day2.RockPaperScissorsGame.optimisedPlay;
import static day2.RockPaperScissorsGame.play;
import static day3.RucksackOrganizer.findSumOfOverlappingItems;
import static day3.RucksackOrganizer.findSumOfGroupBadges;

public class AdventOfCodeAnswers {


    public static void main(String[] args) {
        System.out.println(String.format("The answer to the day 1 exercise 1 is: %d", mostCalories("day1/input.txt")));
        System.out.println(String.format("The answer to the day 1 exercise 2 is: %d", caloriesOfTopThree("day1/input.txt")));
        System.out.println(String.format("The answer to the day 2 exercise 1 is: %d", play("day2/input.txt")));
        System.out.println(String.format("The answer to the day 2 exercise 2 is: %d", optimisedPlay("day2/input.txt")));
        System.out.println(String.format("The answer to the day 3 exercise 1 is: %d", findSumOfOverlappingItems("day3/input.txt")));
        System.out.println(String.format("The answer to the day 3 exercise 2 is: %d", findSumOfGroupBadges("day3/input.txt")));
    }

}
