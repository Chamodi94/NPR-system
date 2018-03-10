/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataService;

import java.sql.ResultSet;
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
public class DB_ConnectionTest {
    
    public DB_ConnectionTest() {
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
     * Test of getconnection method, of class DB_Connection.
     */
    @Test
    public void testGetconnection() {
      System.out.println("getconnection");
       
        DB_Connection result = DB_Connection.getconnection();
        if(result ==null){
            fail();
        }
    }

    /**
     * Test of Executeupdate method, of class DB_Connection.
     */
    @Test
    public void testExecuteupdate() throws Exception {
        System.out.println("Executeupdate");
        String sql = "Update user set password='12345' where username='948480832v' AND password='123456'";
        DB_Connection instance = DB_Connection.getconnection();
        int expResult = 1;
        int result = instance.Executeupdate(sql);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of Search method, of class DB_Connection.
     */
    @Test
    public void testSearch() throws Exception {
        System.out.println("Search");
        String sql = "select * from user where username='948480832v'";
        DB_Connection instance = DB_Connection.getconnection();
        ResultSet result = instance.Search(sql);
        if(result!= null){
          
        }
        else{
            fail();
        }
    }
    
}
