package com.migu.csdexercise.legacycode.chapter25.y;

public class Reservation {
    private static final int PREMIUM_RATE_ADJ = 0;
    private static final int SURCHARGE = 0;

    public int calculateHandlingFee(int amount) {
        int result = 0;
        if (amount > 100) {
            result += getBaseFee(amount);
        } else {
            //result += (amount * PREMIUM_RATE_ADJ) + SURCHARGE;
            result += getPremiumFee(amount);
        }
        return result;
    }

    private int getPremiumFee(int amount) {
        return (amount * PREMIUM_RATE_ADJ) + SURCHARGE;
    }

    private int getBaseFee(int amount) {
        return 0;
    }
}
