package com.Learning.FirstProject;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void addingTwoNumbers(){
        var simpleCalc = new SimpleCalculator();
        assertEquals(10, simpleCalc.add(8,2));
    }

}