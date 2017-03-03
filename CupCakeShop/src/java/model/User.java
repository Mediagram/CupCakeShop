
package model;

import java.util.ArrayList;

public class User 
{
    private int id;
    private String email;
    private String password;
    private String name;
    private double balance;
    private ArrayList<Cupcake> shoppingCart;

    public User(int id, String email, String name, double balance)
    {
        this.id = id;
        this.email = email;
        this.name = name;
        this.balance = balance;
        shoppingCart = new ArrayList<Cupcake>();
    }
    
    public void addCupcake(String cupcakeName, int amount, double price)
    {
        shoppingCart.add(new Cupcake(cupcakeName, amount, price));
    }
    
    public int getId()
    {
        return id;
    }

    public String getEmail()
    {
        return email;
    }

    public String getPassword()
    {
        return password;
    }

    public String getName()
    {
        return name;
    }
    
    public Double getBalance()
    {
        return balance;
    }
}
