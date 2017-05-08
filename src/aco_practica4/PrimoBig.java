package aco_practica4;

import java.math.BigDecimal;
import java.math.BigInteger;
import static java.math.BigInteger.ONE;
import static java.math.BigInteger.ZERO;
import java.util.ArrayList;
import java.util.List;

public class PrimoBig {
    
    private static BigDecimal TWOD = new BigDecimal("2");
    private static BigDecimal ONED = java.math.BigDecimal.ONE;
    private static BigInteger TWO = new BigInteger("2");
    
    public static boolean primoBig(BigInteger n, int m){
        BigInteger[] b = new BigInteger[m];
        for(int j=0;j<b.length;j++){
           b[j]=((new BigDecimal(Math.random()).multiply((((new BigDecimal(n)).subtract(ONED).subtract(TWOD).add(ONED)).add(TWOD))))).toBigInteger();
        }
        List<BigInteger> k = new ArrayList<>();
        int j = 1;
        BigInteger tmp = TWO.pow(j);
        while(tmp.compareTo(n)==-1){
            BigInteger aux= (n.subtract(ONE)).divide(tmp);
            if(aux.remainder(ONE).equals(ZERO)){
                k.add(aux);
            }
            j++;
            tmp=TWO.pow(j);
        }
        for(int i =0; i<m;i++){
            
            if(!b[i].modPow(n.subtract(ONE),n).equals(ONE)) return false;
            for (BigInteger aux : k) {
                BigInteger valor= pot(b[i],aux).subtract(ONE).gcd(n);
                if(valor.compareTo(ONE)!=1 && valor.compareTo(n)!=-1)return false;   
            }
            
        }
        return true;
    }
    
    
    private static BigInteger pot(BigInteger base, BigInteger exp){
        BigInteger res = base;
        BigInteger aux=exp.subtract(ONE);
        while(!aux.equals(ZERO)){
            res=res.multiply(base);
            aux=aux.subtract(ONE);
            
        }
        return res;
    }
    
}
