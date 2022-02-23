package com.kata.gbsuftblai.services;

import org.springframework.stereotype.Service;

import java.util.stream.Stream;

import static com.kata.gbsuftblai.services.ConvertableNumber.values;
import static com.kata.gbsuftblai.services.ConvertableNumber.getLabelIfDivisible;
import static com.kata.gbsuftblai.util.NumberUtils.getDigits;
import static com.kata.gbsuftblai.util.NumberUtils.isDivisibleBy;
import static java.lang.String.valueOf;

@Service
public class GbsuFtbLaiService {

    public String convertNumber(final int inputNumber) {
        String result = convert(inputNumber, values());
        return result.isEmpty() ? valueOf(inputNumber) : result;
    }

    private String convert(int nbr, ConvertableNumber... enums) {
        StringBuilder result = new StringBuilder();
        Stream.of(enums)
                .filter(each -> isDivisibleBy(nbr, each.getValue()))
                .map(each -> getLabelIfDivisible(each.getValue()))
                .forEach(result::append);

        getDigits(nbr).stream()
                .map(ConvertableNumber::getLabelIfContains)
                .forEach(result::append);
        return result.toString();
    }


}
