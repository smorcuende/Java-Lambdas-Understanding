/**
 * Consecutive exercises to understand Java Lambdas
 * Second exercise
 * This is a bad solution in order to understand Java Lambdas
 */
package com.mycompany.behavior.parameterization;

import java.util.ArrayList;
import java.util.List;

public class SecondAttemptParameterizinColor {
    
    /*
    * It is filtering if the apple's colour is the specific one that we will pass (for example color = green)
    */
    public static List<Apple> filterApplesByColor(List<Apple> inventory, String color){
        
        List<Apple> result = new ArrayList<>();
        
        for(Apple apple : inventory){
            
            if (apple.getColor().equals(color)){
                result.add(apple);
            }
        }
        
        return result;
    }
    
    /*
    * It is filtering if the apple's weight is bigger than the specific limit that we will pass (for example weight = 150)
    */  
    public List<Apple> filterApplesByWeight(List<Apple> inventory, int weight){
        
        List<Apple> result = new ArrayList<>();
        
        for(Apple apple : inventory){
            
            if(apple.getWeight() > weight){
                result.add(apple);
            }
            
        }
        
        return result;    
    }
    
}
