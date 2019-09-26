package Assignment04;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Test;
import org.junit.Before;

//Arrange
//Act
//Assert

public class ProductTest
{
    private Product testProduct;
    private final String testName = "Pepsi";
    private final int testPrice = 5;
    private final int testCalories = 150;
    private final String testAllergens = "GlutenFree";

    @Before
    public void makeProduct()
    {
        testProduct = new Product(testName, testPrice, testCalories, testAllergens) {};
    }

    @After
    public void endProduct()
    {
        testProduct = null;
    }


    @Test
    public void testName()
    {
        String name = "Pepsi";
        testProduct.setName(name);
        assertEquals("Pepsi", testProduct.getName());
    }

    @Test
    public void testId()
    {
        int number = 1;
        testProduct.setId(number);
        assertEquals(1, testProduct.getId());
    }

    @Test
    public void testPrice()
    {
        int number = 10;
        testProduct.setPrice(number);
        assertEquals(10, testProduct.getPrice());
    }

    @Test
    public void testCalories()
    {
        int number = 650;
        testProduct.setCalories(number);
        assertEquals(650, testProduct.getCalories());
    }

    @Test
    public void setTestAllergens()
    {
        String name = "GlutenFree";
        testProduct.setAllergens(name);
        assertEquals("GlutenFree", testProduct.getAllergens());
    }

    @Test
    public void testToString()
    {
        String resultOne = testProduct.toString();
        assertTrue(resultOne.contains(testName));
        assertTrue(resultOne.contains(String.valueOf(testProduct.getId())));
    }

    @Test
    public void testInformation()
    {
        String infoProductOne = testProduct.makeInformation();
        assertTrue(infoProductOne.contains(testName));
    }
}//End of ProductTest