import static day1.Calories.caloriesOfTopThree;
import static day1.Calories.mostCalories;
import static day2.RockPaperScissorsGame.optimisedPlay;
import static day2.RockPaperScissorsGame.play;
import static day3.RucksackOrganizer.findSumOfOverlappingItems;
import static day3.RucksackOrganizer.findSumOfGroupBadges;
import static day4.SectionCounter.countFullOverlap;
import static day4.SectionCounter.countOverlap;
import static day5.CrateMover.moveCrates;
import static day5.CrateMover.moveMultipleCratesAtOnce;
import static day5.StackFactory.createPuzzleInputStack;
import static day6.SignalDecoder.findStartOfPacket;
import static day6.SignalDecoder.findStartOfMessage;

public class AdventOfCodeAnswers {


    public static void main(String[] args) {
        System.out.println(String.format("The answer to the day 1 exercise 1 is: %d", mostCalories("day1/input.txt")));
        System.out.println(String.format("The answer to the day 1 exercise 2 is: %d", caloriesOfTopThree("day1/input.txt")));
        System.out.println(String.format("The answer to the day 2 exercise 1 is: %d", play("day2/input.txt")));
        System.out.println(String.format("The answer to the day 2 exercise 2 is: %d", optimisedPlay("day2/input.txt")));
        System.out.println(String.format("The answer to the day 3 exercise 1 is: %d", findSumOfOverlappingItems("day3/input.txt")));
        System.out.println(String.format("The answer to the day 3 exercise 2 is: %d", findSumOfGroupBadges("day3/input.txt")));
        System.out.println(String.format("The answer to the day 4 exercise 1 is: %d", countFullOverlap("day4/input.txt")));
        System.out.println(String.format("The answer to the day 4 exercise 2 is: %d", countOverlap("day4/input.txt")));
        System.out.println(String.format("The answer to the day 5 exercise 1 is: %s", moveCrates("day5/input.txt", createPuzzleInputStack())));
        System.out.println(String.format("The answer to the day 5 exercise 2 is: %s", moveMultipleCratesAtOnce("day5/input.txt", createPuzzleInputStack())));
        System.out.println(String.format("The answer to the day 6 exercise 1 is: %d", findStartOfPacket("day6/input.txt")));
        System.out.println(String.format("The answer to the day 6 exercise 2 is: %d", findStartOfMessage("day6/input.txt")));
    }

}
