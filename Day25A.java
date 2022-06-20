package Week5;
import java.sql.*;
import java.util.Scanner;

public class Day25A {

    public static void main(String[] args) {
        Scanner uInput = new Scanner(System.in);
        Connection conn = null;
        try {
            String dbName = "db_mrtvi_b1";
            String url = "jdbc:mysql://localhost:3306/"+dbName;
            String user = "root";
            String password  = "";

            conn = DriverManager.getConnection(url, user, password);
            String sqlQuery = "SELECT * FROM tbl_employee_list_2 WHERE fld_department=? ";
            String depValue = "";
            System.out.println("Department List: Maintenance Orders Repairs Floor");
            System.out.print("Type the department: ");
            depValue = uInput.nextLine();
            
            PreparedStatement pStmt = conn.prepareStatement(sqlQuery);
            //mauna yung SQL Query bago yung PreparedStatement mabuo
            //Maintenance Orders Repairs Floor
            
            pStmt.setString(1, depValue);
            
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
    
}
//gawa ka ng sql query
//i set mo sa prepared statement yung ginawa
//gagamitin mo yung mga set command para punan yung mga ? dun sa sql query mo
