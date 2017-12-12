package Backend;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CupcakeMapper {

    public HashMap<String, Double> getCupcakeElements(String table) {
        String sql = "SELECT * FROM " + table;
        HashMap<String, Double> toppings = new HashMap();

        try (Connection con = new DBConnector().getConnection();) {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                toppings.put(rs.getString("type"), rs.getDouble("price"));
            }
        } catch (Exception ex) {
            Logger.getLogger(UserMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return toppings;
    }
}
