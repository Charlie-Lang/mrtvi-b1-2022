package Week5;
import java.sql.*;
import java.util.Scanner;

public class Day28B {
    String dbName = "db_mrtvi_b1";
    String url = "jdbc:mysql://localhost:3306/"+dbName;
    String user = "root";
    String password  = "";
    
    public static void main(String[] args) {
        Day28B callMe = new Day28B();
        Scanner uInput = new Scanner(System.in);
        int id =0;
        callMe.showAllRows();
        System.out.print("Enter the id of row to be DELETED: ");
        id = uInput.nextInt();
        uInput.nextLine();
        String[] rowValue = callMe.getRowValue(id);
        System.out.println("Id: " + rowValue[0]);
        System.out.println("First Name: " + rowValue[1]);
        System.out.println("Middle Name: " + rowValue[2]);
        System.out.println("Last Name: " + rowValue[3]);
        System.out.println("Age: " + rowValue[4]);
        System.out.println("Role: " + rowValue[5]);
        System.out.println("Rate: " + rowValue[6]);
        System.out.println("Department: " + rowValue[7]);
        
        System.out.println("Are you sure you want to delete this row?(type YES)");
        String confirm = uInput.nextLine();
        if (confirm.equals("YES")) {
            int result = callMe.deleteRow(id);

            System.out.println(result + " Row(s) Deleted");
        }
        
    }
    
    void showAllRows(){
        Connection conn = null;
        try {
            // create a connection to the database
            conn = DriverManager.getConnection(url, user, password);
            // more processing here
            String sqlQuery = "SELECT * FROM tbl_employee_list_2";
            
            PreparedStatement pStmt = conn.prepareStatement(sqlQuery);
            
            ResultSet rs = pStmt.executeQuery();
            // wala laman ang () kapag gumamit ka ng prepared statement
            
            while (rs.next()) {
                System.out.print(String.format("%3s", rs.getString("fld_eid"))+" | ");
                System.out.print(String.format("%-15s", rs.getString("fld_efirst_name"))+" | ");
                System.out.print(String.format("%-15s", rs.getString("fld_emid_name"))+" | ");
                System.out.print(String.format("%-15s", rs.getString("fld_elast_name"))+" | ");
                System.out.print(String.format("%3s", rs.getString("fld_eage"))+" | ");
                System.out.print(String.format("%-15s", rs.getString("fld_ejob_title"))+" | ");
                System.out.print(String.format("%7.2f", rs.getDouble("fld_erate"))+" | ");
                System.out.println(String.format("%-15s", rs.getString("fld_department"))+" | ");
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
    
    String[] getRowValue(int id) {
        String[] rowValue = new String[8];
        Connection conn = null;
        try {
            // create a connection to the database
            conn = DriverManager.getConnection(url, user, password);
            // more processing here
            String sqlQuery = "SELECT * FROM tbl_employee_list_2 WHERE fld_eid = ?";
            
            PreparedStatement pStmt = conn.prepareStatement(sqlQuery);
            
            pStmt.setInt(1, id);
            
            ResultSet rs = pStmt.executeQuery();
            // wala laman ang () kapag gumamit ka ng prepared statement
            rs.next();
                rowValue[0] = rs.getString("fld_eid");
                rowValue[1] = rs.getString("fld_efirst_name");
                rowValue[2] = rs.getString("fld_emid_name");
                rowValue[3] = rs.getString("fld_elast_name");
                rowValue[4] = rs.getString("fld_eage");
                rowValue[5] = rs.getString("fld_ejob_title");
                rowValue[6] = rs.getString("fld_erate");
                rowValue[7] = rs.getString("fld_department");
            
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
        return rowValue;        
    }
    
    int deleteRow(int id) {
        int rowsAffected = 0;
        Connection conn = null;
        String sqlQuery = "DELETE FROM tbl_employee_list_2 "
                + "WHERE fld_eid = ?";
        try {
            // create a connection to the database
            conn = DriverManager.getConnection(url, user, password);
        
        PreparedStatement pStmt = conn.prepareStatement(sqlQuery);
            pStmt.setInt(1, id);
            
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
