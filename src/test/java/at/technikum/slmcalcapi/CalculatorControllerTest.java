package at.technikum.slmcalcapi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorControllerTest {

    @Test
    void sumTest1() {
        // Arrange
        CalculatorController calculatorController
                = new CalculatorController();
        int a = 5;
        int b = 4;

        // Act
        int result = calculatorController.sum(a, b);

        // Assert
        assertEquals(9, result);
    }

    @Test
    void sumTest2() {
        CalculatorController calculatorController
                = new CalculatorController();

        assertEquals(-8, calculatorController.sum(-2, -6));
    }

    @Test
    void sumTest3() {
        CalculatorController calculatorController
                = new CalculatorController();

        assertEquals(4, calculatorController.sum(-2, 6));
    }

    @Test
    void willFail() {
        assertTrue(false);
    }
}