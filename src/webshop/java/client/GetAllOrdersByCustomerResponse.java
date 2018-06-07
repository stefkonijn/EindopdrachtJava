
package webshop.java.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetAllOrdersByCustomerResult" type="{http://schemas.datacontract.org/2004/07/StoreWebservice}ArrayOfOrder" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getAllOrdersByCustomerResult"
})
@XmlRootElement(name = "GetAllOrdersByCustomerResponse")
public class GetAllOrdersByCustomerResponse {

    @XmlElementRef(name = "GetAllOrdersByCustomerResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfOrder> getAllOrdersByCustomerResult;

    /**
     * Gets the value of the getAllOrdersByCustomerResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrder }{@code >}
     *     
     */
    public JAXBElement<ArrayOfOrder> getGetAllOrdersByCustomerResult() {
        return getAllOrdersByCustomerResult;
    }

    /**
     * Sets the value of the getAllOrdersByCustomerResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrder }{@code >}
     *     
     */
    public void setGetAllOrdersByCustomerResult(JAXBElement<ArrayOfOrder> value) {
        this.getAllOrdersByCustomerResult = value;
    }

}
