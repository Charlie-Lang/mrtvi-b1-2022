package Week5;
import java.sql.*;
import java.util.Scanner;

public class Day29G2A {
    String dbName = "db_mrtvi_b1";
    String url = "jdbc:mysql://localhost:3306/"+dbName;
    String user = "root";
    String password  = "";
    
    public static void main(String[] args) {
        Day29G2A callMe = new Day29G2A();
        Scanner uInput = new Scanner(System.in);
        int rowsAffected = 0;
        
        String pName = "";
        String pCategory = "";
        int qty = 0;
        String tInOut = "IN";
        
        String[] catList = {"Biscuit","Snacks","Beverages","Canned Goods","Hygiene","Detergent"};
        
        System.out.println("Category List:");
        System.out.println("Code | Plate Number");
        for (int i = 0; i < catList.length; i++) {
            System.out.println(i+" | " +catList[i]);            
        }
        
        System.out.print("Product Name: ");
        pName = uInput.nextLine();
        System.out.print("Category Code: ");
        pCategory = catList[uInput.nextInt()];
        System.out.print("Quantity: ");
        qty = uInput.nextInt();
        
        rowsAffected = callMe.insertRow(pName, pCategory, qty, tInOut);
        
        System.out.println(rowsAffected + " Row(s) Affected");
    }
    
    int insertRow(String pName
            , String pCategory
            , int qty
            , String tInOut) {
        int rowsAffected = 0;
        Connection conn = null;
        String sqlQuery = "INSERT INTO tbl_inventory(fld_pname, fld_category, fld_qty, fld_last_transact)"
                + "VALUES (?, ?, ?, ?)";
        try {
            conn = DriverManager.getConnection(url, user, password);
        
        PreparedStatement pStmt = conn.prepareStatement(sqlQuery);
            pStmt.setString(1, pName);
            pStmt.setString(2, pCategory);
            pStmt.setInt(3, qty);
            pStmt.setString(4, tInOut);
            
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
