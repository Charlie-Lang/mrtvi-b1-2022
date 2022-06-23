package Week5;
import java.sql.*;
import java.util.Scanner;

public class Day28C {
    String dbName = "db_mrtvi_b1";
    String url = "jdbc:mysql://localhost:3306/"+dbName;
    String user = "root";
    String password  = "";
    
    public static void main(String[] args) {
        Day28C callMe = new Day28C();
        Scanner uInput = new Scanner(System.in);
        
        String fName = "";
        String mName = "";
        String lName = "";
        int age = 0;
        String jTitle = "";
        double rate = 0;
        String dept = "";
        boolean insertContinue = true;
        int result = 0;
        
        System.out.println("ADD NEW ROW");
        System.out.print("Enter First Name: ");
        fName = uInput.nextLine();
        if (fName.isEmpty() || fName.trim().length() == 0) {
            insertContinue = false;
        }
        System.out.print("Enter Middle Name: ");
        mName = uInput.nextLine();
        if (mName.isEmpty() || mName.trim().length() == 0) {
            insertContinue = false;
        }
        System.out.print("Enter Last Name: ");
        lName = uInput.nextLine();
        if (lName.isEmpty() || lName.trim().length() == 0) {
            insertContinue = false;
        }
        System.out.print("Enter Age: ");
        age = uInput.nextInt();
        uInput.nextLine();
        if (age == 0) {
            insertContinue = false;
        }
        System.out.print("Enter Job Title: ");
        jTitle = uInput.nextLine();
        if (jTitle.isEmpty() || jTitle.trim().length() == 0) {
            insertContinue = false;
        }
        System.out.print("Enter Rate: ");
        rate = uInput.nextDouble();
        uInput.nextLine();
        if (rate == 0) {
            insertContinue = false;
        }
        System.out.print("Enter Department Name: ");
        dept = uInput.nextLine();
        if (dept.isEmpty() || dept.trim().length() == 0) {
            insertContinue = false;
        }
        // System.out.println(id + " | " + fName + " | " + mName + " | " + lName + " | " + age + " | " + jTitle + " | " + rate + " | " + dept);
        if (insertContinue) {
            result = callMe.insertRow(fName, mName, lName, age, jTitle, rate, dept);
        }
        
        System.out.println(result + " Row(s) Affected");
        
        callMe.showAllRows();
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
    
    int insertRow(String fName
            ,String mName
            ,String lName
            ,int age
            ,String jTitle
            ,double rate
            ,String dept) {
        int rowsAffected = 0;
        Connection conn = null;
        String sqlQuery = "INSERT INTO tbl_employee_list_2 (fld_efirst_name"
                + ",fld_emid_name, fld_elast_name"
                + ",fld_eage,fld_ejob_title"
                + ",fld_erate,fld_department)"
                + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {
            // db parameters

            // create a connection to the database
            conn = DriverManager.getConnection(url, user, password);
        
        PreparedStatement pStmt = conn.prepareStatement(sqlQuery);
            pStmt.setString(1, fName);
            pStmt.setString(2, mName);
            pStmt.setString(3, lName);
            pStmt.setInt(4, age);
            pStmt.setString(5, jTitle);
            pStmt.setDouble(6, rate);
            pStmt.setString(7, dept);
            
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
