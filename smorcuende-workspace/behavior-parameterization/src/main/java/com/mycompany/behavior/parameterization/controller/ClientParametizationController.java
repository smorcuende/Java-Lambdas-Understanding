package com.mycompany.behavior.parameterization.controller;

import com.mycompany.behavior.parameterization.Apple;
import com.mycompany.behavior.parameterization.SecondAttemptParameterizinColor;
import com.mycompany.behavior.parameterization.view.ClientParameterizationView;
import java.util.List;


public class ClientParametizationController {
    
    private ClientParameterizationView view;
    
    public ClientParametizationController(  List<Apple> apples, 
                                            ClientParameterizationView view) 
    {
        this.view = view;
    }
   
    public void showView(Apple apple){
        view.clientView(apple);
    }
    
    public void showViewList(List<Apple> myApples){

        SecondAttemptParameterizinColor second = new SecondAttemptParameterizinColor();
        List<Apple> filteredApples = second.filterApplesByWeight(myApples, 150);
        
        view.clientViewList(filteredApples);
    }
    
}
