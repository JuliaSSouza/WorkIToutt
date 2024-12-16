package main.java;
import java.sql.*;

import javax.swing.JOptionPane;

/**
 * 
 */
public class UserDAOMySQL extends UserDAO {
    Connection conn;
    PreparedStatement pstm;



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

        String query = "SELECT UserName FROM vrd.user WHERE UserName = ?";
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

    public void registerUser(User user){
       
        String sql = "insert into vrd.user (UserName, Password, Email, Phone, Name) values (?, ?, ?, ?, ?)";
        try {
            pstm = conn.prepareStatement(sql);
			pstm.setString(1, user.getUserName());
			pstm.setString(2, user.getUserPassword());
			pstm.setString(3, user.getEmail());
			pstm.setString(4, user.getPhone());
			pstm.setString(5, user.getName());
			
            pstm.execute();
			JOptionPane.showMessageDialog(null, "User succesfully created!");
			pstm.close();



        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
