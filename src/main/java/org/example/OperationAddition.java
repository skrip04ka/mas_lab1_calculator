package org.example;

public class OperationAddition implements Operation {

    @Override
    public int execute(int number1, int number2) {
        return number1 + number2;
    }
}
