
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
        //userDAO = factory.createUserDAO();
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
        if (tempUser != null){
            if(tempUser.getUserPassword().equals(currentUser.getUserPassword())){
                currentUser = tempUser;
                System.out.print("Login was successfull");
            }
            System.out.println("Invalid username or password");
        }
        // TODO implement here
    }

}