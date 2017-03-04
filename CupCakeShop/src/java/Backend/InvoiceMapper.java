package Backend;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InvoiceMapper
{
    public int storeInvoice(Invoice orderInvoice, User user)
    {
        String sql1 = "insert into Invoice (customerid) values (?);";
        String sql2 = "select orderno from Invoice where customerid = ? and orderitems is null;";
        String sql3 = "insert into Invoice (customerid, orderitems, totalprice) values (?,?,?);";
        Connection con = new DBConnector().getConnection();
        
        try
        {
            PreparedStatement stmt = con.prepareStatement(sql1);
            stmt.setInt(1, user.getId());
            stmt.executeUpdate();
            
            stmt = con.prepareStatement(sql2);
            
        } catch (SQLException ex)
        {
            Logger.getLogger(InvoiceMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return -1;
    }
}