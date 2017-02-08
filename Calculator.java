

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
    
    public static void main(String[] args) {
        int number1, number2, result = 0;
        String operation;
        Scanner sc = new Scanner(System.in);
     
        System.out.println("Enter the first number: ");
         number1 = sc.nextInt();
         
         System.out.println("Enter the second number: ");
         number2 = sc.nextInt();
         
        System.out.println("What do you want to do? ");
        operation = sc.next();
        
        while (operation != "+") {
            
           System.out.println("again");
            
           
       }
              
        switch(operation) {
           case ("+"):               
               result = number1 + number2;
               break;
           case "-":    
               result = number1 - number2;
               break;
           case "*":    
               result = number1 * number2;
               break;
           case "/":    
               result = number1 / number2;
               break;
        }
       
        
        System.out.println(number1 + operation + number2 + "=" + result);
    }
        
}
