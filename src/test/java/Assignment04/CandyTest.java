package Assignment04;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


//Arrange
//Act
//Assert

public class CandyTest
{
    private CandyVendingMachine testCandy;

    @Before
    public void testMakeCandy()
    {
        testCandy = new CandyVendingMachine();
    }

    @Test//View a product description
    public void testDescription()
    {
        String productNumber = testCandy.getDescription(1);
        Assert.assertTrue(productNumber.contains(productNumber));
    }

    @Test//Adds to depositpool
    public void testCurrency()
    {
        int balance = 500;
        testCandy.addCurrency(500);
        Assert.assertEquals(balance, 500);
    }

    @Test//Buys a product
    public void testRequest()
    {
        Product expectedProduct = testCandy.product[0];
        Product actualProduct = testCandy.request(expectedProduct.getId());
        Assert.assertEquals(expectedProduct, actualProduct);
    }

    @Test//Return all Products names and product numbers
    public void testProducts()
    {
        String[] result = testCandy.getProducts();
        Assert.assertArrayEquals(result, testCandy.getProducts());
    }

    @Test//Returns the depositpool amount
    public void testBalance()
    {
        int balance = 0;
        Assert.assertEquals(balance, testCandy.getBalance());
    }

    @Test//Returns change, resets depositpool
    public void testEndSession()
    {
        testCandy.setDepositpool(50);
        Assert.assertEquals(50, testCandy.endSession());
    }
}//End of CandyTest