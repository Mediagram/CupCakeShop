package Backend;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserMapper {

    public User loginUser(String email, String password) {
        String sql = "select * from User where email = ? and password = ?";
        byte[] salt = HashEncoder.getSalt();
        password = HashEncoder.get_SHA_256_SecurePassword(password, salt);
        User user = null;

        try (Connection con = new DBConnector().getConnection();) {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, email);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                user = new User(rs.getInt("id"), rs.getString("email"),
                        rs.getString("name"), rs.getInt("balance"));
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(UserMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user;
    }

    public void createUser(User newUser, String password) {
        String sql = "insert into User (email, password, name, balance) values (?,?,?,?)";
        byte[] salt = HashEncoder.getSalt();

        password = HashEncoder.get_SHA_256_SecurePassword(password, salt);

        try (Connection con = new DBConnector().getConnection();) {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, newUser.getEmail());
            stmt.setString(2, password);
            stmt.setString(3, newUser.getName());
            stmt.setDouble(4, newUser.getBalance());
            stmt.executeUpdate();

            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(UserMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void changeBalance(User user, int amount) {
        String sql = "update User set balance = balance - ? where id = ?;";

        try (Connection con = new DBConnector().getConnection();) {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, amount);
            stmt.setInt(2, user.getId());
            stmt.executeUpdate();

            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(UserMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
