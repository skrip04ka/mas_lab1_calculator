package org.example;

import java.util.Arrays;

public class RomanCalc extends Calculation {

    public RomanCalc(String num1, String num2) {

        this.num1 = RomanToInt(num1);
        this.num2 = RomanToInt(num2);
    }

    @Override
    public String action(Operation operation) {
        return IntToRoman(operation.execute(num1, num2));
    }

    private final String[] units = {
            "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"
    };

    private final String[] dozen = {
            "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC", "C"
    };

    private int RomanToInt (String RomanNum) {
        int res = Arrays.asList(units).indexOf(RomanNum);

        if (res == -1) {
            for (int i = 10; i<=100; i++) {
                if (IntToRoman(i).equals(RomanNum)) {
                    res = i;
                }
            }
        }
        return res;
    }

    private String IntToRoman (int num) {
        if (num > 0 && num <= 100) {
            return dozen[num/10] + units[num%10];

        } else if (num <= 0) {
            return "Non-positive result";
        } else {
            return "Number outside the range";
        }
    }
}
