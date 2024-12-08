public class MySQLFactory extends AbstractFactory {
    private static MySQLFactory instance;



    private MySQLFactory() {

    }

    public static MySQLFactory getInstance() {
        if (instance == null) {
            instance = new MySQLFactory();
        }
        return instance;
    }

    @Override
    public UserDAO createUserDAO() {
        // TODO Auto-generated method stub
        UserDAO userDao = new UserDAOMySQL();
        return userDao;
    }
    
}
