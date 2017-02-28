/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
        // password = HashEncoder.get_SHA_256_SecurePassword(password, null);
        String sql = "select * from User where email = ? and password = ?";
        Connection con = new DBConnector().getConnection();
        User user = null;
        
        try
        {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, email);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next())
            {
                user = new User(rs.getInt("id"), rs.getString("email"),
                rs.getString("password"), rs.getString("name"));
            }
        } catch (SQLException ex)
        {
            Logger.getLogger(UserMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user;
    }
    
    public void createUser(User newUser)
    {
        String sql = "insert into User (email, password, name) values (?,?,?)";
        Connection con = new DBConnector().getConnection();
        
        //String password = HashEncoder.get_SHA_256_SecurePassword(newUser.getPassword(), salt);
        
        try
            (PreparedStatement stmt = con.prepareStatement(sql);)
        {
            stmt.setString(1, newUser.getEmail());
            stmt.setString(2, newUser.getPassword());
            stmt.setString(3, newUser.getName());
            stmt.executeUpdate();
        } catch (SQLException ex)
        {
            Logger.getLogger(UserMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
