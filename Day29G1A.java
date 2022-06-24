package Week5;
import java.sql.*;
import java.util.Scanner;

public class Day29G1A {
    String dbName = "db_mrtvi_b1";
    String url = "jdbc:mysql://localhost:3306/"+dbName;
    String user = "root";
    String password  = "";
    
    public static void main(String[] args) {
        Day29G1A callMe = new Day29G1A();
        Scanner uInput = new Scanner(System.in);
        int rowsAffected = 0;
        
        String sName = "";
        short sYear = 0;
        String sSection = "";
        double sTuitionFee = 0.0;
        double sTuitionPaid = 0.0;
        String datePaid = "";
        
        System.out.println("Register Student");
        System.out.print("Student Name: ");
        sName = uInput.nextLine();
        System.out.print("Student Grade: ");
        sYear = uInput.nextShort();
        uInput.nextLine();
        System.out.print("Student Section: ");
        sSection = uInput.nextLine();
        System.out.print("Student Tuition Fee: ");
        sTuitionFee = uInput.nextDouble();
        uInput.nextLine();
        System.out.print("Student Tuition Paid: ");
        sTuitionPaid = uInput.nextDouble();
        uInput.nextLine();
        System.out.print("Date Paid(MM-DD-YYYY): ");
        datePaid = uInput.nextLine();
        
        rowsAffected = callMe.insertRow(sName, sYear, sSection, sTuitionFee, sTuitionPaid, datePaid);
        
        System.out.println(rowsAffected + " Row(s) Affected");
    }
    
    int insertRow(String sName
            ,short sYear
            ,String sSection
            ,double sTuitionFee
            ,double sTuitionPaid
            ,String datePaid) {
        int rowsAffected = 0;
        Connection conn = null;
        String sqlQuery = "INSERT INTO tbl_tuition_due(fld_sname, fld_syear, fld_section, fld_tuition_fee, fld_tuition_paid, fld_last_payment) "
                + "VALUES (?, ?, ?, ?, ?, ?)";
        try {
            conn = DriverManager.getConnection(url, user, password);
        
        PreparedStatement pStmt = conn.prepareStatement(sqlQuery);
            pStmt.setString(1, sName);
            pStmt.setShort(2, sYear);
            pStmt.setString(3, sSection);
            pStmt.setDouble(4, sTuitionFee);
            pStmt.setDouble(5, sTuitionPaid);
            pStmt.setString(6, datePaid);
            
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
