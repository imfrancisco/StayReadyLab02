package com.codedifferently;

import java.lang.Math;

public class TrigFunctions extends SciCalculator{

    public double sine(){
        return Math.sin(Math.toRadians(getCurrentValue()));
    }

    public double cosine(){
        return Math.cos(Math.toRadians(getCurrentValue()));
    }

    public double tangent(){
        return Math.tan(Math.toRadians(getCurrentValue()));
    }

    public double inverseSine(){
        return Math.asin(Math.toRadians(getCurrentValue()));
    }
  
    public double inverseCosine(){
        return Math.acos(Math.toRadians(getCurrentValue()));
    }

    public double inverseTan(){
        return Math.atan(Math.toRadians(getCurrentValue()));
    }
}