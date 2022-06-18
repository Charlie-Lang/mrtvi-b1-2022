package Week4;
import java.sql.*;
// before import add to library
// rclick project > properties > library > add jar/folder

public class Day24A {
    public static void main(String[] args) {
        Connection conn = null;
        try {
            // db parameters
            String url = "jdbc:mysql://localhost:3306/db_mrtvi_b1";
            String user = "root";
            String password  = "";

            // create a connection to the database
            conn = DriverManager.getConnection(url, user, password);
            // more processing here
            System.out.println("Connected ka na men");
            // ...
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
