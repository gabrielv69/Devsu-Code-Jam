/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devsucode.test;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 *
 * @author DELL
 */
public class Ejer2 {

    //rooms=[1,2,7,4,2]
    public int pointMax(int bar[]) {
        int maxSum = 0;
        int suma = 0;
        for (int i = 0; i < bar.length; i++) {
            for (int j = i + 2; j < bar.length; j++) {
                suma = bar[i] + bar[j];
                if (i == 0 && j == bar.length) {
                    suma = -1;
                }
                if (suma > maxSum) {
                    maxSum = suma;
                }
            }
        }
        return maxSum;
    }

    public int maxArea(int bar[]) {
        int maxArea = 0, ancho = 0, minLado = 0, area = 0;
        for (int i = 0; i < bar.length; i++) {
            for (int j = i + 1; j < bar.length; j++) {
                minLado = bar[i];
                if (bar[j] < bar[i]) {
                    minLado = bar[j];
                }
                ancho = (j - i) * 2;
                area = minLado * ancho;
                if (area > maxArea) {
                    maxArea = area;
                }
            }
        }
        return maxArea;

    }

    public boolean frogs(int saltos[]) {
        boolean complete = true;
        for (int i = 0; i < saltos.length; i++) {
            if (saltos[i] == 0) {
                if (i == 0) {
                    return false;
                }
                for (int j = i - 1; j <= 10; j--) {
                    if (j < 0) {
                        break;
                    }
                    if (saltos[j] > (i - j)) {
                        complete = true;
                        break;
                    } else {
                        complete = false;
                    }
                }
            }
        }
        return complete;
    }

    public int momentum(int damage[], int victories[], int c) {
        int maxMomentum = 0, momentum = 0;
        for (int i = 1; i <= c; i++) {
            for (int j = 0; j < victories.length; j++) {
                momentum = victories[j] * damage[j];
                if (momentum > maxMomentum) {
                    maxMomentum = momentum;
                }
            }
        }

        return maxMomentum;
    }

    public int uniqueWays(String source, String target) {
        int ways = 0;
        char targetCharacters[] = new char[target.length()];
        for (int i = 0; i < targetCharacters.length; i++) {
            targetCharacters[i] = target.charAt(i);
        }
        for (int k = 0; k < source.length(); k++) {
            String equal = "";
            //if (source.charAt(k) == target.charAt(0)) {
                for (int j = 0; j < targetCharacters.length; j++) {
                    for (int i = k; i < source.length(); i++) {
                        if (targetCharacters[j] == source.charAt(i)) {
                            equal = equal + targetCharacters[j];
                            break;
                        }
                    }
                }
                if (equal.equalsIgnoreCase(target)) {
                    ways = ways + 1;
                }
           // }
        }
        return ways;
    }

}
