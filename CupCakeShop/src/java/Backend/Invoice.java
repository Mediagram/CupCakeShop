package Backend;

import java.util.ArrayList;

public class Invoice
{
    private ArrayList<Cupcake> orderCupcakes = new ArrayList();
    private double totalPrice;
    
    public Invoice(ArrayList<Cupcake> shoppingCart)
    {
        orderCupcakes = shoppingCart;
        for (Cupcake cupcake : shoppingCart)
        {
            totalPrice += cupcake.getPrice() * cupcake.getAmount();
        }
    }

    public String invoiceInfoToString()
    {
        StringBuilder sb = new StringBuilder();
        for (Cupcake cupcake : orderCupcakes)
        {
            sb.append(cupcake.getAmount());
            sb.append("x.");
            sb.append(cupcake.getName());
            sb.append(".");
            sb.append(cupcake.getPrice());
        }
        return sb.toString();
    }
    
    public ArrayList<Cupcake> getOrderCupcakes()
    {
        return orderCupcakes;
    }
    
    public double getTotalPrice()
    {
        return totalPrice;
    }
}
