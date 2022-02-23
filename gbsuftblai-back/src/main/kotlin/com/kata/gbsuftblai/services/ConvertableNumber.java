package com.kata.gbsuftblai.services;


import java.util.Optional;
import java.util.stream.Stream;

public enum ConvertableNumber {

    THREE(3, true, true) {
        @Override
        public String getLabel() {
            return "Gbsu";
        }
    },

    FIVE(5, true, true) {
        @Override
        public String getLabel() {
            return "Ftb";
        }
    },

    SEVEN(7, false, true) {
        @Override
        public String getLabel() {
            return "Lai";
        }
    };

    private int value;
    private boolean divisible;
    private boolean containable;

    public int getValue() {
        return value;
    }

    public boolean isDivisible() {
        return divisible;
    }

    public boolean isContainable() {
        return containable;
    }

    public abstract String getLabel();

    ConvertableNumber(int value, boolean divisible, boolean containable) {
        this.value = value;
        this.divisible = divisible;
        this.containable = containable;
    }

    public static String getLabelIfDivisible(final int value) {
        Optional<ConvertableNumber> any = Stream.of(values())
                .filter(t -> t.isDivisible() && t.value == value)
                .findAny();
        return any.isPresent() ? any.get().getLabel() : "";
    }

    public static String getLabelIfContains(final int value) {
        Optional<ConvertableNumber> any = Stream.of(values())
                .filter(t -> t.isContainable() && t.value == value)
                .findAny();
        return any.isPresent() ? any.get().getLabel() : "";
    }


}

