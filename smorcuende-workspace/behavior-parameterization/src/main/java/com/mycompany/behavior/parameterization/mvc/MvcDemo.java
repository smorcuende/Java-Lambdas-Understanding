package com.mycompany.behavior.parameterization.mvc;

import com.mycompany.behavior.parameterization.Apple;
import com.mycompany.behavior.parameterization.FirstAttemptDuplicateMethod;
import com.mycompany.behavior.parameterization.controller.ClientParametizationController;
import com.mycompany.behavior.parameterization.view.ClientParameterizationView;
import java.util.ArrayList;
import java.util.List;

public class MvcDemo {
    
    public static void main(String[] args) {
        Apple myApple1 = setAppleIN();
        Apple myApple2 = setAppleOUT();
        
        List<Apple> myApples = new ArrayList<Apple>();
            myApples.add(myApple1);
            myApples.add(myApple2);
        
        ClientParameterizationView view = new  ClientParameterizationView();
        ClientParametizationController controller = new ClientParametizationController(myApples, view);
        
        controller.showViewList(myApples);
    }
    
    private static Apple setAppleIN(){
        Apple apple = new Apple();
        apple.setColor("green");
        apple.setWeight(200);
        return apple;
    }
    
    private static Apple setAppleOUT(){
        Apple apple = new Apple();
        apple.setColor("red");
        apple.setWeight(10);
        return apple;
    }
    
}
