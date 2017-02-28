/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.User;

/**
 *
 * @author Bade
 */
public class UserMapper
{
    public User loginUser(String email, String password)
    {
//        password = HashEncoder.get_SHA_256_SecurePassword(password);
        String sql = "select * from User where email = ? and password = ?";
        
        return null;
    }
    
    public void createUser(User newUser)
    {
        String sql = "insert into User (email, password, name) values (?,?,?)";
        Connection con = new DBConnector().getConnection();
        
        try
            (PreparedStatement stmt = con.prepareStatement(sql);)
        {
            stmt.setString(1, newUser.getEmail());
            stmt.setString(2, newUser.getPassword());
            stmt.setString(3, newUser.getName());
        } catch (SQLException ex)
        {
            Logger.getLogger(UserMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
