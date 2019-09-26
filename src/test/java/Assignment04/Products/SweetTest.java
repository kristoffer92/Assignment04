package Assignment04.Products;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SweetTest
{
    private Sweet testSweet;
    private final String testName = "KitKat";
    private final int testPrice = 11;
    private final int testCalories = 518;
    private final String testAllergens = "GlutenFree";
    private final int sugar = 21;

    @Before
    public void testMakeSweet()
    {
        testSweet = new Sweet(testName, testPrice, testCalories, testAllergens, sugar);
    }

    @Test
    public void testSugar()
    {
        int sweetTest = testSweet.getSugar();
        testSweet.setSugar(sweetTest);
        assertEquals(sweetTest, testSweet.getSugar());
    }
    @Test
    public void testSweetInfo()
    {
        String infoSweet = testSweet.makeInformation();
        assertTrue(infoSweet.contains(testName));
    }
}