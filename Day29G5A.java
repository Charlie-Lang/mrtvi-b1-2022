package Week5;
import java.sql.*;
import java.util.Scanner;

public class Day29G5A {
    String dbName = "db_mrtvi_b1";
    String url = "jdbc:mysql://localhost:3306/"+dbName;
    String user = "root";
    String password  = "";
    
    public static void main(String[] args) {
        Day29G5A callMe = new Day29G5A();
        Scanner uInput = new Scanner(System.in);
        int rowsAffected = 0;
        
        byte plateCode = 0;
        String plateNo = "";
        String rentName = "";
        String rentStart = "";
        double rentDeposit = 0.0;
        
        String[] plateNumberList = {"314RHV", "191TPV", "456PRT", "186RKP"
            , "315CGN", "919SCV", "654DRN"};
        
        System.out.println("Motor List:");
        System.out.println("Code | Plate Number");
        for (int i = 0; i < plateNumberList.length; i++) {
            System.out.println(i+" | " +plateNumberList[i]);            
        }
        
        System.out.println("Renting:");
        System.out.print("Code of motor to be rented: ");
        plateCode = uInput.nextByte();
        uInput.nextLine();
        if (plateCode < plateNumberList.length) {
            plateNo = plateNumberList[plateCode];
        }
        System.out.print("Rentor Name: ");
        rentName = uInput.nextLine();
        System.out.print("Rent Start(MMMM,DD): ");
        rentStart = uInput.nextLine();
        System.out.print("Rent Deposit: ");
        rentDeposit = uInput.nextDouble();
        
        rowsAffected = callMe.insertRow(plateNo, rentName, rentStart, rentDeposit);
        
        System.out.println(rowsAffected + " Row(s) Affected");
        
    }
    
    //SELECT COUNT(*) FROM `tbl_motor_rent` WHERE `fld_plate_no` = '314RHV' && `fld_rprice` = null;
    
    int insertRow(String plateNo
            ,String rentName
            ,String rentStart
            ,double rentDeposit) {
        int rowsAffected = 0;
        Connection conn = null;
        String sqlQuery = "INSERT INTO tbl_motor_rent (fld_plate_no ,fld_rname ,fld_rstart ,fld_rdeposit)"
                + " VALUES (?, ?, ?, ?)";
        try {
            // db parameters

            // create a connection to the database
            conn = DriverManager.getConnection(url, user, password);
        
        PreparedStatement pStmt = conn.prepareStatement(sqlQuery);
            pStmt.setString(1, plateNo);
            pStmt.setString(2, rentName);
            pStmt.setString(3, rentStart);
            pStmt.setDouble(4, rentDeposit);
            
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
