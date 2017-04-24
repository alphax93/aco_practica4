package aco_practica4;

public class Primo {
    public static boolean esPrimo(int n, int m){
        int[] b = new int[m];
        for(int j=0;j<b.length;j++){
            b[j]= (int) Math.random()*((n-1)-2+1)+2;
        }
        for(int i =0; i<m;i++){
            if(Math.pow(b[i],(n-1))%n !=1) return false;
            int j=1;
            int tmp=(int) Math.pow(2,j);
            while(tmp<n){
                int k=(n-1)/tmp; 
                if(k%1==0){
                    int valor= mcd( ((int) Math.pow(b[i], k))-1,n);
                    if(1< valor && valor<n)return false;
                }
                j++;
                tmp=(int) Math.pow(2,j);
            }
        }
        return true;
    }
    public static int mcd(int b, int n){
        if(n==0){
            return b;
        } else{
            return mcd(n, b%n);
        }
    }
}
