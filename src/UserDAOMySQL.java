import java.sql.*;

/**
 * 
 */
public class UserDAOMySQL extends UserDAO {
    Connection conn;


    public UserDAOMySQL() {
        Create_DB db = new Create_DB();
        conn = db.conectaBD();
    }

   
    /**
     * Method to check if a user exists by username.
     * @param username The username to check.
     * @return true if user exists, false otherwise.
     */
    public User getUserByID(String username, String password) {

        if (checkUser(username) == true) {
            User currentUser = new User(username, password);
            return currentUser;
        } else { 
            return null;        
        }
    }

    public Boolean checkUser(String username) {

        String query = "SELECT UserName FROM mysql.user WHERE UserName = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, username);

            try (ResultSet rs = pstmt.executeQuery()) {
                return rs.next();
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
