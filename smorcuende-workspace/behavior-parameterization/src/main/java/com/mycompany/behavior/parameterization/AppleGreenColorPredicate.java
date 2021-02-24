/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package com.mycompany.behavior.parameterization;


public class AppleGreenColorPredicate implements ApplePredicate {
    
    public boolean test (Apple apple){
     
        return apple.getColor().equals("green");
    }
    
}
