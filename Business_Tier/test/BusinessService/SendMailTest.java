/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessService;

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
public class SendMailTest {
    
    public SendMailTest() {
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
     * Test of sendmail method, of class SendMail.
     */
    @Test
    public void testSendmail() throws Exception {
        System.out.println("sendmail");
        String email = "khc.chinthaki@gmail.com";
        String sub = "regarding my system issues";
        String msg = "Some fuctions are not working properly. Could you please check it?";
        SendMail instance = new SendMail();
        instance.sendmail(email, sub, msg);
        
    }
    
}
