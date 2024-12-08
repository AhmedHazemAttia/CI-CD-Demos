package com.Learning.FirstProject;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void addingTwoNumbers(){
        var simpleCalc = new SimpleCalculator();
        assertEquals(8, simpleCalc.add(4,4));
    }

}