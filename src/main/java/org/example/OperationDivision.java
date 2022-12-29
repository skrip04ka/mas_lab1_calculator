package org.example;

public class OperationDivision implements Operation {

    @Override
    public int execute(int number1, int number2) {
        if (number2 !=0) {
            return number1 / number2;
        } else {
            System.out.println("Division by zero");
            return 0;
        }
    }
}
