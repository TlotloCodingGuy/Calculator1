/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.calculator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class CalculatorTest {
    
    public CalculatorTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of add method, of class Calculator.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int num1 = 0;
        int num2 = 0;
        Calculator instance = new Calculator();
        int expResult = 0;
        int result = instance.add(num1, num2);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of subtract method, of class Calculator.
     */
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        int num1 = 0;
        int num2 = 0;
        Calculator instance = new Calculator();
        int expResult = 0;
        int result = instance.subtract(num1, num2);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of multiply method, of class Calculator.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        int num1 = 0;
        int num2 = 0;
        Calculator instance = new Calculator();
        int expResult = 0;
        int result = instance.multiply(num1, num2);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of divide method, of class Calculator.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        int num1 = 0;
        int num2 = 0;
        Calculator instance = new Calculator();
        int expResult = 0;
        int result = instance.divide(num1, num2);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of main method, of class Calculator.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Calculator.main(args);
        
    }
    
}
