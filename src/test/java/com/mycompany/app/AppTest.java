package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testAddition() {
        assertEquals(5.0, App.performOperation(2.0, 3.0, '+'));
    }

    @Test
    public void testSubtraction() {
        assertEquals(1.0, App.performOperation(3.0, 2.0, '-'));
    }

    @Test
    public void testMultiplication() {
        assertEquals(6.0, App.performOperation(2.0, 3.0, '*'));
    }

    @Test
    public void testDivision() {
        assertEquals(2.0, App.performOperation(6.0, 3.0, '/'));
    }

    @Test
    public void testDivisionByZero() {
        assertTrue(Double.isNaN(App.performOperation(6.0, 0.0, '/')));
    }

    @Test
    public void testInvalidOperator() {
        assertTrue(Double.isNaN(App.performOperation(6.0, 3.0, '%')));
    }
}
