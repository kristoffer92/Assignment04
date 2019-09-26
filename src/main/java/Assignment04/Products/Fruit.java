package Assignment04.Products;

import Assignment04.Product;

public class Fruit extends Product {
    boolean healthy;

    public Fruit(String name, int price, int calories, String allergens, boolean healthy)
    {
        super(name, price, calories, allergens);
        this.healthy=healthy;

    }

    public boolean isHealthy() {
        return healthy;
    }

    public void setHealthy(boolean healthy) {
        this.healthy = healthy;
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
        InfoProduct.append("Healthy: ").append((healthy)).append('\n');
        InfoProduct.append("----------------------").append('\n');

        return InfoProduct.toString();
    }

}//End of Fruit
