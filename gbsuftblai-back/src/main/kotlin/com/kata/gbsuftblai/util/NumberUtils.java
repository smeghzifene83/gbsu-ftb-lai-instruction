package com.kata.gbsuftblai.util;


import java.util.ArrayList;
import java.util.List;

public final class NumberUtils {

    private NumberUtils() {
        // Refuse instantiation
    }


    public static List<Integer> getDigits(final int nbr) {
        List<Integer> result = new ArrayList<>();
        char[] digits = String.valueOf(nbr).toCharArray();
        for (int i = 0; i < digits.length; i++) {
            result.add(Character.getNumericValue(digits[i]));
        }
        return result;
    }

    public static boolean isDivisibleBy(int input, int by) {
        return input % by == 0;
    }
}
