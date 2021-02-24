/**
 * Consecutive exercises to understand Java Lambdas
 * Fouth exercise
 * This is a bad solution in order to understand Java Lambdas
 */
package com.mycompany.behavior.parameterization;

import java.util.ArrayList;
import java.util.List;

public class FourthAttemptAbstractCriteria {
    
    /**
     * It's separates the logic of iterating the collection inside the filterApples method with the behavior you want to apply
     * The predicate Object encapsulates the condition to test on an apple
     */
    public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate predicate){
        
        List<Apple> result = new ArrayList<>();
        for(Apple apple : inventory){
            if(predicate.test(apple)){
                result.add(apple);   
            }
        }
        
        return result;
    }
    
    
    
}
