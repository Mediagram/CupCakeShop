
package backend;

public class Cupcake 
{
    private String name;
    private int amount;
    private double price;

    public Cupcake(String name, int amount, double price)
    {
        this.name = name;
        this.amount = amount;
        this.price = price;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getAmount()
    {
        return amount;
    }
    
    public double getPrice()
    {
        return price;
    }
}
