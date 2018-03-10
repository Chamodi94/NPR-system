/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessService;

import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author chamodi
 */
public class testing {
    public static void main(String [] args) throws AddressException, MessagingException, IOException{  
     //Set mail properties and configure accordingly
      String hostval = "pop.gmail.com";
      String mailStrProt = "pop3";
      String uname = "companyabc47@gmail.com ";
      String pwd = "12345678**";
    // Calling checkMail method to check received emails
      checkMail(hostval, mailStrProt, uname, pwd);
   }
   public static void checkMail(String hostval, String mailStrProt, String uname,String pwd) throws MessagingException, IOException 
   {
   
      //Set property values
      Properties propvals = new Properties();
      propvals.put("mail.pop3.host", hostval);
      propvals.put("mail.pop3.port", "995");
      propvals.put("mail.pop3.starttls.enable", "true");
      Session emailSessionObj = Session.getDefaultInstance(propvals);  
      //Create POP3 store object and connect with the server
      Store storeObj = emailSessionObj.getStore("pop3s");
      storeObj.connect(hostval, uname, pwd);
      //Create folder object and open it in read-only mode
      Folder emailFolderObj = storeObj.getFolder("INBOX");
      emailFolderObj.open(Folder.READ_ONLY);
      //Fetch messages from the folder and print in a loop
      Message[] messageobjs = emailFolderObj.getMessages(); 
 
     
      
       
      
         System.out.println("Printing individual messages");
         System.out.println("No#");
         System.out.println("Email Subject: " + "fdbg");
         System.out.println("Sender: " + "khc.chinthaki@gmail.com");
         System.out.println("Content: " + "fhjbg");
 
         
      //Now close all the objects
      emailFolderObj.close(false);
      storeObj.close();
     
   }
}
