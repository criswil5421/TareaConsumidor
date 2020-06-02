
package paquetews;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ServiceBinario", targetNamespace = "http://paquetews/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ServiceBinario {


    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://paquetews/", className = "paquetews.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://paquetews/", className = "paquetews.HelloResponse")
    @Action(input = "http://paquetews/ServiceBinario/helloRequest", output = "http://paquetews/ServiceBinario/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @return
     *     returns byte[]
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getFicheroAdjunto", targetNamespace = "http://paquetews/", className = "paquetews.GetFicheroAdjunto")
    @ResponseWrapper(localName = "getFicheroAdjuntoResponse", targetNamespace = "http://paquetews/", className = "paquetews.GetFicheroAdjuntoResponse")
    @Action(input = "http://paquetews/ServiceBinario/getFicheroAdjuntoRequest", output = "http://paquetews/ServiceBinario/getFicheroAdjuntoResponse")
    public byte[] getFicheroAdjunto();

}
