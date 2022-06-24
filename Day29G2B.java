
package Week5;
import java.sql.*;
import java.util.Scanner;

public class Day29G2B {
    String dbName = "db_mrtvi_b1";
    String url = "jdbc:mysql://localhost:3306/"+dbName;
    String user = "root";
    String password  = "";
    
    public static void main(String[] args) {
        Day29G2B callMe = new Day29G2B();
        Scanner uInput = new Scanner(System.in);
        int rowsAffected = 0;
        
        byte pId = 0;
        String pName = "";
        String pCategory = "";
        int qty = 0;
        String tInOut = "IN";
        
       
        callMe.showAllRows();
        
        System.out.print("Enter product id: ");
        pId = uInput.nextByte();
        uInput.nextLine();
        System.out.print("Quantity: ");
        qty = uInput.nextInt();
        uInput.nextLine();
        System.out.print("Kind of transaction(IN/OUT): ");
        tInOut = uInput.nextLine();
        if (tInOut.equalsIgnoreCase("IN")) {
            qty += callMe.getRowQuantity(pId);
        } else if (tInOut.equalsIgnoreCase("OUT")) {
            qty -= callMe.getRowQuantity(pId);
        }
        
        rowsAffected = callMe.updateRow(pId, qty, tInOut);
        
        System.out.println(rowsAffected + " Row(s) Affected");
    }
    
    void showAllRows(){
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            String sqlQuery = "SELECT * FROM tbl_inventory";
            
            PreparedStatement pStmt = conn.prepareStatement(sqlQuery);
            
            ResultSet rs = pStmt.executeQuery();
            
            while (rs.next()) {
                System.out.print(String.format("%3s", rs.getString("fld_id"))+" | ");
                System.out.print(String.format("%-30s", rs.getString("fld_pname"))+" | ");
                System.out.print(String.format("%-15s", rs.getString("fld_category"))+" | ");
                System.out.print(String.format("%-10s", rs.getInt("fld_qty"))+" | ");
                System.out.print(String.format("%-10s", rs.getString("fld_last_transact	"))+" | ");
            }
            
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try{
                if(conn != null)
                    conn.close();
            }catch(SQLException ex){
                System.out.println(ex.getMessage());
            }
        }
    }
    
    int getRowQuantity(byte pId) {
        int totalQuantity = 0;
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            String sqlQuery = "SELECT fld_qty FROM tbl_inventory WHERE fld_id = ?";
            
            PreparedStatement pStmt = conn.prepareStatement(sqlQuery);
            pStmt.setByte(1, pId);
            ResultSet rs = pStmt.executeQuery();
            
            while (rs.next()) {
                totalQuantity = rs.getInt("fld_qty");
            }
            
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try{
                if(conn != null)
                    conn.close();
            }catch(SQLException ex){
                System.out.println(ex.getMessage());
            }
        }
        return totalQuantity;
    }
    
    int updateRow (byte pId
            , int qty
            , String tInOut) {
        int rowsAffected = 0;
        Connection conn = null;
        String sqlQuery = "UPDATE tbl_inventory "
                + "SET fld_qty = ?"
                + ",fld_last_transact = ?"
                + "WHERE fld_id = ?";
        try {
            conn = DriverManager.getConnection(url, user, password);
        
        PreparedStatement pStmt = conn.prepareStatement(sqlQuery);
            pStmt.setInt(1, qty);
            pStmt.setString(2, tInOut);
            pStmt.setByte(3, pId);
            
            rowsAffected = pStmt.executeUpdate();
            
            } catch(SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try{
                if(conn != null)
                    conn.close();
            }catch(SQLException ex){
                System.out.println(ex.getMessage());
            }
        }
        return rowsAffected;
    }
}
