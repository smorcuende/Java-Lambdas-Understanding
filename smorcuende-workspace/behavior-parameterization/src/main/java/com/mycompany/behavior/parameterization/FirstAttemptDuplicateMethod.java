/**
 * Consecutive exercises to understand Java Lambdas
 * First exercise
 * This is a bad solution in order to understand Java Lambdas
 */
package com.mycompany.behavior.parameterization;

import java.util.ArrayList;
import java.util.List;

/**
 * Showing some best practices for making your code more flexible
 * In the context of a farm-inventory appication, you have to implement a functionality to filter green apples from a list
 * This class is the first attempt to do it
 */
public class FirstAttemptDuplicateMethod {
    
    public List<Apple> filterGreenApples(List<Apple> inventory){
        
        List<Apple> result = new ArrayList<>();
        
        for (Apple apple : inventory) {
            result.add(apple);
        }
        
        return result;
    }              
}
