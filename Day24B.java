package Week4;
import java.sql.*;
// jdbc driver: https://dev.mysql.com/downloads/file/?id=510648
// before import add to library
// rclick project > properties > library > add jar/folder
public class Day24B {
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
            String sqlQuery = "SELECT * FROM tbl_employee_list_2";
           
            ResultSet rs = stmt.executeQuery(sqlQuery);
            
            while (rs.next()) {
                System.out.print(rs.getString("fld_eid")+" | ");
                System.out.print(rs.getString("fld_efirst_name")+" | ");
                System.out.print(rs.getString("fld_emid_name")+" | ");
                System.out.print(rs.getString("fld_elast_name")+" | ");
                System.out.print(rs.getString("fld_eage")+" | ");
                System.out.print(rs.getString("fld_ejob_title")+" | ");
                System.out.print(rs.getString("fld_erate")+" | ");
                System.out.println(rs.getString("fld_department")+" | ");
            }
            
            // walang nalitaw kasi di mo naman ginamit
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
