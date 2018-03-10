
package businessservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Searchcriminals complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Searchcriminals"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="criminalno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Searchcriminals", propOrder = {
    "criminalno"
})
public class Searchcriminals {

    protected String criminalno;

    /**
     * Gets the value of the criminalno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCriminalno() {
        return criminalno;
    }

    /**
     * Sets the value of the criminalno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCriminalno(String value) {
        this.criminalno = value;
    }

}
