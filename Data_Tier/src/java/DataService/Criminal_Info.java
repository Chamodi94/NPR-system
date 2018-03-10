/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataService;

/**
 *
 * @author chamodi
 */
public class Criminal_Info {
    private String criminal_No;
    private String Description;
    private String happend_date;
    private String entered_date;
    private User user;

    public String getCriminal_No() {
        return criminal_No;
    }

    public void setCriminal_No(String criminal_No) {
        this.criminal_No = criminal_No;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getHappend_date() {
        return happend_date;
    }

    public void setHappend_date(String happend_date) {
        this.happend_date = happend_date;
    }

    public String getEntered_date() {
        return entered_date;
    }

    public void setEntered_date(String entered_date) {
        this.entered_date = entered_date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
