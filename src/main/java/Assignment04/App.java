package Assignment04;


public class App
{
    public static void main( String[] args ){
        CandyVendingMachine candy = new CandyVendingMachine();
        candy.addCurrency(0);
        System.out.println(candy.request(1));
    }

}
