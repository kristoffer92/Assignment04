package Assignment04;

public abstract class Product {
    private static int productCounter = 0;
    private int id;
    protected String name;
    protected int price;
    protected int calories;
    protected String allergens;

    public Product(String name, int price, int calories, String allergens)
    {
        id = ++productCounter;
        this.name = name;
        this.price = price;
        this.calories = calories;
        this.allergens = allergens;
    }//End of Constructor

    //Getters
    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    public String getAllergens() {
        return allergens;
    }

    public int getPrice() {
        return price;
    }
    public int getId()
    {
        return id;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setAllergens(String allergens) {
        this.allergens = allergens;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String makeInformation() {
        StringBuilder InfoProduct = new StringBuilder();

        InfoProduct.append("-----Product Info-----").append('\n');
        InfoProduct.append("Name: ").append(getName()).append('\n');
        InfoProduct.append("Price: ").append(getPrice()).append('\n');
        InfoProduct.append("Calories: ").append(getCalories()).append('\n');
        InfoProduct.append("Allergens: ").append(getAllergens()).append('\n');
        InfoProduct.append("----------------------").append('\n');

        return InfoProduct.toString();
    }

    @Override
    public String toString()
    {
        return  "\nId: "+ getId()+"\n"+
                "Name: "+ getName()+"\n";
    }
}//End of Product