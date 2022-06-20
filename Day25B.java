package Week5;
import java.sql.*;
import java.util.Scanner;

public class Day25B {
    public static void main(String[] args) {
        Scanner uInput = new Scanner(System.in);
        Connection conn = null;
        String fName = "";
        String mName = "";
        String lName = "";
        int age = 0;
        String jTitle = "";
        double rate = 0;
        String dept = "";
        String sqlQuery = "INSERT INTO tbl_employee_list_2 (fld_efirst_name"
                + ",fld_emid_name, fld_elast_name"
                + ",fld_eage,fld_ejob_title"
                + ",fld_erate,fld_department)"
                + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {
            // db parameters
            String dbName = "db_mrtvi_b1";
            String url = "jdbc:mysql://localhost:3306/"+dbName;
            String user = "root";
            String password  = "";

            // create a connection to the database
            conn = DriverManager.getConnection(url, user, password);
            
            System.out.print("Enter First Name: ");
            fName = uInput.nextLine();
            System.out.print("Enter Middle Name: ");
            mName = uInput.nextLine();
            System.out.print("Enter Last Name: ");
            lName = uInput.nextLine();
            System.out.print("Enter Age: ");
            age = uInput.nextInt();
            uInput.nextLine();
            System.out.print("Enter Job Title: ");
            jTitle = uInput.nextLine();
            System.out.print("Enter Rate: ");
            rate = uInput.nextDouble();
            uInput.nextLine();
            System.out.print("Enter Department Name: ");
            dept = uInput.nextLine();
            
            PreparedStatement pStmt = conn.prepareStatement(sqlQuery);
            pStmt.setString(1, fName);
            pStmt.setString(2, mName);
            pStmt.setString(3, lName);
            pStmt.setInt(4, age);
            pStmt.setString(5, jTitle);
            pStmt.setDouble(6, rate);
            pStmt.setString(7, dept);
            
            int rowAffected = pStmt.executeUpdate();
            
            System.out.println(rowAffected + " row(s) affected");
            
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
}
