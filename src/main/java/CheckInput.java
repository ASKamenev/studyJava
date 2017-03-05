package main.java;

class CheckInput {
    static void choseOperation(int number1, String operation, int number2) {
        switch (operation) {
            case "+":
                Operations.calcFold(number1, number2);
                break;
            case "-":
                Operations.calcDeduct(number1, number2);
                break;
            case "*":
                Operations.calcMultiply(number1, number2);
                break;
            case "/":
                Operations.calcDivide(number1, number2);
                break;
        }
    }
}
