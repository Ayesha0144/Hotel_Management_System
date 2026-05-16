package hotel.management.system;
import java.sql.*;
public class Conn {
    Connection c; //interface under .sql
    Statement s; //interface under .sql all queries will be executed with the help of this
    public Conn(){
        try{ //connecting with database through drivermanager class
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/projecthms?useSSL=false&allowPublicKeyRetrieval=true","root","bilal3548");//driver manager is a class with the method getconnection
            s =c.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
    
}
