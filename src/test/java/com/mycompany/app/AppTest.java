package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    public void testHelloWorld() {
        String expectedOutput = "Hello, World!";
        
        // Capture the output of the main method
        String output = captureOutput(() -> App.main(new String[] {}));
        
        assertEquals(expectedOutput, output.trim());
    }

    private String captureOutput(Runnable runnable) {
        // Redirect System.out to capture the output
        java.io.ByteArrayOutputStream outputStream = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outputStream));
        
        runnable.run();
        
        // Restore original System.out
        System.setOut(System.out);
        
        return outputStream.toString();
    }
}
