package Week4;
import java.sql.*;

public class Day24C {
    public static void main(String[] args) {
        Connection conn = null;
        try {
            String dbName = "db_mrtvi_b1";
            String url = "jdbc:mysql://localhost:3306/"+dbName;
            String user = "root";
            String password  = "";

            conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            String sqlQuery = "SELECT * FROM tbl_employee_list_2";
           
            ResultSet rs = stmt.executeQuery(sqlQuery);
            // String.format is added to make the table look neat
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
