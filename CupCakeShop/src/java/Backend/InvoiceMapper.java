package Backend;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InvoiceMapper 
{
    public void storeInvoice(Invoice orderInvoice, User user)
    {
        String sql = "insert into Invoice (customerid, orderitems, totalprice) values (?,?,?);";
        Connection con = new DBConnector().getConnection();
        
        try
        {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, user.getId());
//            stmt.setString(2, orderInvoice.invoiceInfoToString());
            stmt.setDouble(3, orderInvoice.getTotalPrice());
            
            stmt.executeUpdate();
        } catch (SQLException ex)
        {
            Logger.getLogger(InvoiceMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}