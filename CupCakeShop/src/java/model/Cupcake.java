
package model;

public class Cupcake 
{
    private String topping;
    private String bottom;
    private int amount;
    private double price;

    public Cupcake(String topping, String bottom, int amount, double price)
    {
        this.topping = topping;
        this.bottom = bottom;
        this.amount = amount;
        this.price = price;
    }

    public String getTopping()
    {
        return topping;
    }

    public String getBottom()
    {
        return bottom;
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
