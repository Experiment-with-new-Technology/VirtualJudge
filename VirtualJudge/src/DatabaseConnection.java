
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rakib
 */
public class DatabaseConnection {
    public static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";        
    public static final String DATABASE_URL = "jdbc:mysql://localhost/virtualjudge";
    public Connection connection = null; // manages connection
    public Statement statement = null; // query statement
    public DatabaseConnection(){
    try
        {
           Class.forName( JDBC_DRIVER ); // load database driver class
           // establish connection to database                              
           connection =(Connection) DriverManager.getConnection( DATABASE_URL, "root", "" );

           // create Statement for querying database
           statement = (Statement) connection.createStatement();
        
        }catch(Exception e){
        e.printStackTrace();}
    
    }
     
}
