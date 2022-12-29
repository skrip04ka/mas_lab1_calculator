package org.example;

abstract class Calculation {

    int num1;
    int num2;

    public String run(String sign){
        switch (sign) {
            case "+" -> {
                return action(new OperationAddition());
            }
            case "-" -> {
                return action(new OperationSubtraction());
            }
            case "/" -> {
                return action(new OperationDivision());
            }
            case "*" -> {
                return action(new OperationMultiplication());
            }
        }

        return "Uncorrected sign" + "\n";
    }

    public abstract String action(Operation operation);

}
