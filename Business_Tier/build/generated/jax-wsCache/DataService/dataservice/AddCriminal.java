
package dataservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Add_Criminal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Add_Criminal"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="criminalinfo" type="{http://DataService/}vehicleInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Add_Criminal", propOrder = {
    "criminalinfo"
})
public class AddCriminal {

    protected List<VehicleInfo> criminalinfo;

    /**
     * Gets the value of the criminalinfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the criminalinfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCriminalinfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleInfo }
     * 
     * 
     */
    public List<VehicleInfo> getCriminalinfo() {
        if (criminalinfo == null) {
            criminalinfo = new ArrayList<VehicleInfo>();
        }
        return this.criminalinfo;
    }

}
