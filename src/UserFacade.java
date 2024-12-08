

/**
 * 
 */
public class UserFacade {

    UserDAOMySQL userDAO;
    MySQLFactory factory;
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
    private User register() {
        // TODO implement here
        return null;
    }

    /**
     * @param id 
     * @param password
     */
    public boolean logIn(String id, String password) {
        currentUser = new User(id, password);
        User tempUser = userDAO.getUserByID(id, password);
        System.out.println(tempUser.toString()+"");
        if (tempUser != null){
            if(tempUser.getUserPassword().equals(currentUser.getUserPassword())){
                currentUser = tempUser;
                System.out.print("Login was successfull");
                return true;
            }
            System.out.println("Invalid username or password");
            return false;
        }
        return false;
        // TODO implement here
    }

}