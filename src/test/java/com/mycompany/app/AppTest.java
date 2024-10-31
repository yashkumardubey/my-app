package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    public void testPrintHelloWorld() {
        // Redirect the output stream to capture the output
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        // Call the main method of App
        App.main(null);

        // Check the output
        assertEquals("Hello, World!\n", outContent.toString());
    }
}
