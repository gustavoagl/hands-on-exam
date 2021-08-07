/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradleproject1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import static javafx.scene.input.KeyCode.T;
import static jdk.nashorn.internal.runtime.regexp.joni.Syntax.Java;

/**
 *
 * @author Gustavo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] b = new int[10];
       
        int i3 = 0;
        for (int i = a.length - 1; i >= 0; i--) {
                b[i3++] = a[i];
        }
        for(int i2 = 0; i2 < b.length; i2++){
            System.out.println("B> "+b[i2]);   
        }

    }

}
