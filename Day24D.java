package Week4;
import java.sql.*;
import java.util.Scanner;

public class Day24D {
    public static void main(String[] args) {
        Connection conn = null;
        try {
            // db parameters
            String dbName = "db_mrtvi_b1";
            String url = "jdbc:mysql://localhost:3306/"+dbName;
            String user = "root";
            String password  = "";

            // create a connection to the database
            conn = DriverManager.getConnection(url, user, password);
            // more processing here
            Statement stmt = conn.createStatement();
            
            String sqlQuery = createSQLQuery();
            
            int rowsAffected = stmt.executeUpdate(sqlQuery);
            
            System.out.println(rowsAffected+" row(s) affected");
            
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
    
    static String createSQLQuery() {
        Scanner uInput = new Scanner(System.in);
        String fName = "";
        String mName = "";
        String lName = "";
        int age = 0;
        String jTitle = "";
        double rate = 0;
        String dept = "";
        
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

        String sqlQuery = "INSERT INTO tbl_employee_list_2 (fld_efirst_name"
                + ",fld_emid_name, fld_elast_name"
                + ",fld_eage,fld_ejob_title"
                + ",fld_erate,fld_department)"
                + "VALUES ("
                    + "'"+ fName +"'"
                    + ", '"+ mName +"'"
                    + ", '"+ lName +"'"
                    + ", "+ age +""
                    + ", '"+ jTitle +"'"
                    + ", "+ rate +""
                    + ", '"+ dept +"')";
        
        return sqlQuery;
    }
}
