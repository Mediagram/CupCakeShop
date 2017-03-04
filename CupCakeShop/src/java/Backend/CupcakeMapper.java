package Backend;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Mikkel
 */
public class CupcakeMapper {

    private Connection con;

    public CupcakeMapper() {
        con = new DBConnector().getConnection();
    }
    
    public HashMap<String, Double> getCupcakeElements(String table) {
        
        String sql = "SELECT * FROM " + table;
        HashMap<String, Double> toppings = new HashMap();
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                toppings.put(rs.getString("type"), rs.getDouble("price"));
            }

        } catch (Exception e) {
            //con.rollback();
            System.out.println(e);
        }
        
        return toppings;
    }
}
