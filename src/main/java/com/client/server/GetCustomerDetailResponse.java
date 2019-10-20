
package com.client.server;

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
 *         &lt;element name="CustomeDetailResponse" type="{http://soap.com.br}CustamerDetail"/>
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
    "customeDetailResponse"
})
@XmlRootElement(name = "GetCustomerDetailResponse")
public class GetCustomerDetailResponse {

    @XmlElement(name = "CustomeDetailResponse", required = true)
    protected CustamerDetail customeDetailResponse;

    /**
     * Obtém o valor da propriedade customeDetailResponse.
     * 
     * @return
     *     possible object is
     *     {@link CustamerDetail }
     *     
     */
    public CustamerDetail getCustomeDetailResponse() {
        return customeDetailResponse;
    }

    /**
     * Define o valor da propriedade customeDetailResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link CustamerDetail }
     *     
     */
    public void setCustomeDetailResponse(CustamerDetail value) {
        this.customeDetailResponse = value;
    }

}
