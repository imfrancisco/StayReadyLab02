package com.codedifferently;

import org.junit.Before;
import org.junit.Assert;
import org.junit.Test;

public class DisplayModeTest {

    DisplayMode aDisplayMode;
    @Before
    public void setup(){
        this.aDisplayMode = new DisplayMode();
    }

    @Test
    public void switchDisplayModeTest(){
        // Given
        String expected = "decimal";
        
        // When
        String displayMode = aDisplayMode.getMode();
        String actual = displayMode;

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getModeTest(){
        // Given
        String expected = aDisplayMode.getMode();
        
        // When
        String actual = aDisplayMode.getMode();

        // Then
        Assert.assertEquals(expected, actual);
    }
}