/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devsucode.test;

/**
 *
 * @author DELL
 */
public class Ejer5 {
    public String aeri( int a){
        String[] aeriMob = new String[a];
        aeriMob[a-1]= "(-_-)";
        aeriMob[0]= "(-_";
        String join = String.join("", aeriMob);
        return join;
    }
}
