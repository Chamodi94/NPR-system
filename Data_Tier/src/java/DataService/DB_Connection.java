
package DataService;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DB_Connection {
    private Statement st;
    private ResultSet rs;
    private Connection con;
    private static DB_Connection DB=new DB_Connection();
    private DB_Connection(){
         try {
            String url = "jdbc:mysql://localhost/vehicle_recognition_system";
            String user = "root";
            String pass = "chamodipc123";

            Class.forName("com.mysql.jdbc.Driver");

            con = DriverManager.getConnection(url, user, pass);
            st = con.createStatement();
        } catch (ClassNotFoundException ex) {

            System.out.println("Error: " + ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }  
    }
    
    public static DB_Connection getconnection(){
        return DB;
    }
    public int Executeupdate(String sql) throws Exception{
      try{
          return st.executeUpdate(sql);
      }
      catch(Exception ex){
          throw ex;
      }
    }
     public ResultSet Search(String sql) throws Exception{
      try{
          return st.executeQuery(sql);
          
           
      }
      catch(Exception ex){
          throw ex;
      }
    }
}
