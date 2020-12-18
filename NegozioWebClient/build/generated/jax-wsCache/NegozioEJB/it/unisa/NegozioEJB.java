
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
@WebService(name = "NegozioEJB", targetNamespace = "http://unisa.it/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface NegozioEJB {


    /**
     * 
     * @param arg0
     * @return
     *     returns it.unisa.NegozioEntity
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getNegozio", targetNamespace = "http://unisa.it/", className = "it.unisa.GetNegozio")
    @ResponseWrapper(localName = "getNegozioResponse", targetNamespace = "http://unisa.it/", className = "it.unisa.GetNegozioResponse")
    @Action(input = "http://unisa.it/NegozioEJB/getNegozioRequest", output = "http://unisa.it/NegozioEJB/getNegozioResponse")
    public NegozioEntity getNegozio(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns it.unisa.NegozioEntity
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateNegozio", targetNamespace = "http://unisa.it/", className = "it.unisa.UpdateNegozio")
    @ResponseWrapper(localName = "updateNegozioResponse", targetNamespace = "http://unisa.it/", className = "it.unisa.UpdateNegozioResponse")
    @Action(input = "http://unisa.it/NegozioEJB/updateNegozioRequest", output = "http://unisa.it/NegozioEJB/updateNegozioResponse")
    public NegozioEntity updateNegozio(
        @WebParam(name = "arg0", targetNamespace = "")
        NegozioEntity arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "createNegozio", targetNamespace = "http://unisa.it/", className = "it.unisa.CreateNegozio")
    @ResponseWrapper(localName = "createNegozioResponse", targetNamespace = "http://unisa.it/", className = "it.unisa.CreateNegozioResponse")
    @Action(input = "http://unisa.it/NegozioEJB/createNegozioRequest", output = "http://unisa.it/NegozioEJB/createNegozioResponse")
    public void createNegozio(
        @WebParam(name = "arg0", targetNamespace = "")
        NegozioEntity arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "removeNegozio", targetNamespace = "http://unisa.it/", className = "it.unisa.RemoveNegozio")
    @ResponseWrapper(localName = "removeNegozioResponse", targetNamespace = "http://unisa.it/", className = "it.unisa.RemoveNegozioResponse")
    @Action(input = "http://unisa.it/NegozioEJB/removeNegozioRequest", output = "http://unisa.it/NegozioEJB/removeNegozioResponse")
    public void removeNegozio(
        @WebParam(name = "arg0", targetNamespace = "")
        NegozioEntity arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<it.unisa.NegozioEntity>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "printByRegion", targetNamespace = "http://unisa.it/", className = "it.unisa.PrintByRegion")
    @ResponseWrapper(localName = "printByRegionResponse", targetNamespace = "http://unisa.it/", className = "it.unisa.PrintByRegionResponse")
    @Action(input = "http://unisa.it/NegozioEJB/printByRegionRequest", output = "http://unisa.it/NegozioEJB/printByRegionResponse")
    public List<NegozioEntity> printByRegion(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @return
     *     returns java.util.List<it.unisa.NegozioEntity>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "printDrunkPeopleShops", targetNamespace = "http://unisa.it/", className = "it.unisa.PrintDrunkPeopleShops")
    @ResponseWrapper(localName = "printDrunkPeopleShopsResponse", targetNamespace = "http://unisa.it/", className = "it.unisa.PrintDrunkPeopleShopsResponse")
    @Action(input = "http://unisa.it/NegozioEJB/printDrunkPeopleShopsRequest", output = "http://unisa.it/NegozioEJB/printDrunkPeopleShopsResponse")
    public List<NegozioEntity> printDrunkPeopleShops();

    /**
     * 
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "updateDirettore", targetNamespace = "http://unisa.it/", className = "it.unisa.UpdateDirettore")
    @ResponseWrapper(localName = "updateDirettoreResponse", targetNamespace = "http://unisa.it/", className = "it.unisa.UpdateDirettoreResponse")
    @Action(input = "http://unisa.it/NegozioEJB/updateDirettoreRequest", output = "http://unisa.it/NegozioEJB/updateDirettoreResponse")
    public void updateDirettore(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @return
     *     returns java.util.List<it.unisa.NegozioEntity>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "print", targetNamespace = "http://unisa.it/", className = "it.unisa.Print")
    @ResponseWrapper(localName = "printResponse", targetNamespace = "http://unisa.it/", className = "it.unisa.PrintResponse")
    @Action(input = "http://unisa.it/NegozioEJB/printRequest", output = "http://unisa.it/NegozioEJB/printResponse")
    public List<NegozioEntity> print();

}
