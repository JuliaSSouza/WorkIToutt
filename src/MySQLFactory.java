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
    public UserDAOMySQL createUserDAO() {
        // TODO Auto-generated method stub
        UserDAOMySQL userDao = new UserDAOMySQL();
        return userDao;
    }
    
}
