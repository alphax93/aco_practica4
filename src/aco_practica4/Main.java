package aco_practica4;

import static aco_practica4.Primo.esPrimo;

public class Main {

    public static void main(String[] args) {

        int i = 0;
        int n,m;
        while (i<20) {
            n= 1+(int)(Math.random()*((1000-1)+1));
            m = 1+(int)(Math.random()*((10-1)+1));
            if(m>n) continue;
            if(n%2==0)n++;
            System.out.println("Numero = " + n);
            System.out.println("m = " + m);
            double p = 1 - Math.pow(2, -m);
            if (esPrimo(n, m)) {
                System.out.println("La probabilidad de que sea primo es: " + p);
                System.out.println("Es primo");
            } else {
                System.out.println("No es primo");
            }
            i++;
            System.out.println("----------------------------------------------");
        }
    }
}
