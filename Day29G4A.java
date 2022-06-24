package Week5;
import java.sql.*;
import java.util.Scanner;

public class Day29G4A {
    String dbName = "db_mrtvi_b1";
    String url = "jdbc:mysql://localhost:3306/"+dbName;
    String user = "root";
    String password  = "";

    public static void main(String[] args) {
        Day29G4A callMe = new Day29G4A();
        Scanner uInput = new Scanner(System.in);
        int rowsAffected = 0;
        
        String cName = "";
        String ynFrozen = "N";
        byte frozen = 0;
        String pName = "";
        int qty = 0;
        double price = 0.0;
        
        System.out.println("New Sales:");
        System.out.print("Customer Name: ");
        cName = uInput.nextLine();
        System.out.print("Is it frozen goods(Y/N): ");
        ynFrozen = uInput.nextLine();
        if (ynFrozen.equalsIgnoreCase("Y")) {
            frozen = 1;
        } else { 
            frozen = 0;
        }
        System.out.print("Product Name: ");
        pName = uInput.nextLine();
        System.out.print("Quantity: ");
        qty = uInput.nextInt();
        uInput.nextLine();
        System.out.print("Price: ");
        price = uInput.nextDouble();
        uInput.nextLine();
        
        rowsAffected = callMe.insertRow(cName, frozen, pName, qty, price);
        
        System.out.println(rowsAffected + " Row(s) Affected");
        
    }
    //INSERT INTO tbl_sales_list(fld_cust_name, fld_frozen, fld_pname, fld_qty, fld_pprice) 
    //VALUES ('Sarah',1,'Tender Juicy Hotdog',3,480.75)
    
    int insertRow(String cName
                ,byte frozen
                ,String pName
                ,int qty
                ,double price) {
        int rowsAffected = 0;
        Connection conn = null;
        String sqlQuery = "INSERT INTO tbl_sales_list(fld_cust_name, fld_frozen, fld_pname, fld_qty, fld_pprice)"
                + " VALUES (?, ?, ?, ?, ?)";
        try {
            // db parameters

            // create a connection to the database
            conn = DriverManager.getConnection(url, user, password);
        
        PreparedStatement pStmt = conn.prepareStatement(sqlQuery);
            pStmt.setString(1, cName);
            pStmt.setByte(2, frozen);
            pStmt.setString(3, pName);
            pStmt.setInt(4, qty);
            pStmt.setDouble(5, price);
            
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
