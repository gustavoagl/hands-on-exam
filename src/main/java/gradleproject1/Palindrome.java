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
public class Palindrome {
static boolean palindrome(String a)
        
    {
        
 
        int i = 0, j = a.length() - 1;
 
        while (i < j) {
 
            if (a.charAt(i) != a.charAt(j))
                return false;
 
            i++;
            j--;
        }
 
        return true;
    }
 
    public static void main(String[] args)
    {
        String a = "ANA";
 
        if (palindrome(a))
            System.out.print("I think you name are palindrome " + a );
        else
            System.out.print("Sorry you name its not a palindrome");
    }
}