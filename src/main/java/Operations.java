package main.java;

class Operations {
    static int number1, number2, result;

    static int calcDivide(int number1, int number2) {
        result = number1 / number2;

        return result;
    }

    static int calcFold(int number1, int number2) {
        result = number1 + number2;

        return result;
    }

    static int calcDeduct(int number1, int number2) {
        result = number1 - number2;

        return result;
    }

    static int calcMultiply(int number1, int number2) {
        result = number1 * number2;

        return result;
    }
}
