/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator;

public class Operations {
    
    static int number1, number2, result;
     
    public static int calcDivide(int number1, int number2) {
        result = number1 / number2;
        return (result); 
    }
    public static int calcFold(int number1, int number2) {
        result = number1 + number2;
            return (result);
    }
    public static int calcDeduct(int number1, int number2){
        result = number1 - number2;
        return (result);
    }
    public static int calcMultiply(int number1, int number2) {
        result = number1 * number2;
        return (result);
    }
    
}
