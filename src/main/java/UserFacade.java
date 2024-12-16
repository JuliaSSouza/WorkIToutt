package main.java;
/**
 * 
 */
public class UserFacade {

    UserDAOMySQL userDAO;
    MySQLFactory factory;
    RegisterDAO registerDAO;
    /**
     * Default constructor
     */
    public UserFacade() {
        factory = MySQLFactory.getInstance();
        userDAO = factory.createUserDAO();
    }


    /**
     * 
     */
    private User currentUser;

    /**
     * @return
     */
    public boolean register(String username, String name, String phone, String email, String password) {
        currentUser = new User(username, name, phone, email, password);
        userDAO.registerUser(currentUser);
        if (currentUser != null) {
            return true;
        }
        return false;
    }

    /**
     * @param id 
     * @param password
     */
    public boolean logIn(String id, String password) {
        currentUser = new User(id, password);
        User tempUser = userDAO.getUserByID(id, password);
        if (tempUser != null){
            if(tempUser.getUserPassword().equals(currentUser.getUserPassword())){
                currentUser = tempUser;
                System.out.print("Login was successfull");

                return true;
            }
            System.out.println("Invalid username or password");
            return false;
        }
        System.out.println("Invalid username or password");
        return false;
        // TODO implement here
    }

}