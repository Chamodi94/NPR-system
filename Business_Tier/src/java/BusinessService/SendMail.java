package BusinessService;



import java.util.Properties;
import javax.mail.PasswordAuthentication;
import javax.mail.Authenticator;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Message;
import javax.mail.internet.MimeMessage;
import java.util.Date;
import java.util.Properties;
import javax.mail.internet.InternetAddress;
import javax.mail.Transport;

public class SendMail {

    public void sendmail(String email, String sub, String msg) throws MessagingException {
        Properties property = new Properties();
        property.put("mail.smtp.host", "smtp.gmail.com");
        property.put("mail.smtp.port", "587");
        property.put("mail.smtp.auth", "true");
        property.put("mail.smtp.starttls.enable", "true");

        Authenticator auth = new Authenticator() {
            public PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("companyabc47@gmail.com ", "12345678**");
            }
        };

        Session session = Session.getInstance(property, auth);
        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress("companyabc47@gmail.com "));
        message.setRecipient(Message.RecipientType.TO, new InternetAddress(email));
        message.setSubject(sub);
        message.setText(msg);

        Transport.send(message);
    }
}
