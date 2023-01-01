package Payroll;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection {
    
    public static Connection getConnection(){
        
        Connection con;
        
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company_db", "root", "");
            return con;
        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }

}
