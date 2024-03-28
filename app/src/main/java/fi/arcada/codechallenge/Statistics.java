package fi.arcada.codechallenge;

import java.util.ArrayList;
import java.util.Collections;

public class Statistics {

    public static double calcStdev(ArrayList<Double> values) {
        double sum = 0;
        double average = calculateAverage(values);

        for (double num : values) {
            sum += Math.pow(num - average, 2);
        }

        double variance = sum / values.size();
        return Math.sqrt(variance);
    }

    public static double calcMedian(ArrayList<Double> values) {
        Collections.sort(values);
        int size = values.size();
        if (size % 2 == 0) {
            int midIndex1 = size / 2 - 1;
            int midIndex2 = size / 2;
            return (values.get(midIndex1) + values.get(midIndex2)) / 2.0;
        } else {
            return values.get(size / 2);
        }
    }

    public static double calculateAverage(ArrayList<Double> values) {
        double sum = 0;
        for (double num : values) {
            sum += num;
        }
        double average = sum / values.size();
        return average;
    }
}