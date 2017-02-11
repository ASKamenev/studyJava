

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andrew
 */
public class Calculator {
    static int number1, number2, result;
    static String operand;
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter first number: ");
        number1 = userInput.nextInt();
        System.out.println("Enter operand: ");
        operand = userInput.next();
        System.out.println("Enter second number: ");
        number2 = userInput.nextInt();
        choseOperation();
        
        System.out.println(result);
        
    }
    public static int calcDivide() {
        result = number1 / number2;
        return (result); 
    }
    public static int calcFold() {
        result = number1 + number2;
        return (result);
    }
    public static int calcDeduct() {
        result = number1 - number2;
        return (result);
    }
    public static int calcMultiply() {
        result = number1 * number2;
        return (result);
    }
    public static void choseOperation() {
        switch(operand) {
            case "+":
                calcFold();
            case "-":
                calcDeduct();
            case "*":
                calcMultiply();
            case "/":
                calcDivide();
        }
                
    }
            
        
}
