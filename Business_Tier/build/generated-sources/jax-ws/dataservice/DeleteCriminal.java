
package dataservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Delete_Criminal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Delete_Criminal"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="criminalNo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Delete_Criminal", propOrder = {
    "criminalNo"
})
public class DeleteCriminal {

    protected int criminalNo;

    /**
     * Gets the value of the criminalNo property.
     * 
     */
    public int getCriminalNo() {
        return criminalNo;
    }

    /**
     * Sets the value of the criminalNo property.
     * 
     */
    public void setCriminalNo(int value) {
        this.criminalNo = value;
    }

}
