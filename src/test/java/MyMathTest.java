import Practice.JUnit.MyMath;
import org.junit.Test;

public class MyMathTest {
    @Test(expected = ArithmeticException.class)
    public void CheckZeroDenominator(){
        MyMath.divide(4,0);
    }
}
