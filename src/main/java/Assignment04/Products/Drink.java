package Assignment04.Products;

import Assignment04.Product;



public class Drink extends Product {
    protected boolean carbonated;

    public Drink(String name, int price, int calories, String allergens, boolean carbonated) {
        super(name, price, calories, allergens);
        this.carbonated = carbonated;
    }

    public boolean isCarbonated() { return carbonated; }
    public void setCarbonated(boolean carbonated) { this.carbonated = carbonated; }

    @Override
    public String makeInformation()
    {
        StringBuilder InfoProduct = new StringBuilder();

        InfoProduct.append("-----Product Info-----").append('\n');
        InfoProduct.append("Name: ").append(getName()).append('\n');
        InfoProduct.append("Price: ").append(getPrice()).append('\n');
        InfoProduct.append("Calories: ").append(getCalories()).append('\n');
        InfoProduct.append("Allergens: ").append(getAllergens()).append('\n');
        InfoProduct.append("Carbonated: ").append(isCarbonated() ? "Yes" : "No").append('\n');
        InfoProduct.append("----------------------").append('\n');

        return InfoProduct.toString();
    }

}//End of Drink
