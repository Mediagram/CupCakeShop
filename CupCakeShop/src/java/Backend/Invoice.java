package Backend;

import java.util.ArrayList;

public class Invoice
{
    private ArrayList<String> orderStrings = new ArrayList();
    private double totalPrice;
    
    public Invoice(ArrayList<Cupcake> shoppingCart)
    {
        for (Cupcake cupcake : shoppingCart)
        {
            orderStrings.add(cupcake.getAmount() + "x " + cupcake.getName() + " " + cupcake.getPrice());
            totalPrice += cupcake.getPrice();
        }
    }

    public String invoiceInfoToString()
    {
        StringBuilder sb = new StringBuilder();
        for (String str : orderStrings)
        {
            sb.append(str);
            sb.append(".");
        }
        return sb.toString();
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
