package com.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class MemoryTest {
    @Test
    public void addToMemoryTest(){
        // Given
        Memory memory = new Memory();
        double expected = 2.0;

        // When
        memory.addToMemory(2.0);
        double actual = memory.recallMemory();
        
        // Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void resetMemoryTest(){
        // Given
        Memory memory = new Memory();
        double expected = 0.0;
    
        // When
        memory.resetMemory();

        // Then
        double actual = memory.recallMemory();
        Assert.assertEquals(expected, actual, 0.0);
    }
}