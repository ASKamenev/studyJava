package Calculator;



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
    static String operand;
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Type first number");
        Operations.number1 = sc.nextInt();
         
        System.out.println("operand");
        operand = sc.next();
        
        System.out.println("Type second number");
        Operations.number2 = sc.nextInt();
        
        CheckInput.choseOperation(operand);
      
        System.out.println(Operations.number1 + " " + operand + " " + Operations.number2 + " = " + Operations.result);
   
    }
         
        
}
