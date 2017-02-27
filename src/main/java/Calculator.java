package main.java;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type first number: ");
        Operations.number1 = sc.nextInt();

        System.out.print("operand: ");
        String operand = sc.next();

        System.out.print("Type second number: ");
        Operations.number2 = sc.nextInt();

        CheckInput.choseOperation(Operations.number1, operand, Operations.number2);

        System.out.println(Operations.number1 + " " + operand + " " + Operations.number2 + " = " + Operations.result);
    }
}
