/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devsucode.test;

import java.math.BigInteger;
import java.util.Arrays;

/**
 *
 * @author DELL
 */
public class Ejer3 {

    public boolean isPerfect(int n) {
        int sum = 0;
        int i = 1;
        while (i <= n / 2) {
            if (n % i == 0) {
                sum = sum + i;
            }
            i++;
        }
        return (sum == n);
    }

    public int findPerfectNumber(int x, int y) {
        int perfectNumber = -1;
        boolean isPerfect = false;
        while (!isPerfect && x <= y) {
            isPerfect = isPerfect(x);
            if (isPerfect) {
                perfectNumber = x;
            }
            x++;
        }
        return perfectNumber;
    }

    public int maximumElement(int a[]) {
        int max = Integer.MIN_VALUE;
        int menorSuma = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            int suma = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[j] != a[i]) {
                    suma = suma + a[j];
                }
            }
            if (suma <= menorSuma) {
                menorSuma = suma;
                if (a[i] > max) {
                    max = a[i];
                }
            }
            System.out.println(a[i] + "    la suma es:" + suma);

        }
        System.out.println("Respuesta " + max);
        return max;
    }
    

    
    
       public void arrayscreator(int size, int u){
           int diferent[] = new int[u];
           for (int i = 0; i < u; i++) {
             diferent[i]=i+1;
             int a[]=new int[size];
             for (int j = 0; j< size; j++) {
               a[j]=i+1;
           }
             System.out.println(Arrays.toString(a));
           }
       }
}
