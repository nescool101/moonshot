
package com.restapi.employeeapi.dto;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jboss.eap.quickstarts.wscalculator.calculator package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Add_QNAME = new QName("http://www.jboss.org/eap/quickstarts/wscalculator/Calculator", "add");
    private final static QName _Subtract_QNAME = new QName("http://www.jboss.org/eap/quickstarts/wscalculator/Calculator", "subtract");
    private final static QName _SubtractResponse_QNAME = new QName("http://www.jboss.org/eap/quickstarts/wscalculator/Calculator", "subtractResponse");
    private final static QName _AddResponse_QNAME = new QName("http://www.jboss.org/eap/quickstarts/wscalculator/Calculator", "addResponse");
    private final static QName _MultiplyResponse_QNAME = new QName("http://www.jboss.org/eap/quickstarts/wscalculator/Calculator", "multiplyResponse");
    private final static QName _DivideResponse_QNAME = new QName("http://www.jboss.org/eap/quickstarts/wscalculator/Calculator", "divideResponse");
    private final static QName _Divide_QNAME = new QName("http://www.jboss.org/eap/quickstarts/wscalculator/Calculator", "divide");
    private final static QName _AddOperandsResponse_QNAME = new QName("http://www.jboss.org/eap/quickstarts/wscalculator/Calculator", "addOperandsResponse");
    private final static QName _AddOperands_QNAME = new QName("http://www.jboss.org/eap/quickstarts/wscalculator/Calculator", "addOperands");
    private final static QName _Multiply_QNAME = new QName("http://www.jboss.org/eap/quickstarts/wscalculator/Calculator", "multiply");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jboss.eap.quickstarts.wscalculator.calculator
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Add }
     * 
     */
    public Add createAdd() {
        return new Add();
    }

    /**
     * Create an instance of {@link AddResponse }
     * 
     */
    public AddResponse createAddResponse() {
        return new AddResponse();
    }

    /**
     * Create an instance of {@link MultiplyResponse }
     * 
     */
    public MultiplyResponse createMultiplyResponse() {
        return new MultiplyResponse();
    }

    /**
     * Create an instance of {@link Subtract }
     * 
     */
    public Subtract createSubtract() {
        return new Subtract();
    }

    /**
     * Create an instance of {@link SubtractResponse }
     * 
     */
    public SubtractResponse createSubtractResponse() {
        return new SubtractResponse();
    }

    /**
     * Create an instance of {@link AddOperandsResponse }
     * 
     */
    public AddOperandsResponse createAddOperandsResponse() {
        return new AddOperandsResponse();
    }

    /**
     * Create an instance of {@link Divide }
     * 
     */
    public Divide createDivide() {
        return new Divide();
    }

    /**
     * Create an instance of {@link DivideResponse }
     * 
     */
    public DivideResponse createDivideResponse() {
        return new DivideResponse();
    }

    /**
     * Create an instance of {@link AddOperands }
     * 
     */
    public AddOperands createAddOperands() {
        return new AddOperands();
    }

    /**
     * Create an instance of {@link Multiply }
     * 
     */
    public Multiply createMultiply() {
        return new Multiply();
    }

    /**
     * Create an instance of {@link Operands }
     * 
     */
    public Operands createOperands() {
        return new Operands();
    }

    /**
     * Create an instance of {@link Result }
     * 
     */
    public Result createResult() {
        return new Result();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Add }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.jboss.org/eap/quickstarts/wscalculator/Calculator", name = "add")
    public JAXBElement<Add> createAdd(Add value) {
        return new JAXBElement<Add>(_Add_QNAME, Add.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Subtract }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.jboss.org/eap/quickstarts/wscalculator/Calculator", name = "subtract")
    public JAXBElement<Subtract> createSubtract(Subtract value) {
        return new JAXBElement<Subtract>(_Subtract_QNAME, Subtract.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubtractResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.jboss.org/eap/quickstarts/wscalculator/Calculator", name = "subtractResponse")
    public JAXBElement<SubtractResponse> createSubtractResponse(SubtractResponse value) {
        return new JAXBElement<SubtractResponse>(_SubtractResponse_QNAME, SubtractResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.jboss.org/eap/quickstarts/wscalculator/Calculator", name = "addResponse")
    public JAXBElement<AddResponse> createAddResponse(AddResponse value) {
        return new JAXBElement<AddResponse>(_AddResponse_QNAME, AddResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiplyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.jboss.org/eap/quickstarts/wscalculator/Calculator", name = "multiplyResponse")
    public JAXBElement<MultiplyResponse> createMultiplyResponse(MultiplyResponse value) {
        return new JAXBElement<MultiplyResponse>(_MultiplyResponse_QNAME, MultiplyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DivideResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.jboss.org/eap/quickstarts/wscalculator/Calculator", name = "divideResponse")
    public JAXBElement<DivideResponse> createDivideResponse(DivideResponse value) {
        return new JAXBElement<DivideResponse>(_DivideResponse_QNAME, DivideResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Divide }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.jboss.org/eap/quickstarts/wscalculator/Calculator", name = "divide")
    public JAXBElement<Divide> createDivide(Divide value) {
        return new JAXBElement<Divide>(_Divide_QNAME, Divide.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddOperandsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.jboss.org/eap/quickstarts/wscalculator/Calculator", name = "addOperandsResponse")
    public JAXBElement<AddOperandsResponse> createAddOperandsResponse(AddOperandsResponse value) {
        return new JAXBElement<AddOperandsResponse>(_AddOperandsResponse_QNAME, AddOperandsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddOperands }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.jboss.org/eap/quickstarts/wscalculator/Calculator", name = "addOperands")
    public JAXBElement<AddOperands> createAddOperands(AddOperands value) {
        return new JAXBElement<AddOperands>(_AddOperands_QNAME, AddOperands.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Multiply }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.jboss.org/eap/quickstarts/wscalculator/Calculator", name = "multiply")
    public JAXBElement<Multiply> createMultiply(Multiply value) {
        return new JAXBElement<Multiply>(_Multiply_QNAME, Multiply.class, null, value);
    }

}
