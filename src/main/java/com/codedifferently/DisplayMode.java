package com.codedifferently;

public class DisplayMode extends SciCalculator{
    int i = 0;
    private String[] displayModeList = {"binary", "octal", "decimal", "hexadecimal"};

    private String whichMode = "decimal";

    public String switchDisplayMode(){
        int i = 1;
        i++;
        if (i == 4){
            i = 0;
        }
        return displayModeList[i];
    }

    public String getMode(){
        return whichMode;
    }
}