/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradleproject1;

/**
 *
 * @author Gustavo
 */
public class NumeroPrimo {
  public static void main(String[] args) {    
        for (int i = 2; i <= 10; i++) {
            if( ehPrimo(i) )
                System.out.println(i + " é primo.");
        }    
    }
 
    private static boolean ehPrimo(int numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0)
                return false;   
        }
        return true;
    }
    
}
