package Week5;
import java.sql.*;

public class Day26C {
    String dbName = "db_mrtvi_b1";
    String url = "jdbc:mysql://localhost:3306/"+dbName;
    String user = "root";
    String password  = "";
    
    public static void main(String[] args) {
        Day26C callMe = new Day26C();
        callMe.summaryByJobTitle();
    }
    
    void summaryByJobTitle() {
        Connection conn = null;
        try {
            // create a connection to the database
            conn = DriverManager.getConnection(url, user, password);
            // more processing here
            String sqlQuery = "SELECT fld_ejob_title"
                    + ", COUNT(*) AS 'Count'"
                    + ", AVG(fld_erate) "
                    + "FROM tbl_employee_list_2 "
                    + "GROUP BY fld_ejob_title "
                    + "ORDER BY fld_ejob_title;";
            
            PreparedStatement pStmt = conn.prepareStatement(sqlQuery);
            
            ResultSet rs = pStmt.executeQuery();
            
            while (rs.next()) {
                System.out.print(rs.getString("fld_ejob_title") +" | ");
                System.out.print(rs.getString("Count") +" | ");
                System.out.println(rs.getString("AVG(fld_erate)") +" | ");
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
