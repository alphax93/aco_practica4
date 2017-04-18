package aco_practica4;

import static aco_practica4.Primo.esPrimo;


public class Main {
    public static void main(String[] args){
        if(esPrimo(561,10)){
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo"); 
        }
    }
}

