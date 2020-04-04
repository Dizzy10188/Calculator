import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestCalculator {

    @Test
    void testAdd() {
        assertEquals(3.0, Calculator.Add(1.5, 1.5));
    }

    @Test
    void testSubtract() {
        assertEquals(3.0, Calculator.Subtract(4.5, 1.5));
    }

    @Test
    void testMultiply() {
        assertEquals(9.0, Calculator.Multiply(3.0, 3.0));
    }

    @Test
    void testDivide() {
        assertEquals(3.0, Calculator.Add(6.0, 2.0));
    }
}
