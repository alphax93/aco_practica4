package aco_practica4;

import static aco_practica4.Primo.esPrimo;


public class Main {
    public static void main(String arg){
        if(esPrimo(11,3)){
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo"); 
        }
    }
}

