
import java.io.*;
import java.util.*;

/**
 * 
 */
public class UserFacade {

    UserDAO userDAO;
    AbstractFactory factory;
    /**
     * Default constructor
     */
    public UserFacade() {
        userDAO = factory.createUserDAO();
    }


    /**
     * 
     */
    private User currentUser;

    /**
     * @return
     */
    private User register() {
        // TODO implement here
        return null;
    }

    /**
     * @param id 
     * @param password
     */
    private void logIn(String id, String password) {
        currentUser = new User(id, password);
        User tempUser = userDAO.getUserByID(id);
        if (user != null){
            if(user.getPassword().equals(currentUser.getPassword())){
                currentUser = user;
                System.out.print("Login was successfull");
            }
            System.out.println("Invalid username or password");
        }
        // TODO implement here
    }

}