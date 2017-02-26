/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator;

import static Calculator.Operations.*;

/**
 *
 * @author andrew
 */
public class CheckInput {
    
     public static void choseOperation(String operation) {
        switch(operation) {
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
