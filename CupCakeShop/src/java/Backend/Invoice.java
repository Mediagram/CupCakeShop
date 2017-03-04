package Backend;

import java.util.ArrayList;

public class Invoice
{
    private ArrayList<String> orderStrings;
    private double totalPrice;
    
    public Invoice(ArrayList<Cupcake> shoppingCart)
    {
        for (Cupcake cupcake : shoppingCart)
        {
            orderStrings.add(cupcake.getName() + " " + cupcake.getAmount() + "x");
            totalPrice += cupcake.getPrice();
        }
    }

    public ArrayList<String> getOrderStrings()
    {
        return orderStrings;
    }

    public double getTotalPrice()
    {
        return totalPrice;
    }
}
