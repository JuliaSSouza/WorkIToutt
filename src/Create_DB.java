
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Create_DB{
    static final String DB_URL = "jdbc:mysql://localhost:3306/";
    static final String USER = "root";
    static final String PASS = "violetta";

    public static void main(String[] args) {
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement stmt = conn.createStatement();) {
            String sql = "CREATE DATABASE VRD";
            stmt.executeUpdate(sql);
            System.out.print("Database created succesfully...");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}

