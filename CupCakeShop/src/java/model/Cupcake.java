
package model;

public class Cupcake 
{
    private String topping;
    private String bottom;
    private double price;

    public Cupcake(String topping, String bottom, double price)
    {
        this.topping = topping;
        this.bottom = bottom;
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

    public double getPrice()
    {
        return price;
    }
}
