package com.migu.csdexercise.numberchains;

import java.util.Arrays;
import java.util.Collections;

class NumberChains {
    private String input;

    NumberChains(String input) {
        this.input = input;
    }

    private long calChainLength(Long lastResult) {
        String strLastResult = String.valueOf(lastResult);
        char[] chardigitsAsc = strLastResult.toCharArray();
        Integer[] intDigitsAsc = new Integer[chardigitsAsc.length];
        Integer[] intDigitsDesc = new Integer[chardigitsAsc.length];

        for (int i = 0; i < chardigitsAsc.length; i++) {
            intDigitsAsc[i] = chardigitsAsc[i] - '0';
            intDigitsDesc[i] = chardigitsAsc[i] - '0';
        }
        Arrays.sort(intDigitsAsc);
        Arrays.sort(intDigitsDesc);
        Collections.reverse(Arrays.asList(intDigitsDesc));


        char[] chardigitsDesc = new char[chardigitsAsc.length];
        for (int i = 0; i < chardigitsAsc.length; i++) {
            chardigitsAsc[i] = (char) (intDigitsAsc[i] + '0');
            chardigitsDesc[i] = (char) (intDigitsDesc[i] + '0');
        }

        String strDigitAsc = new String(chardigitsAsc);
        String strDigitDesc = new String(chardigitsDesc);
        Long longDigitAsc = Long.parseLong(strDigitAsc);
        Long longDigitDesc = Long.parseLong(strDigitDesc);
        return longDigitDesc - longDigitAsc;
    }

    long calChainLength() {
        Long lastResult = calChainLength(Long.parseLong(input));
        Long newResult = 0L;
        Long chainNumber = 1L;

        do {
            if (chainNumber > 1) {
                lastResult = newResult;
            }
            chainNumber++;
            newResult = calChainLength(lastResult);
        }
        while (!newResult.equals(lastResult));

        return chainNumber;
    }
}
