package com.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class CoreFeaturesTest {

    @Test
    public void addTest(){
        // Given
        CoreFeatures coreFeatures = new CoreFeatures();
        double expected = 4.0;

        // When
        double actual = coreFeatures.add(4.0);

        // Then
        Assert.assertEquals(expected, actual, 0.0);

    }

    @Test
    public void subtractTest(){
        // Given
        CoreFeatures coreFeatures = new CoreFeatures();
        double expected = 5.0;
        coreFeatures.setCurrentValue(6.0);
        
        // When
        double actual = coreFeatures.subtract(1.0);

        // Then
        Assert.assertEquals(expected, actual, 0.0);
    }
    
    @Test
    public void divideTest(){
        // Given
        CoreFeatures coreFeatures = new CoreFeatures();
        double expected = 4.0;
        coreFeatures.setCurrentValue(12.0);

        // When
        double actual = coreFeatures.divide(3.0);

        // Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void multiplyTest(){
        // Given
        CoreFeatures coreFeatures = new CoreFeatures();
        double expected = 16.0;
        coreFeatures.setCurrentValue(4.0);

        // When
        double actual = coreFeatures.multiply(4.0);

        // Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void expTest(){
        // Given
        CoreFeatures coreFeatures = new CoreFeatures();
        double expected = 16.0;
        coreFeatures.setCurrentValue(2.0);

        // When
        double actual = coreFeatures.exp(4.0);

        // Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void squareTest(){
        // Given
        CoreFeatures coreFeatures = new CoreFeatures();
        double expected = 16.0;
        coreFeatures.setCurrentValue(4.0);

        // When
        double actual = coreFeatures.square(2.0);

        // Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void squareRootTest(){
        // Given
        CoreFeatures coreFeatures = new CoreFeatures();
        double expected = 4.0;
        coreFeatures.setCurrentValue(16.0);

        // When
        double actual = coreFeatures.squareRoot(16.0);

        //Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void inverseTest(){
        // Given
        CoreFeatures coreFeatures = new CoreFeatures();
        double expected = 0.2;
        coreFeatures.setCurrentValue(5.0);

        // When
        double actual = coreFeatures.inverse(5.0);


        // Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void invertSignTest(){
        // Given
        CoreFeatures coreFeatures = new CoreFeatures();
        double expected = -5.0;
        coreFeatures.setCurrentValue(5.0);

        // When
        double actual = coreFeatures.invertSign(5.0);

        // Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void cubeRootTest(){
        // Given
        CoreFeatures coreFeatures = new CoreFeatures();
        double expected = 4.0;
        coreFeatures.setCurrentValue(64.0);

        // When
        double actual = coreFeatures.cubeRoot(64.0);

        //Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test 
    public void log10Test(){
        // Given
        CoreFeatures coreFeatures = new CoreFeatures();
        coreFeatures.setCurrentValue(10.0);
        double expected = 1.0;

        // When
        double actual = coreFeatures.log10(10.0);
        
        // Then
        Assert.assertEquals(expected, actual, 0.0);
    }
}