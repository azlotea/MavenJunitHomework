import org.junit.Assert;
import org.junit.Test;

public class ExpertTest {
    public Expert expertCalc = new Expert();

    //positive test for pow(int numar, int exp) method
    @Test
    public void testPowIntPositive() {
        int rez = expertCalc.pow(2, 3);
        Assert.assertEquals(8, rez);
    }

    //negative test for pow(double numar, int exp) method
    @Test
    public void testPowDoubleNegative () {
        double rez = expertCalc.pow(4.0, 2);
        Assert.assertNotEquals(4, rez);
    }

    //positive test for fact(int numar) method;
    @Test
    public void testFactIntPositive() {
        boolean isTrue = false;
        int rez = expertCalc.fact(4);
        if (rez == 24){
            isTrue = true;
        }
        Assert.assertTrue(isTrue);
    }

    //negative test for fact(int numar) method;
    @Test
    public void testFactIntNegative() {
        int rez = expertCalc.fact(0);
        Assert.assertEquals(1,rez);

    }

    //positive test for sqrt(int numar) method;
    @Test
    public void testSqrtIntPositive() {
        int rez = expertCalc.sqrt(100);
        Assert.assertEquals(10, rez);
    }

    //negative test for sqrt(int numar) method;
    @Test
    public void testSqrtIntNegative() {
        int rez = expertCalc.sqrt(-100);
        Assert.assertEquals(10,rez);

    }
}

