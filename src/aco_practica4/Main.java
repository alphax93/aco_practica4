package aco_practica4;

import static aco_practica4.Primo.esPrimo;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Random;

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
        
        BigInteger a = new BigInteger("465675465116607065549");
        BigInteger b = new BigInteger(64,new Random());
        
        System.out.println("Big Integer = " + a);
        System.out.println("Big Integer = " + b);
        System.out.println("cccc" + ( new BigDecimal(Math.random())));
        PrimoBig.primoBig(a,10);
    }
}
