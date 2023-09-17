
package com.restapi.employeeapi.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for result complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="result">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="operands" type="{http://www.jboss.org/eap/quickstarts/wscalculator/Calculator}operands" minOccurs="0"/>
 *         &lt;element name="result" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "result", propOrder = {
    "operands",
    "result"
})
public class Result {

    protected Operands operands;
    protected int result;

    /**
     * Gets the value of the operands property.
     * 
     * @return
     *     possible object is
     *     {@link Operands }
     *     
     */
    public Operands getOperands() {
        return operands;
    }

    /**
     * Sets the value of the operands property.
     * 
     * @param value
     *     allowed object is
     *     {@link Operands }
     *     
     */
    public void setOperands(Operands value) {
        this.operands = value;
    }

    /**
     * Gets the value of the result property.
     * 
     */
    public int getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     */
    public void setResult(int value) {
        this.result = value;
    }

}
