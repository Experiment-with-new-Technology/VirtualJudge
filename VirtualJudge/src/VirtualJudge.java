
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
public class VirtualJudge {

 
    public static void main(String[] args) {
    try
        {
           DatabaseConnection database=new DatabaseConnection();
         String sql="insert into registration values('Rakib','Hasan','rakib_hasan','rakib_hasan6@yahoo.com','RUET','r123','r123','15/6/1991',4)";
            
        database.statement.execute(sql);
        }catch(Exception e){
        e.printStackTrace();}
        
    
        
    }
}
