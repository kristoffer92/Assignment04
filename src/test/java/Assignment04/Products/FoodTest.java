package Assignment04.Products;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FoodTest
{
    public Food testFood;
    private final String testName = "Sushi";
    private final int testPrice = 99;
    private final int testCalories = 650;
    private final String testAllergens = "GlutenFree";
    private final int testWeight = 120;


    @Before
    public void testMakeFood()
    {
        testFood = new Food(testName, testPrice, testCalories, testAllergens, testWeight);
    }

    @Test
    public void testWeight()
    {
        int foodTest = testFood.getWeight();
        testFood.setWeight(foodTest);
        assertEquals(foodTest, testFood.getWeight());
    }
    @Test
    public void testFoodInfo()
    {
        String infoDrink = testFood.makeInformation();
        assertTrue(infoDrink.contains(testName));
    }
}