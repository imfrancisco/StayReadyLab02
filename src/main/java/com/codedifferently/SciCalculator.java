package com.codedifferently;

/** 
 * Hello world!
 *
 */
public class SciCalculator 
{
    private double currentValue =  0.0;
    private DisplayMode displayMode;
    private TrigFunctions trigFunctions;
    private Memory memory;
    private CoreFeatures coreFeatures;
    // private TrigUnits trigUnits = new TrigUnits();
   
    public void SciCalculator(){
        this.displayMode = new DisplayMode();
        this.trigFunctions = new TrigFunctions();
        this.memory = new Memory();
        this.coreFeatures = new CoreFeatures();
    }

    public double getCurrentValue(){
        return currentValue;
    }

    public DisplayMode getDisplayMode(){
        return displayMode;
    }

    public TrigFunctions getTrigFunctions(){
        return trigFunctions;
    }
    
    public Memory getMemory(){
        return memory;
    }

    public CoreFeatures getCoreFeatures(){
        return coreFeatures;
    }

    // // public TrigUnits getTrigUnits(){
    // //     return trigUnits; 
    // // }

    public void setCurrentValue(double num){
        currentValue = num;
    }
    
       
    public static void main( String[] args ){

        System.out.println("Hi! Welcome!");
        System.out.println("Please Enter a number");        
    }
}
