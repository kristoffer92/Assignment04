package Assignment04.Interfaces;

import Assignment04.Product;

public interface Interfaces
{
    String getDescription(int productNumber);//View a product description
    void addCurrency(int amount); //Adds to depositpool
    Product request(int productNumber);//Buys a product
    String[] getProducts();//Return all Products names and product numbers
    int getBalance();//Returns the depositpool amount
    int endSession();//Returns change, resets depositpool
}