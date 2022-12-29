package org.example;


public class ArabicCalc extends Calculation {

    public ArabicCalc(String num1, String num2) {
        this.num1 = Integer.parseInt(num1);
        this.num2 = Integer.parseInt(num2);
    }


    @Override
    public String action(Operation operation) {
        return String.valueOf(operation.execute(num1, num2));
    }

}
