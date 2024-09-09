import org.testng.annotations.Test;
import org.testng.Assert;

public class ExampleTest {

    @Test
    public void testAddition() {
        int a = 5;
        int b = 10;
        int result = a + b;
        Assert.assertEquals(result, 15, "Addition test failed!");
    }
}
