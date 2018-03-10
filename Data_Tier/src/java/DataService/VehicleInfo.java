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
public class VehicleInfo {
    private String vehiclenumber;
    private String ownername;
    private String TP;
    private String Province;
    private String Address;
    private String registredDate;
    private Criminal_Info info;

    public String getVehiclenumber() {
        return vehiclenumber;
    }

    public void setVehiclenumber(String vehiclenumber) {
        this.vehiclenumber = vehiclenumber;
    }

    public String getOwnername() {
        return ownername;
    }

    public void setOwnername(String ownername) {
        this.ownername = ownername;
    }

    public String getTP() {
        return TP;
    }

    public void setTP(String TP) {
        this.TP = TP;
    }

    public String getProvince() {
        return Province;
    }

    public void setProvince(String Province) {
        this.Province = Province;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getRegistredDate() {
        return registredDate;
    }

    public void setRegistredDate(String registredDate) {
        this.registredDate = registredDate;
    }

   
    public Criminal_Info getInfo() {
        return info;
    }

    public void setInfo(Criminal_Info info) {
        this.info = info;
    }
    
    
}
