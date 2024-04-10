package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        assertEquals(6.4f,Calculator.add(3.1f,3.3f),0.0001);
    }

    @Test
    void subtract() {
        assertEquals(5,Calculator.subtract(7.5f,2.5f),0.0001);
    }

    @Test
    void divide() {
        assertEquals(5,Calculator.divide(25.0f,5.0f),0.0001);
        assertThrows(IllegalArgumentException.class,() -> Calculator.divide(5f,0f));
    }

    @Test
    void multiply() {
        assertEquals(0,Calculator.multiply(0.0f,5.0f),0.0001);
        assertEquals(-10,Calculator.multiply(2.0f,-5.0f),0.0001);

    }
}