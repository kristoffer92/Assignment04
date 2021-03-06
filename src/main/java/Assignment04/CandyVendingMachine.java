package Assignment04;

import Assignment04.Interfaces.Interfaces;
import Assignment04.Products.Drink;
import Assignment04.Products.Food;
import Assignment04.Products.Fruit;
import Assignment04.Products.Sweet;

import java.util.Arrays;


public class CandyVendingMachine implements Interfaces
{
    private final int[] denominations = {1, 5, 10, 20, 50, 100, 500, 1000};
    private int depositpool = 0;
    private int change = 0;
    public int productCounter = 0;


    Product[] product = new Product[8];
    {
        product[0] = new Food("Sushi", 99, 650, "GlutenFree", 120);
        product[1] = new Food ("Pizza", 85, 890, "GlutenFree", 300);
        product[2] = new Drink("Pepsi", 10, 140, "GlutenFree", true);
        product[3] = new Drink ("Coca cola", 10, 135, "GlutenFree", true);
        product[4] = new Sweet("Skittles", 29, 160, "GlutenFree", 75);
        product[5] = new Sweet("KitKat", 11, 518, "GlutenFree", 21);
        product[6] = new Fruit("Apple", 5, 55, "GlutenFree", true);
        product[7] = new Fruit("Banana", 5, 88, "GlutenFree", true);
    }

    public void setDepositpool(int depositpool) {
        this.depositpool = depositpool;
    }


    @Override
    public String getDescription(int productNumber)
    {
        for (Product prod : product ) {
            if (productNumber == prod.getId())
            {
                return prod.makeInformation();
            }
        }
        return null;
    }

    @Override
    public void addCurrency(int amount)
    {
        System.out.println("You can add the following denominations: "+Arrays.toString(denominations));
        for(int x : denominations){
            if(x == amount){
                depositpool = depositpool+amount;
                System.out.println("Your despoitpool is now: "+depositpool);
            }
        }
    }

    @Override
    public Product request(int productNumber)
    {
        for (Product prod : product ) {
            if (depositpool >= prod.getPrice() && prod.getId() == productNumber)
            {
                return prod;
            }
        }
        return null;
    }

    @Override
    public String[] getProducts()
    {
        String[] result = new String[product.length];

        for (int i = 0; i < result.length ; i++) {
            result[i] = product[i].toString();
        }

        return result;
    }

    @Override
    public int getBalance()
    {
        return depositpool;
    }

    @Override
    public int endSession()
    {
        if(depositpool > 0){
            change=depositpool;
            depositpool=0;
        }
        return change;
    }
}//End of CandyVendingMachine