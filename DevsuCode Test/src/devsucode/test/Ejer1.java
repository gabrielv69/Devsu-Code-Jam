/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devsucode.test;

import java.util.Arrays;

/**
 *
 * @author DELL
 */
public class Ejer1 {
    int serie[]= new int[255];
    public void construirSerie(int inicio1, int inicio2, int patron1, int patron2){
        
        serie[0]=inicio1;
        serie[1]=inicio2;
        for (int i = 2; i <serie.length; i++) {
            if (i%2==0) {
                serie[i]= serie[i-2]+patron1;
            }else{
                serie[i]= serie[i-2]+patron2;
            }
        }
        System.out.println(Arrays.toString(serie));
    }
    
    public int sumaElementos(int a, int b){
        int resultado = -1;
        if(a<1 || a>255 || b<1||b>255){
           return resultado; 
        }else{
            resultado = serie[a-1]+serie[b-1];
    }
        return resultado;
    }
}
