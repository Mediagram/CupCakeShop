/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import model.User;

/**
 *
 * @author Bade
 */
public class Main
{
    public static void main(String[] args)
    {
        UserMapper um = new UserMapper();
        
        User user = new User(0, "cupcakes@cupcakeshop.com", "mypassword", "Cake-Maestro");
        um.createUser(user);
    }
}
