package com.codedifferently;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TrigFunctionsTest {
    
    TrigFunctions trigFunctions;
    @Before
    public void setUp(){
        this.trigFunctions = new TrigFunctions();
    }

    @Test
    public void sineTest(){
        // Given
        double expected = 1.0;
        trigFunctions.setCurrentValue(90.0);

        // When
        double actual = trigFunctions.sine();

        // Then
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void cosineTest(){
        // Given
        double expected = 0.0;

        // When
        trigFunctions.setCurrentValue(270.0);
        double actual = trigFunctions.cosine();

        // Then
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void tangentTest(){
        // Given
        double expected = 1.0;
        
        // When 
        trigFunctions.setCurrentValue(45.0);
        double actual = trigFunctions.tangent();

        // Then
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void inverseSineTest(){
        
        trigFunctions.setCurrentValue(1);
        double expected = 0.017452406;
        double actual = trigFunctions.inverseSine();
    }

    @Test
    public void inverseCosineTest(){
        // Given
        double expected = 1.0;
        trigFunctions.setCurrentValue(30.0);

        //When
        double actual = trigFunctions.inverseCosine();

        // Then
       Assert.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void inverseTanTest(){
        // Given
        double expected = 0.017455065;
        trigFunctions.setCurrentValue(1.00);

        // When
        double actual = trigFunctions.inverseTan();

        // Then
        Assert.assertEquals(expected, actual, 0.001);
    }
}