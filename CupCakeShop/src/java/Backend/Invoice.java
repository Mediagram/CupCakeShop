package Backend;

import java.util.ArrayList;

public class Invoice {

    private int orderNo;
    private ArrayList<Cupcake> orderCupcakes = new ArrayList();
    private int totalPrice;

    public Invoice(ArrayList<Cupcake> shoppingCart) {
        orderCupcakes = (ArrayList<Cupcake>) shoppingCart.clone();
        for (Cupcake cupcake : shoppingCart) {
            totalPrice += cupcake.getPrice() * cupcake.getAmount();
        }
    }

    public String invoiceInfoToString() {
        StringBuilder sb = new StringBuilder();
        for (Cupcake cupcake : orderCupcakes) {
            sb.append(cupcake.getAmount());
            sb.append("x.");
            sb.append(cupcake.getName());
            sb.append(".");
            sb.append(cupcake.getPrice());
        }
        return sb.toString();
    }

    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }

    public ArrayList<Cupcake> getOrderCupcakes() {
        return orderCupcakes;
    }

    public int getTotalPrice() {
        return totalPrice;
    }
}
