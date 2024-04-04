package fi.arcada.codechallenge;

import java.util.ArrayList;
import java.util.Collections;

public class Statistics {

    public static double calculateAverage(ArrayList<Double> values) {
        double sum = 0;
        for (double num : values) {
            sum += num;
        }
        return sum / values.size();
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

    public static double calcMode(ArrayList<Double> values) {
        // Implement logic for mode calculation
        // Return mode value or handle if there's no mode
        return 0; // Placeholder, replace with actual calculation
    }

    public static double calcStdev(ArrayList<Double> values) {
        double sum = 0;
        double average = calculateAverage(values);

        for (double num : values) {
            sum += Math.pow(num - average, 2);
        }

        double variance = sum / values.size();
        return Math.sqrt(variance);
    }

    public static double calcLQ(ArrayList<Double> values) {
        Collections.sort(values);
        int n = values.size();
        int lowerIndex = n / 4;
        if (n % 4 == 0) {
            return (values.get(lowerIndex - 1) + values.get(lowerIndex)) / 2.0;
        } else {
            return values.get(lowerIndex);
        }
    }

    public static double calcUQ(ArrayList<Double> values) {
        Collections.sort(values);
        int n = values.size();
        int upperIndex = (int) Math.ceil(3 * n / 4.0);
        if (n % 4 == 0) {
            return (values.get(upperIndex - 1) + values.get(upperIndex)) / 2.0;
        } else {
            return values.get(upperIndex);
        }
    }

    public static double calcIQR(ArrayList<Double> values) {
        double lq = calcLQ(values);
        double uq = calcUQ(values);
        return uq - lq;
    }
}
