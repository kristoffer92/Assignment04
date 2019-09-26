package Assignment04.Products;

import Assignment04.Product;

public class Sweet extends Product {
    protected int sugar;

    public Sweet(String name, int price, int calories, String allergens, int sugar)
    {
        super(name, price, calories, allergens);
        this.sugar=sugar;
    }

    public int getSugar() {
        return sugar;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
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
        InfoProduct.append("Sugar: ").append(sugar).append('\n');
        InfoProduct.append("----------------------").append('\n');

        return InfoProduct.toString();
    }

}//End of Sweet
