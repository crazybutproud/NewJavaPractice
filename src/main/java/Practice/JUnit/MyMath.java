package Practice.JUnit;

public class MyMath {
    public static double divide(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Cant divide by zero");
        }
        return num1 / num2;
    }
}
