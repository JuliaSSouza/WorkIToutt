
import java.io.*;
import java.util.*;

/**
 * 
 */
public class UserDAOMySQL extends UserDAO {
    private ArrayList<User> userlist;

    /**
     * Default constructor
     */
    public UserDAOMySQL() {
        userlist = new ArrayList<User>();
        for (int i = 0; i < 10; i++) {
            userlist.add(new User(i + "", i + ""));
        }
    }

    /**
     * @return
     */
    public User getUserByID(String id) {
        for 
        (User user : userlist) {
            if (user.getUserName().equals(id)) {
                return user;
            }
        }
        return null;
    }

}