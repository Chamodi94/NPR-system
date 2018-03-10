/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataService;

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
@WebService(serviceName = "DataService")
public class DataService {

    DB_Connection DB = DB_Connection.getconnection();

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "Login")

    public List<User> Login(@WebParam(name = "username") String username, @WebParam(name = "password") String password) {
        List<User> User = new ArrayList<User>();
        try {
            String query = "Select * from user where username='" + username + "' AND password='" + password + "'";
            ResultSet rs = DB.Search(query);
            
            if (rs.next()) {
                
                User user = new User();
                user.setType(rs.getString("type"));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                user.setUserID(rs.getString("username"));
                User.add(user);

                return User;
            }
           

        } catch (Exception ex) {
            ex.getMessage();
        }
        return null;
    }

    @WebMethod(operationName = "SearchVehicleInfo")

    public List<VehicleInfo> SearchVehicleInfo(@WebParam(name = "vehicleNo") String vehicleNo) {
        List<VehicleInfo> VehicleInfo = new ArrayList<VehicleInfo>();
        try {
           
            String query = "Select * from vehicle_info inner join criminal_info on vehicle_info.vehicle_no= criminal_info.vehicle_no where vehicle_info.vehicle_no='" + vehicleNo + "'";
            ResultSet rs = DB.Search(query);
            
            if (rs.next()) {
                rs = DB.Search(query);
                while (rs.next()) {
                    Criminal_Info Criminal_Info = new Criminal_Info();
                    VehicleInfo vehicle_Info = new VehicleInfo();
                    vehicle_Info.setVehiclenumber(rs.getString("vehicle_no"));
                    vehicle_Info.setOwnername(rs.getString("Ownername"));
                    vehicle_Info.setAddress(rs.getString("Address"));
                    vehicle_Info.setTP(rs.getString("TP"));
                    vehicle_Info.setProvince(rs.getString("Province"));
                    vehicle_Info.setRegistredDate(rs.getString("RegistredDate"));
                    Criminal_Info.setCriminal_No(rs.getString("Criminal_No"));
                    Criminal_Info.setDescription(rs.getString("Description"));
                    Criminal_Info.setHappend_date(rs.getString("Happend_date"));
                    Criminal_Info.setEntered_date(rs.getString("Entered_date"));
                    vehicle_Info.setInfo(Criminal_Info);

                    VehicleInfo.add(vehicle_Info);
                }
                return VehicleInfo;
            } else {
                System.err.println("visit");
                query = "Select * from vehicle_info where vehicle_no='" + vehicleNo + "'";
                rs = DB.Search(query);
                while (rs.next()) {
                    Criminal_Info Criminal_Info = new Criminal_Info();
                    VehicleInfo vehicle_Info = new VehicleInfo();
                    vehicle_Info.setVehiclenumber(rs.getString("vehicle_no"));
                    vehicle_Info.setOwnername(rs.getString("Ownername"));
                    vehicle_Info.setAddress(rs.getString("Address"));
                    vehicle_Info.setTP(rs.getString("TP"));
                    vehicle_Info.setProvince(rs.getString("Province"));
                    vehicle_Info.setRegistredDate(rs.getString("RegistredDate"));
                    Criminal_Info.setCriminal_No("");
                    Criminal_Info.setDescription("");
                    Criminal_Info.setHappend_date("");
                    Criminal_Info.setEntered_date("");
                    vehicle_Info.setInfo(Criminal_Info);
                    VehicleInfo.add(vehicle_Info);
                } return VehicleInfo;
            }
           

        } catch (Exception ex) {
            ex.getMessage();
        }
        return null;
    }

    @WebMethod(operationName = "Changepassword")
    public boolean Changepassword(@WebParam(name = "user") List<User> user, @WebParam(name = "newpass") String newpass) {

        try {
            for (User u : user) {
                String query = "Update user set password= '" + newpass + "' where username= '" + u.getUserID() + "' AND password= '" + u.getPassword() + "'";

                if (DB.Executeupdate(query) > 0) {
                    return true;
                } else {
                    return false;
                }
            }
        } catch (Exception ex) {
            ex.getMessage();
        }

        return false;

    }

    @WebMethod(operationName = "All_vehicleInfo")

    public List<VehicleInfo> All_vehicleInfo() {
        List<VehicleInfo> VehicleInfo = new ArrayList<VehicleInfo>();

        try {
            String query = "Select * from vehicle_info";
            ResultSet rs = DB.Search(query);
            if (rs.next()) {

                rs = DB.Search(query);
                while (rs.next()) {
                    VehicleInfo vehicle_Info = new VehicleInfo();
                    vehicle_Info.setVehiclenumber(rs.getString("vehicle_no"));
                    vehicle_Info.setOwnername(rs.getString("Ownername"));
                    vehicle_Info.setAddress(rs.getString("Address"));
                    vehicle_Info.setTP(rs.getString("TP"));
                    vehicle_Info.setProvince(rs.getString("Province"));
                    vehicle_Info.setRegistredDate(rs.getString("RegistredDate"));

                    VehicleInfo.add(vehicle_Info);
                }
                return VehicleInfo;
            }

        } catch (Exception ex) {
            ex.getMessage();
        }
        return null;
    }

    @WebMethod(operationName = "Add_User")

    public boolean Add_User(@WebParam(name = "user") List<User> user) {
        for (User User : user) {
            try {
                String query = "INSERT INTO user values('" + User.getUserID() + "','" + User.getName() + "','" + User.getEmail() + "','" + User.getTP() + "','" + User.getPassword() + "','" + User.getType() + "')";

                if (DB.Executeupdate(query) > 0) {
                    return true;
                } else {
                    return false;
                }
            } catch (Exception ex) {
                ex.getMessage();
            }
        }

        return false;
    }

    @WebMethod(operationName = "Update_User")

    public boolean Update_User(@WebParam(name = "user") List<User> user) {
        for (User User : user) {
            try {
                String query = "UPDATE user set name='" + User.getName() + "', type='" + User.getType() + "', email='" + User.getEmail() + "', TP='" + User.getTP() + "', password='" + User.getPassword() + "' where username='" + User.getUserID() + "'";

                if (DB.Executeupdate(query) > 0) {
                    return true;
                } else {
                    return false;
                }
            } catch (Exception ex) {
                ex.getMessage();
            }
        }

        return false;
    }

    @WebMethod(operationName = "Delete_User")

    public boolean Delete_User(@WebParam(name = "user") String userID) {
        try {

            String query = "Delete From user where username='" + userID + "'";

            if (DB.Executeupdate(query) > 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception ex) {
            ex.getMessage();
        }
        return false;
    }

    @WebMethod(operationName = "SearchUser")

    public List<User> SearchUser(@WebParam(name = "username") String username) {
        List<User> User = new ArrayList<User>();
        try {
            String query = "Select * from user where username='" + username + "'";
            ResultSet rs = DB.Search(query);
            if (rs.next()) {
                User user = new User();
                user.setType(rs.getString("type"));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                user.setTP(rs.getString("TP"));
                user.setUserID(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                User.add(user);
                return User;
            }

        } catch (Exception ex) {
            ex.getMessage();
        }
        return null;
    }

    @WebMethod(operationName = "SearchCriminalInfo")

    public List<VehicleInfo> SearchCriminalInfo(@WebParam(name = "criminalNo") String criminalNo) {
        List<VehicleInfo> Vehicle = new ArrayList<VehicleInfo>();
        try {
            String query = "Select * from criminal_info where Criminal_No=" + criminalNo + "";
            ResultSet rs = DB.Search(query);
            if (rs.next()) {

                rs = DB.Search(query);
                while (rs.next()) {
                    Criminal_Info Criminal_Info = new Criminal_Info();
                    VehicleInfo vehicle_Info = new VehicleInfo();
                    User u=new User();
                    vehicle_Info.setVehiclenumber(rs.getString("vehicle_no"));
                    Criminal_Info.setCriminal_No(rs.getString("Criminal_No"));
                    Criminal_Info.setDescription(rs.getString("Description"));
                    Criminal_Info.setHappend_date(rs.getString("Happend_date"));
                    Criminal_Info.setEntered_date(rs.getString("Entered_date"));
                    u.setUserID(rs.getString("username"));
                    Criminal_Info.setUser(u);
                    vehicle_Info.setInfo(Criminal_Info);

                    Vehicle.add(vehicle_Info);
                   
                }
                return Vehicle;
            }

        } catch (Exception ex) {
            ex.getMessage();
        }
        return null;
    }

    @WebMethod(operationName = "Add_Vehicle")

    public boolean Add_Vehicle(@WebParam(name = "path") String path) throws Exception {

        String query = "LOAD DATA LOCAL INFILE '" + path + "' INTO TABLE vehicle_info FIELDS TERMINATED BY ','" + " LINES TERMINATED BY '\n' (vehicle_no, Ownername, Address, TP, Province, RegistredDate)";
        if (DB.Executeupdate(query) > 0) {
            return true;
        } else {
            return false;
        }
    }

    @WebMethod(operationName = "Update_Vehicle")

    public boolean Update_Vehicle(@WebParam(name = "vehicle") List<VehicleInfo> vehicle) {
        for (VehicleInfo vehicleinfo : vehicle) {
            try {
                String query = "UPDATE vehicle_info set Ownername='" + vehicleinfo.getOwnername() + "', Address='" + vehicleinfo.getAddress() + "', TP='" + vehicleinfo.getTP() + "', Province='" + vehicleinfo.getProvince() + "',RegistredDate='" + vehicleinfo.getRegistredDate() + "' where vehicle_no='" + vehicleinfo.getVehiclenumber() + "'";

                if (DB.Executeupdate(query) > 0) {
                    return true;
                } else {
                    return false;
                }
            } catch (Exception ex) {
                ex.getMessage();
            }
        }

        return false;
    }

    @WebMethod(operationName = "Delete_Vehicle")

    public boolean Delete_Vehicle(@WebParam(name = "vehicle") String vehicleNo) {

        try {
            String query = "Delete From vehicle_info where vehicle_no='" + vehicleNo + "'";

            if (DB.Executeupdate(query) > 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception ex) {
            ex.getMessage();
        }

        return false;
    }

    @WebMethod(operationName = "Add_Criminal")

    public boolean Add_Criminal(@WebParam(name = "criminalinfo") List<VehicleInfo> VehicleInfo) {

        try {
            for (VehicleInfo vehicle : VehicleInfo) {
               
                String query = "INSERT INTO criminal_info values(null,'" + vehicle.getInfo().getDescription() + "','" + vehicle.getInfo().getHappend_date() + "','" + vehicle.getInfo().getEntered_date() + "','"+vehicle.getInfo().getUser().getUserID()+"','" + vehicle.getVehiclenumber() + "')";

                if (DB.Executeupdate(query) > 0) {
                    return true;
                } else {
                    return false;
                }
            }
        } catch (Exception ex) {
            System.err.println( ex.getMessage());
        }

        return false;
    }

    @WebMethod(operationName = "Delete_Criminal")

    public boolean Delete_Criminal(@WebParam(name = "criminalNo") int criminalNo) {

        try {

            String query = "Delete from criminal_info where Criminal_No=" + criminalNo + "";
            if (DB.Executeupdate(query) > 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception ex) {
            ex.getMessage();
        }

        return false;
    }

    @WebMethod(operationName = "Update_Criminal")

    public boolean Update_Criminal(@WebParam(name = "vehicleinfo") List<VehicleInfo> vehicleinfo) {

        try {

            for (VehicleInfo vehicle : vehicleinfo) {

                String query = "Update criminal_info set Description='" + vehicle.getInfo().getDescription() + "', Happend_date='" + vehicle.getInfo().getHappend_date() + "',Entered_date='" + vehicle.getInfo().getEntered_date() + "',username='" + vehicle.getInfo().getUser().getUserID() + "', vehicle_no='" + vehicle.getVehiclenumber() + "' where Criminal_No=" + vehicle.getInfo().getCriminal_No() + "";
                if (DB.Executeupdate(query) > 0) {
                    return true;
                } else {
                    return false;
                }
            }
        } catch (Exception ex) {
            ex.getMessage();
        }

        return false;
    }

    public List<VehicleInfo> SearchVehicle(@WebParam(name = "vehicleNo") String vehicleNo) {
        List<VehicleInfo> VehicleInfo = new ArrayList<VehicleInfo>();
        try {

            String query = "Select * from vehicle_info where vehicle_no='" + vehicleNo + "'";
            ResultSet rs = DB.Search(query);
            if (rs.next()) {

                VehicleInfo vehicle_Info = new VehicleInfo();
                vehicle_Info.setVehiclenumber(rs.getString("vehicle_no"));
                vehicle_Info.setOwnername(rs.getString("Ownername"));
                vehicle_Info.setAddress(rs.getString("Address"));
                vehicle_Info.setTP(rs.getString("TP"));
                vehicle_Info.setProvince(rs.getString("Province"));
                vehicle_Info.setRegistredDate(rs.getString("RegistredDate"));

                VehicleInfo.add(vehicle_Info);

            }
            return VehicleInfo;

        } catch (Exception ex) {
            ex.getMessage();
        }
        return null;
    }

    @WebMethod(operationName = "Allusers")

    public List<User> Allusers() {
        List<User> User = new ArrayList<User>();
        try {
            String query = "Select * from user";
            ResultSet rs = DB.Search(query);
            while (rs.next()) {
                User user = new User();
                user.setType(rs.getString("type"));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                user.setTP(rs.getString("TP"));
                user.setUserID(rs.getString("username"));
                User.add(user);

            }
            return User;
        } catch (Exception ex) {
            ex.getMessage();
        }
        return null;
    }

    @WebMethod(operationName = "AllCriminalInfo")

    public List<VehicleInfo> AllCriminalInfo() {
        List<VehicleInfo> VehicleInfo = new ArrayList<VehicleInfo>();
        try {
            String query = "Select * from criminal_info";
            ResultSet rs = DB.Search(query);
            if (rs.next()) {

                rs = DB.Search(query);
                while (rs.next()) {
                    Criminal_Info Criminal_Info = new Criminal_Info();
                    VehicleInfo vehicle_Info = new VehicleInfo();
                    User u=new User();
                    vehicle_Info.setVehiclenumber(rs.getString("vehicle_no"));
                    Criminal_Info.setCriminal_No(rs.getString("Criminal_No"));
                    Criminal_Info.setDescription(rs.getString("Description"));
                    Criminal_Info.setHappend_date(rs.getString("Happend_date"));
                    Criminal_Info.setEntered_date(rs.getString("Entered_date"));
                    u.setUserID(rs.getString("username"));
                    Criminal_Info.setUser(u);
                    vehicle_Info.setInfo(Criminal_Info);

                    VehicleInfo.add(vehicle_Info);
                }
                return VehicleInfo;
            }

        } catch (Exception ex) {
            ex.getMessage();
        }
        return null;
    }
}
