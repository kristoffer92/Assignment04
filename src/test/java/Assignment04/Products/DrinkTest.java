package Assignment04.Products;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class DrinkTest
{
    private Drink testDrink;
    private final String testName = "Pepsi";
    private final int testPrice = 5;
    private final int testCalories = 150;
    private final String testAllergens = "GlutenFree";
    private final boolean carbonated = true;


    @Before
    public void testMakeDrink()
    {
        testDrink = new Drink(testName, testPrice, testCalories, testAllergens, carbonated);
    }

    @Test
    public void testCarbonated()
    {
        boolean carboTest = testDrink.isCarbonated();
        testDrink.setCarbonated(carboTest);
        assertTrue(carboTest);
    }
    @Test
    public void testDrinkInfo()
    {
        String infoDrink = testDrink.makeInformation();
        assertTrue(infoDrink.contains(testName));
    }
}
