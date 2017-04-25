package aco_practica4;

import java.math.BigDecimal;
import java.math.BigInteger;
import static java.math.BigInteger.ONE;
import static java.math.BigInteger.ZERO;

public class PrimoBig {
    
    private static BigDecimal TWOD = new BigDecimal("2");
    private static BigDecimal ONED = java.math.BigDecimal.ONE;
    private static BigInteger TWO = new BigInteger("2");
    
    public static boolean primoBig(BigInteger n, int m){
        BigInteger[] b = new BigInteger[m];
        for(int j=0;j<b.length;j++){
           b[j]=((new BigDecimal(Math.random()).multiply((((new BigDecimal(n)).subtract(ONED).subtract(TWOD).add(ONED)).add(TWOD))))).toBigInteger();
        }
        for(int i =0; i<m;i++){
            if(b[i].modPow(n.subtract(ONE),n)!=ONE) return false;
            int j = 1;
            BigInteger tmp = TWO.pow(j);
            while(tmp.compareTo(n)==-1){
                BigInteger k = (n.subtract(ONE)).divide(tmp);
                if(k.remainder(ONE).equals(ZERO)){
                    
                }
            }
        }
        return true;
    }
}
