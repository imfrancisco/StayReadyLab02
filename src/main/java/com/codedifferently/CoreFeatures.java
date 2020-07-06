package com.codedifferently;

public class CoreFeatures extends SciCalculator{

        public double add(double num){
           return getCurrentValue() + num;   
        }
    
        public double subtract(double num){
            return getCurrentValue() - num;
        }
    
        public double divide(double num){
            return getCurrentValue() / num;
        }
    
        public double multiply(double num){
            return getCurrentValue() * num;
        }

        public double exp(double num){
            return Math.pow(getCurrentValue(), num);
        }

        public double square(double num){
            return getCurrentValue() * getCurrentValue();
        }

        public double squareRoot(double num){
            return Math.sqrt(getCurrentValue());
        }

        public double inverse(double num){  
            return 1/getCurrentValue();  
        }

        public double invertSign(double num){
            return getCurrentValue()* -1;
        }

        public double cubeRoot(double num){
            return Math.cbrt(getCurrentValue());
        }

        public double log10(double num){
            return Math.log10(getCurrentValue());
        }

}