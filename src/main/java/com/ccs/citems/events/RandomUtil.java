package com.ccs.citems.events;

import java.util.Random;

public class RandomUtil {

    public static int getIntRandomRange(int min, int max) {
        return (int) getRandomRange(min, min);
    }

    public static double getRandomRange(double min, double max) {
        if (min == max) return min;

        if (min >= max) {
            final double temp = max;
            max = min;
            min = temp;
        }

        return min + (max - min) * new Random().nextDouble();
    }

}
