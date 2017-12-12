package Backend;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InvoiceMapper {

    public int storeInvoice(Invoice orderInvoice, User user) {
        int orderno = -1;
        String sql1 = "insert into Invoice (customerid) values (?);";
        String sql2 = "select orderno from Invoice where customerid = ? and orderitems is null;";
        String sql3 = "update Invoice set orderitems = ?, totalprice = ? where orderno = ?;";

        try (Connection con = new DBConnector().getConnection();) {
            PreparedStatement stmt = con.prepareStatement(sql1);
            stmt.setInt(1, user.getId());
            stmt.executeUpdate();

            stmt = con.prepareStatement(sql2);
            stmt.setInt(1, user.getId());
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                orderno = rs.getInt(("orderno"));
            }

            stmt = con.prepareStatement(sql3);
            stmt.setString(1, orderInvoice.invoiceInfoToString());
            stmt.setDouble(2, orderInvoice.getTotalPrice());
            stmt.setInt(3, orderno);
            stmt.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(InvoiceMapper.class.getName()).log(Level.SEVERE, null, ex);
        }

        return orderno;
    }
}
