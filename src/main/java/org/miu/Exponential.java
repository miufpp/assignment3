package org.miu;

public class Exponential {
    public double power(double x, int n){
        if(n<0) throw new IllegalArgumentException("n should be a natural number");
        //base
        if(n==0) return 1;
        else{
            return x*power(x,n-1);
        }
    }

    public static void main(String[] args) {
        Exponential exp=new Exponential();
        System.out.println(exp.power(2, 10));
    }
}
