import Practice.JUnit.Vector2D;
import org.junit.Assert;
import org.junit.Test;

public class Vector2DTest {
    @Test
    public void newVectorShoudHaveZeroLenght() {
        Vector2D v1 = new Vector2D(); // action
        //assertion
        Assert.assertEquals(0,v1.lenght(),1e-9);
    }

    @Test
    public void newVectorShoudHaveZeroX() {
        Vector2D v1 = new Vector2D(); // action
        Assert.assertEquals(0,v1.getX(),1e-9);
    }

    @Test
    public void newVectorShoudHaveZeroY() {
        Vector2D v1 = new Vector2D(); // action
        Assert.assertEquals(0,v1.getY(),1e-9);
    }
}
