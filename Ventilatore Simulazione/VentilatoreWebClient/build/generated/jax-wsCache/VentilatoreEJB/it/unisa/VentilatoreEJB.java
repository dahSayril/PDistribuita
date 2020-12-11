
package it.unisa;

import java.util.List;
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
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebService(name = "VentilatoreEJB", targetNamespace = "http://unisa.it/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface VentilatoreEJB {


    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "createVentilatore", targetNamespace = "http://unisa.it/", className = "it.unisa.CreateVentilatore")
    @ResponseWrapper(localName = "createVentilatoreResponse", targetNamespace = "http://unisa.it/", className = "it.unisa.CreateVentilatoreResponse")
    @Action(input = "http://unisa.it/VentilatoreEJB/createVentilatoreRequest", output = "http://unisa.it/VentilatoreEJB/createVentilatoreResponse")
    public void createVentilatore(
        @WebParam(name = "arg0", targetNamespace = "")
        VentilatoreEntity arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "deleteVentilatore", targetNamespace = "http://unisa.it/", className = "it.unisa.DeleteVentilatore")
    @ResponseWrapper(localName = "deleteVentilatoreResponse", targetNamespace = "http://unisa.it/", className = "it.unisa.DeleteVentilatoreResponse")
    @Action(input = "http://unisa.it/VentilatoreEJB/deleteVentilatoreRequest", output = "http://unisa.it/VentilatoreEJB/deleteVentilatoreResponse")
    public void deleteVentilatore(
        @WebParam(name = "arg0", targetNamespace = "")
        VentilatoreEntity arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns it.unisa.VentilatoreEntity
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateVentilatore", targetNamespace = "http://unisa.it/", className = "it.unisa.UpdateVentilatore")
    @ResponseWrapper(localName = "updateVentilatoreResponse", targetNamespace = "http://unisa.it/", className = "it.unisa.UpdateVentilatoreResponse")
    @Action(input = "http://unisa.it/VentilatoreEJB/updateVentilatoreRequest", output = "http://unisa.it/VentilatoreEJB/updateVentilatoreResponse")
    public VentilatoreEntity updateVentilatore(
        @WebParam(name = "arg0", targetNamespace = "")
        VentilatoreEntity arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns it.unisa.VentilatoreEntity
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getVentilatore", targetNamespace = "http://unisa.it/", className = "it.unisa.GetVentilatore")
    @ResponseWrapper(localName = "getVentilatoreResponse", targetNamespace = "http://unisa.it/", className = "it.unisa.GetVentilatoreResponse")
    @Action(input = "http://unisa.it/VentilatoreEJB/getVentilatoreRequest", output = "http://unisa.it/VentilatoreEJB/getVentilatoreResponse")
    public VentilatoreEntity getVentilatore(
        @WebParam(name = "arg0", targetNamespace = "")
        long arg0);

    /**
     * 
     * @return
     *     returns java.util.List<it.unisa.VentilatoreEntity>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "printAll", targetNamespace = "http://unisa.it/", className = "it.unisa.PrintAll")
    @ResponseWrapper(localName = "printAllResponse", targetNamespace = "http://unisa.it/", className = "it.unisa.PrintAllResponse")
    @Action(input = "http://unisa.it/VentilatoreEJB/printAllRequest", output = "http://unisa.it/VentilatoreEJB/printAllResponse")
    public List<VentilatoreEntity> printAll();

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<it.unisa.VentilatoreEntity>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "printByCountry", targetNamespace = "http://unisa.it/", className = "it.unisa.PrintByCountry")
    @ResponseWrapper(localName = "printByCountryResponse", targetNamespace = "http://unisa.it/", className = "it.unisa.PrintByCountryResponse")
    @Action(input = "http://unisa.it/VentilatoreEJB/printByCountryRequest", output = "http://unisa.it/VentilatoreEJB/printByCountryResponse")
    public List<VentilatoreEntity> printByCountry(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @return
     *     returns java.util.List<it.unisa.VentilatoreEntity>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "printQuickFan", targetNamespace = "http://unisa.it/", className = "it.unisa.PrintQuickFan")
    @ResponseWrapper(localName = "printQuickFanResponse", targetNamespace = "http://unisa.it/", className = "it.unisa.PrintQuickFanResponse")
    @Action(input = "http://unisa.it/VentilatoreEJB/printQuickFanRequest", output = "http://unisa.it/VentilatoreEJB/printQuickFanResponse")
    public List<VentilatoreEntity> printQuickFan();

    /**
     * 
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "setGiriAlMinuto", targetNamespace = "http://unisa.it/", className = "it.unisa.SetGiriAlMinuto")
    @ResponseWrapper(localName = "setGiriAlMinutoResponse", targetNamespace = "http://unisa.it/", className = "it.unisa.SetGiriAlMinutoResponse")
    @Action(input = "http://unisa.it/VentilatoreEJB/setGiriAlMinutoRequest", output = "http://unisa.it/VentilatoreEJB/setGiriAlMinutoResponse")
    public void setGiriAlMinuto(
        @WebParam(name = "arg0", targetNamespace = "")
        long arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

}