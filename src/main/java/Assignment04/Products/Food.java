package Assignment04.Products;

import Assignment04.Product;

public class Food extends Product {
    protected int weight;


    public Food(String name, int price, int calories, String allergens, int weight)
    {
        super(name, price, calories, allergens);
        this.weight = weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String makeInformation()
    {
        StringBuilder InfoProduct = new StringBuilder();

        InfoProduct.append("-----Product Info-----").append('\n');
        InfoProduct.append("Name: ").append(getName()).append('\n');
        InfoProduct.append("Price: ").append(getPrice()).append('\n');
        InfoProduct.append("Calories: ").append(getCalories()).append('\n');
        InfoProduct.append("Allergens: ").append(getAllergens()).append('\n');
        InfoProduct.append("Weight: ").append(weight).append('\n');
        InfoProduct.append("----------------------").append('\n');

        return InfoProduct.toString();
    }

}//End of Food

