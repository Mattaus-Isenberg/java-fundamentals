package basics;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.lang.Math;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");
        flipNHeads(15);
        // clock();
        int[] testArray = { 4, 8, 15, 23, 42 };
        int[] testArray2 = { 2, 4, 6, 8 };
        int insertionValue = 16;
        int insertionValue2 = 5;
        int[] arr = insertShiftArray(testArray, insertionValue);
        int[] arr2 = insertShiftArray(testArray2, insertionValue2);
        System.out.println("Array with " + insertionValue + " inserted at position midpoint " + Arrays.toString(arr));
        System.out.println("Array with " + insertionValue2 + " inserted at position midpoint " + Arrays.toString(arr2));
        System.out.println(roll(10));
    }

    public static String pluralize(String word, int number) {

        if ((number == 0) || (number > 1)) {
            return word + "s";
        } else {
            return word;
        }
    }

    public static void flipNHeads(int nHeads) {
        int headsCount = 0;
        int numberOfFlips = 0;

        while (headsCount < nHeads) {
            double randomFloat = Math.random();

            if (randomFloat < 0.5) {
                System.out.println("tails");
                numberOfFlips++;
            } else if (randomFloat >= 0.5) {
                System.out.println("heads");
                numberOfFlips++;
                headsCount++;
            }

        }
        System.out.println("It took " + numberOfFlips + " flips to flip " + nHeads + " heads in a row");
    }

    public static void clock() {
        LocalDateTime past = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        do {
            LocalDateTime now = LocalDateTime.now();
            int previousSecond = past.getSecond();
            int currentSecond = now.getSecond();
            past = now;
            if (currentSecond - previousSecond == 1)
                System.out.println(now.format(formatter));
        } while (true);
    }

    public static int[] insertShiftArray(int[] arr, int num) {
        double midPoint = Math.ceil((arr.length / 2));
        if (arr.length % 2 != 0) {
            midPoint += 1;
        }
        System.out.println(midPoint);

        // create a new array of size n+1
        int newarr[] = new int[arr.length + 1];

        for (int i = 0; i < arr.length + 1; i++) {
            if (i < midPoint)
                newarr[i] = arr[i];
            else if (i == midPoint)
                newarr[i] = num;
            else
                newarr[i] = arr[i - 1];
        }
        return newarr;
    }

    public static int[] roll(int numOfRolls) {
        int max = 6;
        int min = 1;
        int range = max - min + 1;

        int returnArray[] = new int[numOfRolls];

        for (int i = 0; i <= numOfRolls; i++) {
            returnArray[i] = (int) (Math.random() * range) + min;
        }
        return returnArray;
    }
}