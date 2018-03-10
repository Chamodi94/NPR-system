/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessService;

import dataservice.DataService;
import dataservice.DataService_Service;
import dataservice.User;
import dataservice.VehicleInfo;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author chamodi
 */
@WebService(serviceName = "BusinessService")
public class BusinessService {

    /**
     * This is a sample web service operation
     */
    DataService proxy = new DataService_Service().getDataServicePort();
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "Login")
 
    public List<User> Login(@WebParam(name = "username") String username,@WebParam(name = "password") String password) {
      
      try{
           return proxy.login(username, password);
            
        } catch (Exception ex) {
            ex.getMessage();
        }
        return null;
    }
    
      @WebMethod(operationName = "Changepassword")
    public boolean Changepassword(@WebParam(name = "user") List<User> user,@WebParam(name = "newpass") String newpass) {
        User u=new User();
        
            try {
                return proxy.changepassword(user, newpass);
            } catch (Exception ex) {
                ex.getMessage();
            }
        
        return false;

    }
      @WebMethod(operationName = "Addvehicle")
    public boolean Addvehicle(@WebParam(name = "path") String path) {
       
            try {
                return proxy.addVehicle(path);
            } catch (Exception ex) {
                ex.getMessage();
            }
        
        return false;

    }
      @WebMethod(operationName = "Deletevehicle")
    public boolean Deletevehicle(@WebParam(name = "vehivleNo") String vehivleNo) {
       
            try {
                return proxy.deleteVehicle(vehivleNo);
            } catch (Exception ex) {
                ex.getMessage();
            }
        
        return false;

    }
     @WebMethod(operationName = "Updatevehicle")
    public boolean Updatevehicle(@WebParam(name = "vehicleInfo") List<VehicleInfo> vehicleInfo) {
       
            try {
                return proxy.updateVehicle(vehicleInfo);
            } catch (Exception ex) {
                ex.getMessage();
            }
        return false;

    }
     @WebMethod(operationName = "Searchvehicle")
    public List<VehicleInfo> Searchvehicle(@WebParam(name = "vehicleNo") String vehicleNo) {
       
      return proxy.searchVehicle(vehicleNo);
    }
    
    @WebMethod(operationName = "Allusers")
    public List<User> Allusers() {
       
      return proxy.allusers();
    }
    
    @WebMethod(operationName = "Searchuser")
    public List<User> Searchuser(@WebParam(name = "userID") String userID) {
       
      return proxy.searchUser(userID);
    }
    
    @WebMethod(operationName = "Deleteuser")
    public boolean Deleteuser(@WebParam(name = "userID") String userID) {
       
      return proxy.deleteUser(userID);
    }
     @WebMethod(operationName = "Updateuser")
    public boolean Updateuser(@WebParam(name = "user") List<User> user) {
       
      return proxy.updateUser(user);
    }
     @WebMethod(operationName = "Adduser")
    public boolean Adduser(@WebParam(name = "user") List<User> user) {
       
      return proxy.addUser(user);
    }
      @WebMethod(operationName = "AllvehicleInfo")
    public List<VehicleInfo> AllvehicleInfo() {
       
      return proxy.allVehicleInfo();
    }
    
     @WebMethod(operationName = "Allcriminalinfo")
    public List<VehicleInfo> Allcriminalinfo() {
       
      return proxy.allCriminalInfo();
    }
    
    @WebMethod(operationName = "sendmessage")
    public boolean sendmessage(@WebParam(name = "subject") String subject,@WebParam(name = "email") String email,@WebParam(name = "message") String message)
    {
      try{
          SendMail m=new SendMail();
          m.sendmail(email, subject, message);
          return true;
      }
      catch(Exception ex){
          System.err.println( ex.getMessage());
     
    }
     return false;
    }
    
     @WebMethod(operationName = "SearchVehicleInfo")
    public List<VehicleInfo> SearchVehicleInfo(@WebParam(name = "vehicleNo") String vehicleNo) {
       
      return proxy.searchVehicleInfo(vehicleNo);
    }
     @WebMethod(operationName = "Searchcriminals")
    public List<VehicleInfo> Searchcriminals(@WebParam(name = "criminalno") String criminalno) {
       
      return proxy.searchCriminalInfo(criminalno);
    }
    @WebMethod(operationName = "Searchcriminalhostory")
    public List<VehicleInfo> Searchcriminalhostory(@WebParam(name = "vehicleno") String vehicleno) {
       
      return proxy.searchVehicleInfo(vehicleno);
    }
    
}
