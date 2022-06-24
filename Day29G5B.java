package Week5;
import java.sql.*;
import java.util.Scanner;

public class Day29G5B {
    String dbName = "db_mrtvi_b1";
    String url = "jdbc:mysql://localhost:3306/"+dbName;
    String user = "root";
    String password  = "";
    
    public static void main(String[] args) {
        Day29G5B callMe = new Day29G5B();
        Scanner uInput = new Scanner(System.in);
        int rowsAffected = 0;
        
        byte rentId = 0;
        String rentReturned = "";
        byte totalDays = 0;
        double rentPrice =0.0;
        
        callMe.showAllRows();
        
        System.out.print("Enter id of to be completed transaction: ");
        rentId = uInput.nextByte();
        uInput.nextLine();
        System.out.print("Date Returned(MMMM,DD): ");
        rentReturned = uInput.nextLine();
        System.out.print("Total Days Rented: ");
        totalDays = uInput.nextByte();
        uInput.nextLine();
        System.out.print("Total Rent: ");
        rentPrice = uInput.nextDouble();
        
        rowsAffected = callMe.completeTransaction(rentId, rentReturned, totalDays, rentPrice);
        
        System.out.println(rowsAffected + " Row(s) Affected");
    }
    
    void showAllRows(){
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            String sqlQuery = "SELECT * FROM tbl_motor_rent";
            
            PreparedStatement pStmt = conn.prepareStatement(sqlQuery);
            
            ResultSet rs = pStmt.executeQuery();
            
            while (rs.next()) {
                System.out.print(String.format("%3s", rs.getString("fld_id"))+" | ");
                System.out.print(String.format("%-10s", rs.getString("fld_plate_no"))+" | ");
                System.out.print(String.format("%-55s", rs.getString("fld_rname"))+" | ");
                System.out.print(String.format("%-10s", rs.getString("fld_rstart"))+" | ");
                System.out.print(String.format("%7.2f", rs.getDouble("fld_rdeposit"))+" | ");
                System.out.print(String.format("%-10s", rs.getString("fld_rreturned"))+" | ");
                System.out.print(String.format("%3s", rs.getDouble("fld_total_days"))+" | ");
                System.out.println(String.format("%7.2f", rs.getDouble("fld_rprice"))+" | ");
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
    
    int completeTransaction(byte rentId
            , String rentReturned
            , byte totalDays
            , double rentPrice) {
        int rowsAffected = 0;
        Connection conn = null;
        String sqlQuery = "UPDATE tbl_motor_rent "
                + "SET fld_rreturned = ?"
                + ",fld_total_days = ?"
                + ",fld_rprice = ?"
                + "WHERE fld_id = ?";
        try {
            conn = DriverManager.getConnection(url, user, password);
        
        PreparedStatement pStmt = conn.prepareStatement(sqlQuery);
            pStmt.setString(1, rentReturned);
            pStmt.setByte(2, totalDays);
            pStmt.setDouble(3, rentPrice);
            pStmt.setByte(4, rentId);
            
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
