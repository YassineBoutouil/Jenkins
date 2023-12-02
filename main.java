import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

// Classe principale pour le code de production.
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}

// Classe de test pour les tests unitaires.
public class CalculatorTest {

    @Test
    void testAddition() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3), "2 + 3 should be 5");
    }
}
