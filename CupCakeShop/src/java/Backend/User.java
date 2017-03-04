
package Backend;

import java.util.ArrayList;

public class User 
{
    private int id;
    private String email;
    private String password;
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
    
    public void addCupcake(String cupcakeName, int amount, int price)
    {
        shoppingCart.add(new Cupcake(cupcakeName, amount, price));
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

    public String getPassword()
    {
        return password;
    }

    public String getName()
    {
        return name;
    }
    
    public int getBalance()
    {
        return balance;
    }
}
