
import java.io.*;
import java.util.*;

/**
 * 
 */
abstract public class UserDAO {
    private ArrayList<User> userlist;

    /**
     * Default constructor
     */
    public UserDAO() {
    }

    /**
     * @return
     */
    public abstract User getUserByID(String id);


}