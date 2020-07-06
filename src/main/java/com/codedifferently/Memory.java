package com.codedifferently;

public class Memory {

    private double memoryValue;

    public void addToMemory(double mem){
        memoryValue = mem;
    };

    public double recallMemory(){
        return memoryValue;
    }

    public double resetMemory(){ 
        return 0.0;
    }
}