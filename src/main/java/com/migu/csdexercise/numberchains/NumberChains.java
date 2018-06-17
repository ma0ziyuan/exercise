package com.migu.csdexercise.numberchains;

class NumberChains {
    private String input;

    NumberChains(String input) {
        this.input = input;
    }

    private long calChainLength(long lastResult) {
        String strLastResult = String.valueOf(lastResult);
        char[] chardigitsAsc = strLastResult.toCharArray();
        char[] chardigitsDesc = new char[chardigitsAsc.length];
        int[] intDigitsAsc = new int[chardigitsAsc.length];
        int[] intDigitsDesc = new int[chardigitsAsc.length];
        for (int i = 0; i < chardigitsAsc.length; i++) {
            intDigitsAsc[i] = chardigitsAsc[i];
            intDigitsDesc[i] = chardigitsAsc[i];
        }
        bubbleSortAsc(intDigitsAsc);
        bubbleSortDesc(intDigitsDesc);
        for (int i = 0; i < chardigitsAsc.length; i++) {
            chardigitsAsc[i] = (char) intDigitsAsc[i];
        }
        for (int i = 0; i < chardigitsDesc.length; i++) {
            chardigitsDesc[i] = (char) intDigitsDesc[i];
        }
        String strDigitAsc = String.valueOf(chardigitsAsc);
        String strDigitDesc = String.valueOf(chardigitsDesc);
        long longDigitAsc = Long.parseLong(strDigitAsc);
        long longDigitDesc = Long.parseLong(strDigitDesc);
        return longDigitDesc - longDigitAsc;
    }

    long calChainLength() {
        long lastResult = calChainLength(Long.parseLong(input));
        long newResult=0;
        long chainNumber = 1;
        do {
            if (chainNumber>1)  lastResult=newResult;
            chainNumber++;
            newResult= calChainLength(lastResult);
        } while ((newResult!=lastResult));
        return chainNumber;
    }

    private void bubbleSortDesc(int[] arrayToSort) {
        for (int i = 0; i < arrayToSort.length; i++) {
            for (int j = i + 1; j < arrayToSort.length; j++) {
                if (arrayToSort[i] < arrayToSort[j]) {
                    int tmp = arrayToSort[i];
                    arrayToSort[i] = arrayToSort[j];
                    arrayToSort[j] = tmp;
                }
            }
        }
    }

    private void bubbleSortAsc(int[] arrayToSort) {
        for (int i = 0; i < arrayToSort.length; i++) {
            for (int j = i + 1; j < arrayToSort.length; j++) {
                if (arrayToSort[i] > arrayToSort[j]) {
                    int tmp = arrayToSort[i];
                    arrayToSort[i] = arrayToSort[j];
                    arrayToSort[j] = tmp;
                }
            }
        }
    }
}
