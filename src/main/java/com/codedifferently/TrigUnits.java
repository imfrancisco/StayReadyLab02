 package com.codedifferently;

public class TrigUnits {
    private String mode = "Degrees";
    private String[] switchUnitMode = {"Degrees", "Radians"};

    
    public String switchUnitMode(){
        int i = 0;
        i++;
        if (i == 2){
            i =0;
        }
        return switchUnitMode[i];
    }

    public String getMode(){
        return mode;
    }
    
}