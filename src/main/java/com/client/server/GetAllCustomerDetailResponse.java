
package com.client.server;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustamerDetail" type="{http://soap.com.br}CustamerDetail" maxOccurs="unbounded"/>
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
    "custamerDetail"
})
@XmlRootElement(name = "GetAllCustomerDetailResponse")
public class GetAllCustomerDetailResponse {

    @XmlElement(name = "CustamerDetail", required = true)
    protected List<CustamerDetail> custamerDetail;

    /**
     * Gets the value of the custamerDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the custamerDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustamerDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustamerDetail }
     * 
     * 
     */
    public List<CustamerDetail> getCustamerDetail() {
        if (custamerDetail == null) {
            custamerDetail = new ArrayList<CustamerDetail>();
        }
        return this.custamerDetail;
    }

}
