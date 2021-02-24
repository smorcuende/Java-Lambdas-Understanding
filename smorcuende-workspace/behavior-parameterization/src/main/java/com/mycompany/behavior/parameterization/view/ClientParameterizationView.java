package com.mycompany.behavior.parameterization.view;

import com.mycompany.behavior.parameterization.Apple;
import java.util.List;

public class ClientParameterizationView {
    
    public void clientView (Apple apple) {
        System.out.println("**** Filtra las manzanas ****");
	System.out.println("Me pasan el color: " + apple.getColor());
	System.out.println("Me pasan el peso: " + apple.getWeight());
    }
    
    public void clientViewList (List<Apple> appleList) {
        System.out.println("**** Manzanas filtradas ****");
        int cont = 1;
        for(Apple apple : appleList){
            System.out.println("Manzana " + cont + " - su color es: " + apple.getColor());
            System.out.println("Manzana " + cont + " - su peso es: " + apple.getWeight());
            System.out.println("Si esta manzana aparece aquí es porque cumple con los filtros");
            cont++;
        }
    }
    
}
