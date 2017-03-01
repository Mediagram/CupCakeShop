package Backend;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Mikkel
 */
public class CupcakeMapper {

    private Connection con;

    public CupcakeMapper() {
        con = new DBConnector().getConnection();
    }
    
    public ArrayList<String> getElements(String a) {
        ArrayList<String> toppings = new ArrayList();
        
        String sql = "SELECT * FROM " + a;
        String toppingName = "";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                toppingName = rs.getString("type");
                toppings.add(toppingName);
            }

        } catch (Exception e) {
            //con.rollback();
            System.out.println(e);
        }
        
        return toppings;
    }
    
    public ArrayList<String> getBottoms() {
        ArrayList<String> bottoms = new ArrayList();
        
        
        return bottoms;
    }

}
