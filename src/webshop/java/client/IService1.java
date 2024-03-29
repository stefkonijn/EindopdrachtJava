
package webshop.java.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IService1", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IService1 {


    /**
     * 
     * @param value
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetData", action = "http://tempuri.org/IService1/GetData")
    @WebResult(name = "GetDataResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetData", targetNamespace = "http://tempuri.org/", className = "webshop.java.client.GetData")
    @ResponseWrapper(localName = "GetDataResponse", targetNamespace = "http://tempuri.org/", className = "webshop.java.client.GetDataResponse")
    public String getData(
        @WebParam(name = "value", targetNamespace = "http://tempuri.org/")
        Integer value);

    /**
     * 
     * @param composite
     * @return
     *     returns webshop.java.client.CompositeType
     */
    @WebMethod(operationName = "GetDataUsingDataContract", action = "http://tempuri.org/IService1/GetDataUsingDataContract")
    @WebResult(name = "GetDataUsingDataContractResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetDataUsingDataContract", targetNamespace = "http://tempuri.org/", className = "webshop.java.client.GetDataUsingDataContract")
    @ResponseWrapper(localName = "GetDataUsingDataContractResponse", targetNamespace = "http://tempuri.org/", className = "webshop.java.client.GetDataUsingDataContractResponse")
    public CompositeType getDataUsingDataContract(
        @WebParam(name = "composite", targetNamespace = "http://tempuri.org/")
        CompositeType composite);

    /**
     * 
     * @param p
     * @param u
     * @return
     *     returns java.lang.Integer
     */
    @WebMethod(operationName = "Inloggen", action = "http://tempuri.org/IService1/Inloggen")
    @WebResult(name = "InloggenResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Inloggen", targetNamespace = "http://tempuri.org/", className = "webshop.java.client.Inloggen")
    @ResponseWrapper(localName = "InloggenResponse", targetNamespace = "http://tempuri.org/", className = "webshop.java.client.InloggenResponse")
    public Integer inloggen(
        @WebParam(name = "u", targetNamespace = "http://tempuri.org/")
        String u,
        @WebParam(name = "p", targetNamespace = "http://tempuri.org/")
        String p);

    /**
     * 
     * @param u
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Registreren", action = "http://tempuri.org/IService1/Registreren")
    @WebResult(name = "RegistrerenResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Registreren", targetNamespace = "http://tempuri.org/", className = "webshop.java.client.Registreren")
    @ResponseWrapper(localName = "RegistrerenResponse", targetNamespace = "http://tempuri.org/", className = "webshop.java.client.RegistrerenResponse")
    public String registreren(
        @WebParam(name = "u", targetNamespace = "http://tempuri.org/")
        String u);

    /**
     * 
     * @return
     *     returns webshop.java.client.ArrayOfProduct
     */
    @WebMethod(operationName = "GetAllProducts", action = "http://tempuri.org/IService1/GetAllProducts")
    @WebResult(name = "GetAllProductsResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetAllProducts", targetNamespace = "http://tempuri.org/", className = "webshop.java.client.GetAllProducts")
    @ResponseWrapper(localName = "GetAllProductsResponse", targetNamespace = "http://tempuri.org/", className = "webshop.java.client.GetAllProductsResponse")
    public ArrayOfProduct getAllProducts();

    /**
     * 
     * @param customer
     * @return
     *     returns webshop.java.client.ArrayOfOrder
     */
    @WebMethod(operationName = "GetAllOrdersByCustomer", action = "http://tempuri.org/IService1/GetAllOrdersByCustomer")
    @WebResult(name = "GetAllOrdersByCustomerResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetAllOrdersByCustomer", targetNamespace = "http://tempuri.org/", className = "webshop.java.client.GetAllOrdersByCustomer")
    @ResponseWrapper(localName = "GetAllOrdersByCustomerResponse", targetNamespace = "http://tempuri.org/", className = "webshop.java.client.GetAllOrdersByCustomerResponse")
    public ArrayOfOrder getAllOrdersByCustomer(
        @WebParam(name = "customer", targetNamespace = "http://tempuri.org/")
        Integer customer);

    /**
     * 
     * @param pid
     * @param id
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Buy", action = "http://tempuri.org/IService1/Buy")
    @WebResult(name = "BuyResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Buy", targetNamespace = "http://tempuri.org/", className = "webshop.java.client.Buy")
    @ResponseWrapper(localName = "BuyResponse", targetNamespace = "http://tempuri.org/", className = "webshop.java.client.BuyResponse")
    public String buy(
        @WebParam(name = "pid", targetNamespace = "http://tempuri.org/")
        Integer pid,
        @WebParam(name = "id", targetNamespace = "http://tempuri.org/")
        Integer id);

    /**
     * 
     * @param id
     * @return
     *     returns webshop.java.client.Customer
     */
    @WebMethod(operationName = "GetCustomerById", action = "http://tempuri.org/IService1/GetCustomerById")
    @WebResult(name = "GetCustomerByIdResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetCustomerById", targetNamespace = "http://tempuri.org/", className = "webshop.java.client.GetCustomerById")
    @ResponseWrapper(localName = "GetCustomerByIdResponse", targetNamespace = "http://tempuri.org/", className = "webshop.java.client.GetCustomerByIdResponse")
    public Customer getCustomerById(
        @WebParam(name = "id", targetNamespace = "http://tempuri.org/")
        Integer id);

}
