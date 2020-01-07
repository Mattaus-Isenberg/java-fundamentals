package basics;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");
        flipNHeads(15);
        clock();
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

}