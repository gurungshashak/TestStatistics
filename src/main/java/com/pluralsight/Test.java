package com.pluralsight;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int [] testScore = {50, 70, 65, 98, 90, 91, 83, 55, 60, 73};

        int highScore = testScore[3];
        int lowScore = testScore[0];
        int sum = 0;

        for (int i : testScore) {
            sum += i ;
        }

        double averageScore = (double) sum / testScore.length;

        System.out.println("High Score: " + highScore);
        System.out.println("Low Score: " + lowScore);
        System.out.println("Average Score: " + averageScore);

        Arrays.sort(testScore);
        System.out.println(Arrays.toString(testScore));
        double median = (70+73) / 2;
        System.out.println("Median: " + median);


    }
}

