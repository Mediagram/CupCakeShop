
package Backend;

public class Cupcake 
{
    private String name;
    private int amount;
    private int price;

    public Cupcake(String name, int amount, int price)
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
    
    public int getPrice()
    {
        return price;
    }
}
