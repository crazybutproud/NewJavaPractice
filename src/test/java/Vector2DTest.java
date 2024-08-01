import Practice.JUnit.Vector2D;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Vector2DTest {
    private final double EPS = 1e-9;
    private static Vector2D v1;

    @BeforeClass
    public static void CreateNewVector() {
        v1 = new Vector2D();
    }
    @Test
    public void newVectorShoudHaveZeroLenght() {
        //assertion
        Assert.assertEquals(0,v1.lenght(),EPS);
    }

    @Test
    public void newVectorShoudHaveZeroX() {
        Assert.assertEquals(0,v1.getX(),EPS);
    }

    @Test
    public void newVectorShoudHaveZeroY() {
        Assert.assertEquals(0,v1.getY(),EPS);
    }
}
