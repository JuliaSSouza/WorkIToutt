package main.java;
import java.sql.*;
import javax.swing.JOptionPane;

public class RegisterDAO {
    Connection conn;
	PreparedStatement pstm;

    public RegisterDAO() {
        Create_DB db = new Create_DB();
        conn = db.conectaBD();
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
