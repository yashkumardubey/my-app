package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AppTest {
    
    @Test
    public void testPerformOperation() {
        assertEquals(15.0, App.performOperation(5, 10, '+'));
        assertEquals(-5.0, App.performOperation(5, 10, '-'));
        assertEquals(50.0, App.performOperation(5, 10, '*'));
        assertEquals(0.5, App.performOperation(5, 10, '/'));
        
        // Test for division by zero
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            App.performOperation(5, 0, '/');
        });
        assertEquals("Division by zero is not allowed.", exception.getMessage());

        // Test for invalid operator
        exception = assertThrows(IllegalArgumentException.class, () -> {
            App.performOperation(5, 10, '%');
        });
        assertEquals("Invalid operator! Please use +, -, *, or /.", exception.getMessage());
    }
}
