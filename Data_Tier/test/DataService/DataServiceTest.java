/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataService;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author chamodi
 */
public class DataServiceTest {

    public DataServiceTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of Login method, of class DataService.
     */
//    @Test
//    public void testLogin() {
//        System.out.println("Login");
//        String username = "948480832v";
//        String password = "123456";
//        DataService instance = new DataService();
//
//        List<User> result = new ArrayList<User>();
//        result.addAll((List) instance.Login(username, password));
//        if (result != null) {
//            for (User user : result) {
//                if (!user.getEmail().equals("khc.chinthaki@gmail.com") && !user.getName().equals("chamodi chinthaki") && !user.getUserID().equals("948480832v") && !user.getType().equals("Admin")) {
//
//                    fail();
//                }
//            }
//        } else {
//            fail();
//        }
//    }
//   
//
    /**
     * Test of SearchVehicleInfo method, of class DataService.
     */
    @Test
    public void testSearchVehicleInfo() {
        System.out.println("SearchVehicleInfo");
        String vehicleNo = "WP KI 7699";
        DataService instance = new DataService();
        List<VehicleInfo> result = new ArrayList<VehicleInfo>();
        result.addAll((List)instance.SearchVehicleInfo(vehicleNo));
        if(result.isEmpty()){
            fail();
        }
    }
  
//     /**
//     * Test of Changepassword method, of class DataService.
//     */
//    @Test
//    public void testChangepassword() {
//        System.out.println("Changepassword");
//        List<User> user = new ArrayList<User>();
//        User u=new User();
//        u.setPassword("12345");
//        u.setUserID("948480832v");
//        String newpass = "123456";
//        user.add(u);
//        DataService instance = new DataService();
//        boolean expResult = true;
//        boolean result = instance.Changepassword(user, newpass);
//        assertEquals(expResult, result);
//    }
//    /**
//     * Test of All_vehicleInfo method, of class DataService.
//     */
//    @Test
//    public void testAll_vehicleInfo() {
//        System.out.println("All_vehicleInfo");
//        DataService instance = new DataService();
//        List<VehicleInfo> expResult = null;
//        List<VehicleInfo> result = instance.All_vehicleInfo();
//        if(result==null){
//            fail();
//        }
//        
//    }
//    /**
//     * Test of Add_User method, of class DataService.
//     */
//    @Test
//    public void testAdd_User() {
//        System.out.println("Add_User");
//        List<User> user = new ArrayList<>();
//        User u= new User();
//        u.setName("Manoja Ekanayake");
//        u.setEmail("khc.chinthaki@gmail.com");
//        u.setTP("0765647653");
//        u.setType("User");
//        u.setPassword("12345678");
//        u.setUserID("667875786v");
//        user.add(u);
//        DataService instance = new DataService();
//        boolean expResult = true;
//        boolean result = instance.Add_User(user);
//        assertEquals(expResult, result);
//        
//    }
    /**
     * Test of Update_User method, of class DataService.
//     */
//    @Test
//    public void testUpdate_User() {
//        System.out.println("Update_User");
//        List<User> user = new ArrayList<>();
//        User u= new User();
//        u.setName("Manoja Ekanayake");
//        u.setEmail("khc.chinthaki@gmail.com");
//        u.setTP("0712343564");
//        u.setType("User");
//        u.setPassword("123456");
//        u.setUserID("667875786v");
//        user.add(u);
//        
//        DataService instance = new DataService();
//        boolean expResult = true;
//        boolean result = instance.Update_User(user);
//        assertEquals(expResult, result);
//       
//    }
//    /**
//     * Test of Delete_User method, of class DataService.
//     */
//    @Test
//    public void testDelete_User() {
//        System.out.println("Delete_User");
//        String userID = "878765451v";
//        DataService instance = new DataService();
//        boolean expResult = true;
//        boolean result = instance.Delete_User(userID);
//        assertEquals(expResult, result);
//       
//    }
//    /**
//     * Test of SearchUser method, of class DataService.
//     */
//    @Test
//    public void testSearchUser() {
//        System.out.println("SearchUser");
//        String username = "948480832v";
//        DataService instance = new DataService();
//        List<User> result = instance.SearchUser(username);
//       for(User user: result){
//            if (!user.getTP().equals("0713400646") && !user.getPassword().equals("123456")  && !user.getEmail().equals("khc.chinthaki@gmail.com") && !user.getName().equals("chamodi chinthaki")&& !user.getUserID().equals("948480832v")&& !user.getType().equals("Admin")){
//             
//                fail();
//            
//        }
//        }
//    }
//    /**
//     * Test of SearchCriminalInfo method, of class DataService.
//     */
//    @Test
//    public void testSearchCriminalInfo() {
//        System.out.println("SearchCriminalInfo");
//        String criminalNo = "1";
//        DataService instance = new DataService();
//        List<VehicleInfo> expResult = null;
//        List<VehicleInfo> result = instance.SearchCriminalInfo(criminalNo);
//        if(result.isEmpty()){
//            fail();
//        }
//    }
//      @Test
//    public void TestAdd_Vehicle() throws Exception {
//        System.out.println("Addvehicle");
//       DataService instance = new DataService();
//       boolean expectresult=true;
//       boolean result = instance.Add_Vehicle("F:\\Book1.csv");
//       assertEquals(expectresult, result);
//    }
//    
//          @Test
//    public void TestUpdate_Vehicle() {
//       System.out.println("Updatevehicle");
//       DataService instance = new DataService();
//       List<VehicleInfo> vehicleinfo= new ArrayList<>();
//        VehicleInfo vehicle= new VehicleInfo();
//        vehicle.setOwnername("Vihangi Gimhana");
//        vehicle.setAddress("56/2,purwarama road, Kirulapana");
//        vehicle.setTP("0712343564");
//        vehicle.setProvince("Western");
//        vehicle.setVehiclenumber("WP KI 7630");
//        vehicle.setRegistredDate("2015/3/2");
//        vehicleinfo.add(vehicle);
//       boolean expectresult=true;
//       boolean result = instance.Update_Vehicle(vehicleinfo);
//       assertEquals(expectresult, result);
//    }
//  
//              @Test
//    public void TestDelete_Vehicle() {
//       System.out.println("Deletevehicle");
//       DataService instance = new DataService();
//       boolean expectresult=true;
//       boolean result = instance.Delete_Vehicle("WP KI 7610");
//       assertEquals(expectresult, result);
//    }
//    
//       @Test
//    public void TestDelete_CriminalInfo() {
//       System.out.println("Delete_CriminalInfo");
//       DataService instance = new DataService();
//       boolean expectresult=true;
//       boolean result = instance.Delete_Criminal(3);
//       assertEquals(expectresult, result);
//    }
//    @Test
//    public void TestUpdate_Criminal() {
//        System.out.println("Update_Criminal");
//        DataService instance = new DataService();
//        List<VehicleInfo> vehicleinfo = new ArrayList<>();
//        VehicleInfo vehicle = new VehicleInfo();
//        Criminal_Info criminal = new Criminal_Info();
//        User u = new User();
//        criminal.setCriminal_No("2");
//        criminal.setDescription("chavkfdmhlb");
//        criminal.setEntered_date("2018-3-2");
//        criminal.setHappend_date("2018-2-25");
//        u.setUserID("948480832v");
//        criminal.setUser(u);
//
//        vehicle.setInfo(criminal);
//        vehicle.setVehiclenumber("WP KI 7680");
//        vehicleinfo.add(vehicle);
//        boolean expectresult = true;
//        boolean result = instance.Update_Criminal(vehicleinfo);
//        assertEquals(expectresult, result);
//    }
    
//    @Test
//    public void testGetAllusers() {
//        System.out.println("GetAllusers");
//        DataService instance = new DataService();
//        List<User> result = instance.Allusers();
//      if(result.isEmpty()){
//                fail();
//            
//        
//        }
//    }
//    
//        /**
//     * Test of SearchCriminalInfo method, of class DataService.
//     */
//    @Test
//    public void testGetAllCriminalInfo() {
//        System.out.println("getAllCriminalInfo");
//        DataService instance = new DataService();
//        List<VehicleInfo> result = instance.AllCriminalInfo();
//        if(result.isEmpty()){
//            fail();
//        }
//    }
//    
//    @Test
//        public void testSeachvehicle() {
//        System.out.println("SearchVehicle");
//        String vehicleNo = "WP KI 7699";
//        DataService instance = new DataService();
//        
//        List<VehicleInfo> result = instance.SearchVehicle(vehicleNo);
//        if(result.isEmpty()){
//            fail();
//        }
//        
//    }
//      @Test
//    public void TestAddCriminal() {
//        System.out.println("AddCriminal");
//        DataService instance = new DataService();
//        List<VehicleInfo> vehicleinfo = new ArrayList<>();
//        VehicleInfo vehicle = new VehicleInfo();
//        Criminal_Info criminal = new Criminal_Info();
//        User u = new User();
//        criminal.setDescription("Accident in high way");
//        criminal.setEntered_date("2018-3-2");
//        criminal.setHappend_date("2018-2-25");
//        u.setUserID("948480832v");
//        criminal.setUser(u);
//        vehicle.setInfo(criminal);
//        vehicle.setVehiclenumber("WP KI 7680");
//        vehicleinfo.add(vehicle);
//        boolean expectresult = true;
//        boolean result = instance.Add_Criminal(vehicleinfo);
//        assertEquals(expectresult, result);
//    }
}
