import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
    @Test
    public void DivideNumbers()
    {
        int a = 4;
        int b = 2;

        Calculator calculator = new Calculator();
        int result = calculator.Calculate(a, b);

        Assert.assertEquals(result, 2);
    }
}
