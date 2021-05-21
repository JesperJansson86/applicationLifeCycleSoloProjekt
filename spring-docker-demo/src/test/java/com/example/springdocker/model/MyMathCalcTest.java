package com.example.springdocker.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyMathCalcTest {
    MyMathCalc mmc = new MyMathCalc();
    @Test
    public void testAdd(){
        assertEquals(5,mmc.add(2,3));
        assertNotEquals(5,mmc.add(2,2));
    }
    @Test
    public void testMultiply(){
        assertEquals(20,mmc.multiply(5,4));
        assertNotEquals(20,mmc.multiply(3,30));
    }
    @Test
    public void testDivide(){
        assertEquals(4,mmc.divide(16,4));
        assertNotEquals(4,mmc.divide(4,4));
        assertThrows(Exception.class,(()-> mmc.divide(4,0)));

    }
}