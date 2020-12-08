
package it.unisa;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.unisa package. 
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

    private final static QName _DeleteVentilatoreResponse_QNAME = new QName("http://unisa.it/", "deleteVentilatoreResponse");
    private final static QName _PrintQuickFanResponse_QNAME = new QName("http://unisa.it/", "printQuickFanResponse");
    private final static QName _DeleteVentilatore_QNAME = new QName("http://unisa.it/", "deleteVentilatore");
    private final static QName _PrintByCountry_QNAME = new QName("http://unisa.it/", "printByCountry");
    private final static QName _PrintAllResponse_QNAME = new QName("http://unisa.it/", "printAllResponse");
    private final static QName _SetGiriAlMinuto_QNAME = new QName("http://unisa.it/", "setGiriAlMinuto");
    private final static QName _GetVentilatore_QNAME = new QName("http://unisa.it/", "getVentilatore");
    private final static QName _CreateVentilatoreResponse_QNAME = new QName("http://unisa.it/", "createVentilatoreResponse");
    private final static QName _UpdateVentilatoreResponse_QNAME = new QName("http://unisa.it/", "updateVentilatoreResponse");
    private final static QName _SetGiriAlMinutoResponse_QNAME = new QName("http://unisa.it/", "setGiriAlMinutoResponse");
    private final static QName _PrintByCountryResponse_QNAME = new QName("http://unisa.it/", "printByCountryResponse");
    private final static QName _PrintAll_QNAME = new QName("http://unisa.it/", "printAll");
    private final static QName _CreateVentilatore_QNAME = new QName("http://unisa.it/", "createVentilatore");
    private final static QName _GetVentilatoreResponse_QNAME = new QName("http://unisa.it/", "getVentilatoreResponse");
    private final static QName _UpdateVentilatore_QNAME = new QName("http://unisa.it/", "updateVentilatore");
    private final static QName _PrintQuickFan_QNAME = new QName("http://unisa.it/", "printQuickFan");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.unisa
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateVentilatore }
     * 
     */
    public CreateVentilatore createCreateVentilatore() {
        return new CreateVentilatore();
    }

    /**
     * Create an instance of {@link GetVentilatoreResponse }
     * 
     */
    public GetVentilatoreResponse createGetVentilatoreResponse() {
        return new GetVentilatoreResponse();
    }

    /**
     * Create an instance of {@link UpdateVentilatore }
     * 
     */
    public UpdateVentilatore createUpdateVentilatore() {
        return new UpdateVentilatore();
    }

    /**
     * Create an instance of {@link PrintQuickFan }
     * 
     */
    public PrintQuickFan createPrintQuickFan() {
        return new PrintQuickFan();
    }

    /**
     * Create an instance of {@link PrintByCountryResponse }
     * 
     */
    public PrintByCountryResponse createPrintByCountryResponse() {
        return new PrintByCountryResponse();
    }

    /**
     * Create an instance of {@link SetGiriAlMinutoResponse }
     * 
     */
    public SetGiriAlMinutoResponse createSetGiriAlMinutoResponse() {
        return new SetGiriAlMinutoResponse();
    }

    /**
     * Create an instance of {@link PrintAll }
     * 
     */
    public PrintAll createPrintAll() {
        return new PrintAll();
    }

    /**
     * Create an instance of {@link GetVentilatore }
     * 
     */
    public GetVentilatore createGetVentilatore() {
        return new GetVentilatore();
    }

    /**
     * Create an instance of {@link PrintAllResponse }
     * 
     */
    public PrintAllResponse createPrintAllResponse() {
        return new PrintAllResponse();
    }

    /**
     * Create an instance of {@link SetGiriAlMinuto }
     * 
     */
    public SetGiriAlMinuto createSetGiriAlMinuto() {
        return new SetGiriAlMinuto();
    }

    /**
     * Create an instance of {@link CreateVentilatoreResponse }
     * 
     */
    public CreateVentilatoreResponse createCreateVentilatoreResponse() {
        return new CreateVentilatoreResponse();
    }

    /**
     * Create an instance of {@link UpdateVentilatoreResponse }
     * 
     */
    public UpdateVentilatoreResponse createUpdateVentilatoreResponse() {
        return new UpdateVentilatoreResponse();
    }

    /**
     * Create an instance of {@link DeleteVentilatoreResponse }
     * 
     */
    public DeleteVentilatoreResponse createDeleteVentilatoreResponse() {
        return new DeleteVentilatoreResponse();
    }

    /**
     * Create an instance of {@link PrintQuickFanResponse }
     * 
     */
    public PrintQuickFanResponse createPrintQuickFanResponse() {
        return new PrintQuickFanResponse();
    }

    /**
     * Create an instance of {@link DeleteVentilatore }
     * 
     */
    public DeleteVentilatore createDeleteVentilatore() {
        return new DeleteVentilatore();
    }

    /**
     * Create an instance of {@link PrintByCountry }
     * 
     */
    public PrintByCountry createPrintByCountry() {
        return new PrintByCountry();
    }

    /**
     * Create an instance of {@link VentilatoreEntity }
     * 
     */
    public VentilatoreEntity createVentilatoreEntity() {
        return new VentilatoreEntity();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteVentilatoreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unisa.it/", name = "deleteVentilatoreResponse")
    public JAXBElement<DeleteVentilatoreResponse> createDeleteVentilatoreResponse(DeleteVentilatoreResponse value) {
        return new JAXBElement<DeleteVentilatoreResponse>(_DeleteVentilatoreResponse_QNAME, DeleteVentilatoreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrintQuickFanResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unisa.it/", name = "printQuickFanResponse")
    public JAXBElement<PrintQuickFanResponse> createPrintQuickFanResponse(PrintQuickFanResponse value) {
        return new JAXBElement<PrintQuickFanResponse>(_PrintQuickFanResponse_QNAME, PrintQuickFanResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteVentilatore }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unisa.it/", name = "deleteVentilatore")
    public JAXBElement<DeleteVentilatore> createDeleteVentilatore(DeleteVentilatore value) {
        return new JAXBElement<DeleteVentilatore>(_DeleteVentilatore_QNAME, DeleteVentilatore.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrintByCountry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unisa.it/", name = "printByCountry")
    public JAXBElement<PrintByCountry> createPrintByCountry(PrintByCountry value) {
        return new JAXBElement<PrintByCountry>(_PrintByCountry_QNAME, PrintByCountry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrintAllResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unisa.it/", name = "printAllResponse")
    public JAXBElement<PrintAllResponse> createPrintAllResponse(PrintAllResponse value) {
        return new JAXBElement<PrintAllResponse>(_PrintAllResponse_QNAME, PrintAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetGiriAlMinuto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unisa.it/", name = "setGiriAlMinuto")
    public JAXBElement<SetGiriAlMinuto> createSetGiriAlMinuto(SetGiriAlMinuto value) {
        return new JAXBElement<SetGiriAlMinuto>(_SetGiriAlMinuto_QNAME, SetGiriAlMinuto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVentilatore }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unisa.it/", name = "getVentilatore")
    public JAXBElement<GetVentilatore> createGetVentilatore(GetVentilatore value) {
        return new JAXBElement<GetVentilatore>(_GetVentilatore_QNAME, GetVentilatore.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateVentilatoreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unisa.it/", name = "createVentilatoreResponse")
    public JAXBElement<CreateVentilatoreResponse> createCreateVentilatoreResponse(CreateVentilatoreResponse value) {
        return new JAXBElement<CreateVentilatoreResponse>(_CreateVentilatoreResponse_QNAME, CreateVentilatoreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateVentilatoreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unisa.it/", name = "updateVentilatoreResponse")
    public JAXBElement<UpdateVentilatoreResponse> createUpdateVentilatoreResponse(UpdateVentilatoreResponse value) {
        return new JAXBElement<UpdateVentilatoreResponse>(_UpdateVentilatoreResponse_QNAME, UpdateVentilatoreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetGiriAlMinutoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unisa.it/", name = "setGiriAlMinutoResponse")
    public JAXBElement<SetGiriAlMinutoResponse> createSetGiriAlMinutoResponse(SetGiriAlMinutoResponse value) {
        return new JAXBElement<SetGiriAlMinutoResponse>(_SetGiriAlMinutoResponse_QNAME, SetGiriAlMinutoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrintByCountryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unisa.it/", name = "printByCountryResponse")
    public JAXBElement<PrintByCountryResponse> createPrintByCountryResponse(PrintByCountryResponse value) {
        return new JAXBElement<PrintByCountryResponse>(_PrintByCountryResponse_QNAME, PrintByCountryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrintAll }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unisa.it/", name = "printAll")
    public JAXBElement<PrintAll> createPrintAll(PrintAll value) {
        return new JAXBElement<PrintAll>(_PrintAll_QNAME, PrintAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateVentilatore }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unisa.it/", name = "createVentilatore")
    public JAXBElement<CreateVentilatore> createCreateVentilatore(CreateVentilatore value) {
        return new JAXBElement<CreateVentilatore>(_CreateVentilatore_QNAME, CreateVentilatore.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVentilatoreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unisa.it/", name = "getVentilatoreResponse")
    public JAXBElement<GetVentilatoreResponse> createGetVentilatoreResponse(GetVentilatoreResponse value) {
        return new JAXBElement<GetVentilatoreResponse>(_GetVentilatoreResponse_QNAME, GetVentilatoreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateVentilatore }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unisa.it/", name = "updateVentilatore")
    public JAXBElement<UpdateVentilatore> createUpdateVentilatore(UpdateVentilatore value) {
        return new JAXBElement<UpdateVentilatore>(_UpdateVentilatore_QNAME, UpdateVentilatore.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrintQuickFan }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unisa.it/", name = "printQuickFan")
    public JAXBElement<PrintQuickFan> createPrintQuickFan(PrintQuickFan value) {
        return new JAXBElement<PrintQuickFan>(_PrintQuickFan_QNAME, PrintQuickFan.class, null, value);
    }

}
