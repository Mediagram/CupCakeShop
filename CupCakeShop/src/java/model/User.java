
package model;

import java.util.ArrayList;

public class User 
{
    private int id;
    private String email;
    private String password;
    private String name;
    private ArrayList<Cupcake> shoppingCart;

    public User(int id, String email, String password, String name)
    {
        this.id = id;
        this.email = email;
        this.password = password;
        this.name = name;
        shoppingCart = new ArrayList<Cupcake>();
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
}
