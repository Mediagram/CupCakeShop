/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.sql.Connection;
import model.User;

/**
 *
 * @author Bade
 */
public class UserMapper
{
    private Connection con;
    
    public UserMapper()
    {
        con = new DBConnector().getConnection();
    }
    
    public User loginUser(String email, String password)
    {
//        password = HashEncoder.get_SHA_256_SecurePassword(password);
        String sql = "select * from User where email = ? and password = ?";
        
        return null;
    }
}
