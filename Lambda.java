package com.mycompany.lambda;

public class Lambda {
    
    public interface CapeTown {
            public double calc(double p, double h, double w);
            //p*h/w
        }

    public static void main(String[] args) {
        
        CapeTown capeTown = (p, h,w)-> p* h /w;
        double result = capeTown.calc(10.0, 5.0, 2.0);
        System.out.println("Result: " + result);
        
    }
    
   
}
