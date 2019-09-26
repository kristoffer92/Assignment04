package Assignment04.Products;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class FruitTest
{
    private Fruit testFruit;
    private final String testName = "Apple";
    private final int testPrice = 5;
    private final int testCalories = 55;
    private final String testAllergens = "GlutenFree";
    private final boolean testHealthy = true;

    @Before
    public void testMakeFruit()
    {
        testFruit = new Fruit(testName, testPrice, testCalories, testAllergens, testHealthy);
    }

    @Test
    public void testHealthy()
    {
        boolean testHealthy = testFruit.isHealthy();
        testFruit.setHealthy(testHealthy);
        assertTrue(testHealthy);
    }

    @Test
    public void testFruitInfo()
    {
        String infoFruit = testFruit.makeInformation();
        assertTrue(infoFruit.contains(testName));
    }
}