/**
 * Consecutive exercises to understand Java Lambdas
 * Third exercise
 * This is a bad solution in order to understand Java Lambdas
 */
package com.mycompany.behavior.parameterization;

import java.util.ArrayList;
import java.util.List;

public class ThirdAttemptEveryAttribute {
    
    /*
    * It is filtering if the apple's colour is the specific one that we will pass (for example color = green)
    * OR
    * It is filtering if the apple's weight is bigger than the specific limit that we will pass (for example weight = 150)
    */
    public static List<Apple> filterApples(List<Apple> inventory, String color, int weight){
        
        List<Apple> result = new ArrayList<>();
        
        for(Apple apple : inventory) {
            if( apple.getColor().equals(color) ||
                apple.getWeight() > weight){
                result.add(apple);
            }
            
        }
        
        return result;
    }
    
}
