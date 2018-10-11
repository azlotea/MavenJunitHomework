import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;


public class BasicTest {
    static Basic basicCalc;

    @BeforeClass
    static public void setUp() {
        basicCalc = new Basic();

    }

    //positive test for add(int... aParam) method
    @Test
    public void testAddIntPositive(){
        boolean isTrue = false;
        int result = basicCalc.add(7,4);
        if (result == 11) {
            isTrue = true;
        }
        Assert.assertTrue(isTrue);
    }

    //negative test for add(double... aParam) method
    @Test
    public void testAddDoubleNegative() {
        boolean isMaxExceeded = false;
        Double result = basicCalc.add(Double.MAX_VALUE,1.5);
        System.out.println(result);
        if (result > Double.MAX_VALUE) {
            isMaxExceeded = true;
        }
        Assert.assertFalse(isMaxExceeded);
    }

    //positive test for sub(long... subParam) method
    @Test
    public void testSubLongPositive() {
        long result = basicCalc.sub(30L, 20L);
        Assert.assertEquals(10L,result);

    }
    //negative test for sub(int...subParam) method
    @Test
    public void testSubIntNegative(){
        int result = basicCalc.sub(10,5,2);
        Assert.assertNotEquals(1,result);

    }

    //positive test for mlt(int... mltParam) method
    @Test
    public void testMltIntPositive() {
        int result = basicCalc.mlt(0,5,78);
        Assert.assertNotNull(result);
    }

    //negative test for mlt(double...mltParam) method
    @Test
    public void testMltDoubleNegative() {
        double result = basicCalc.mlt(1.0,0.0);
        Assert.assertNotEquals(1.0,result);


    }

    //positive test for div(int...divParam) method
    @Test
    public void testDivIntPositive() {
        double result = basicCalc.div(0,2);
        Assert.assertNotNull(result);
    }

    //negative test for div(long... divParam) method
    @Ignore
    @Test
    public void testDivLongNegative() {
        double result = basicCalc.div(2L,0L);
        Assert.fail("nu se poate imparti la 0");
    }


}
