package main;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class MyConnection {
    private static Connection connection = null;
    static private String user = "sa";
    static private String password = "123123";
    static private String serverName = "localhost";
    static private String portNumber = "1433";
    static private String DBName = "BankingSystem";
    
    public static Connection getConnection()
    {
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser(user);
        ds.setPassword(password);
        ds.setServerName(serverName);
        ds.setPortNumber(Integer.parseInt(portNumber));
        ds.setDatabaseName(DBName);
        ds.setEncrypt(false);
        if(connection == null)
        {
            try{
                connection = ds.getConnection();
                System.out.println("Ket noi thanh cong");
                System.out.println(connection.getCatalog());
            }
            catch (SQLException e) {
                System.err.println("Unable to connect to the database.");
                e.printStackTrace();
            }
        }
        return connection;
    }
}