package Backend;

import java.util.ArrayList;

public class User 
{
    private int id;
    private String email;
    private String name;
    private int balance;
    private ArrayList<Cupcake> shoppingCart;

    public User(int id, String email, String name, int balance)
    {
        this.id = id;
        this.email = email;
        this.name = name;
        this.balance = balance;
        shoppingCart = new ArrayList<Cupcake>();
    }
    
    public void addCupcake(Cupcake cupcake)
    {
        shoppingCart.add(cupcake);
    }
    
    public ArrayList<Cupcake> getShoppingCart()
    {
        return shoppingCart;
    }
    
    public int getId()
    {
        return id;
    }

    public String getEmail()
    {
        return email;
    }

    public String getName()
    {
        return name;
    }
    
    public int getBalance()
    {
        return balance;
    }
    
    public void setBalance(int balance)
    {
        this.balance = balance;
    }
}