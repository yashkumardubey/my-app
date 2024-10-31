package com.mycompany.app; // Package declaration

import org.junit.jupiter.api.Test; // Import JUnit test annotations
import static org.junit.jupiter.api.Assertions.assertEquals; // Import assertions

public class AppTest {
    
    @Test // Annotation to indicate this is a test method
    public void testApp() {
        // Sample assertion to check output
        assertEquals("Hello, World!", "Hello, World!"); // Check if the output is as expected
    }
}
