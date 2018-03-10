
package dataservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for criminalInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="criminalInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="criminal_No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="entered_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="happend_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="user" type="{http://DataService/}user" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "criminalInfo", propOrder = {
    "criminalNo",
    "description",
    "enteredDate",
    "happendDate",
    "user"
})
public class CriminalInfo {

    @XmlElement(name = "criminal_No")
    protected String criminalNo;
    protected String description;
    @XmlElement(name = "entered_date")
    protected String enteredDate;
    @XmlElement(name = "happend_date")
    protected String happendDate;
    protected User user;

    /**
     * Gets the value of the criminalNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCriminalNo() {
        return criminalNo;
    }

    /**
     * Sets the value of the criminalNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCriminalNo(String value) {
        this.criminalNo = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the enteredDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnteredDate() {
        return enteredDate;
    }

    /**
     * Sets the value of the enteredDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnteredDate(String value) {
        this.enteredDate = value;
    }

    /**
     * Gets the value of the happendDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHappendDate() {
        return happendDate;
    }

    /**
     * Sets the value of the happendDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHappendDate(String value) {
        this.happendDate = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setUser(User value) {
        this.user = value;
    }

}
