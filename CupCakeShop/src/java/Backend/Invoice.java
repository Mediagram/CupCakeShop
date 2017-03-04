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

//    public String invoiceInfoToString()
//    {
//        StringBuilder sb = new StringBuilder();
//        for (String str : orderStrings)
//        {
//            sb.append(str);
//            sb.append(".");
//        }
//        return sb.toString();
//    }
    
    public ArrayList<Cupcake> getOrderCupcakes()
    {
        return orderCupcakes;
    }
    
    public double getTotalPrice()
    {
        return totalPrice;
    }
}
