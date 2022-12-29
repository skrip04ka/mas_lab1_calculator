package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NumberIdentifier numIdent = new NumberIdentifier();

        int signIndex;
        System.out.println("Write 'exit' for exit");

        while (true) {
            String line = sc.nextLine();

            if (line.equalsIgnoreCase("exit")) {
                break;
            }

            if (line.contains("+")) {
                signIndex = line.indexOf("+");
            } else if (line.contains("-")) {
                signIndex = line.indexOf("-");
            } else if (line.contains("*")) {
                signIndex = line.indexOf("*");
            } else if (line.contains("/")) {
                signIndex = line.indexOf("/");
            } else {
                System.out.println("Uncorrected sign" + "\n");
                continue;
            }

            String number1 = line.substring(0, signIndex);
            String sign = line.substring(signIndex, signIndex + 1);
            String number2 = line.substring(signIndex + 1);

            if (sign.equals("/") && number2.equals("0")) {
                System.out.println("Division by zero" + "\n");
                continue;
            }


            if (numIdent.isRomanNumber(number1) && numIdent.isRomanNumber(number2)) {

                RomanCalc calc = new RomanCalc(number1, number2);
                System.out.println("result: " + calc.run(sign) + "\n");

            } else if (numIdent.isArabicNumber(number1) && numIdent.isArabicNumber(number2)) {

                ArabicCalc calc = new ArabicCalc(number1, number2);
                System.out.println("result: " + calc.run(sign) + "\n");

            } else {
                System.out.println("Uncorrected format" + "\n");
            }

        }
    }
}
