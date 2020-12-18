
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

    private final static QName _UpdateNegozioResponse_QNAME = new QName("http://unisa.it/", "updateNegozioResponse");
    private final static QName _PrintDrunkPeopleShopsResponse_QNAME = new QName("http://unisa.it/", "printDrunkPeopleShopsResponse");
    private final static QName _GetNegozio_QNAME = new QName("http://unisa.it/", "getNegozio");
    private final static QName _Print_QNAME = new QName("http://unisa.it/", "print");
    private final static QName _PrintByRegionResponse_QNAME = new QName("http://unisa.it/", "printByRegionResponse");
    private final static QName _RemoveNegozioResponse_QNAME = new QName("http://unisa.it/", "removeNegozioResponse");
    private final static QName _PrintResponse_QNAME = new QName("http://unisa.it/", "printResponse");
    private final static QName _CreateNegozioResponse_QNAME = new QName("http://unisa.it/", "createNegozioResponse");
    private final static QName _RemoveNegozio_QNAME = new QName("http://unisa.it/", "removeNegozio");
    private final static QName _UpdateDirettoreResponse_QNAME = new QName("http://unisa.it/", "updateDirettoreResponse");
    private final static QName _PrintDrunkPeopleShops_QNAME = new QName("http://unisa.it/", "printDrunkPeopleShops");
    private final static QName _UpdateDirettore_QNAME = new QName("http://unisa.it/", "updateDirettore");
    private final static QName _NegozioEntity_QNAME = new QName("http://unisa.it/", "negozioEntity");
    private final static QName _CreateNegozio_QNAME = new QName("http://unisa.it/", "createNegozio");
    private final static QName _GetNegozioResponse_QNAME = new QName("http://unisa.it/", "getNegozioResponse");
    private final static QName _PrintByRegion_QNAME = new QName("http://unisa.it/", "printByRegion");
    private final static QName _UpdateNegozio_QNAME = new QName("http://unisa.it/", "updateNegozio");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.unisa
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PrintByRegion }
     * 
     */
    public PrintByRegion createPrintByRegion() {
        return new PrintByRegion();
    }

    /**
     * Create an instance of {@link UpdateNegozio }
     * 
     */
    public UpdateNegozio createUpdateNegozio() {
        return new UpdateNegozio();
    }

    /**
     * Create an instance of {@link CreateNegozio }
     * 
     */
    public CreateNegozio createCreateNegozio() {
        return new CreateNegozio();
    }

    /**
     * Create an instance of {@link NegozioEntity }
     * 
     */
    public NegozioEntity createNegozioEntity() {
        return new NegozioEntity();
    }

    /**
     * Create an instance of {@link UpdateDirettore }
     * 
     */
    public UpdateDirettore createUpdateDirettore() {
        return new UpdateDirettore();
    }

    /**
     * Create an instance of {@link GetNegozioResponse }
     * 
     */
    public GetNegozioResponse createGetNegozioResponse() {
        return new GetNegozioResponse();
    }

    /**
     * Create an instance of {@link PrintResponse }
     * 
     */
    public PrintResponse createPrintResponse() {
        return new PrintResponse();
    }

    /**
     * Create an instance of {@link RemoveNegozioResponse }
     * 
     */
    public RemoveNegozioResponse createRemoveNegozioResponse() {
        return new RemoveNegozioResponse();
    }

    /**
     * Create an instance of {@link Print }
     * 
     */
    public Print createPrint() {
        return new Print();
    }

    /**
     * Create an instance of {@link PrintByRegionResponse }
     * 
     */
    public PrintByRegionResponse createPrintByRegionResponse() {
        return new PrintByRegionResponse();
    }

    /**
     * Create an instance of {@link PrintDrunkPeopleShops }
     * 
     */
    public PrintDrunkPeopleShops createPrintDrunkPeopleShops() {
        return new PrintDrunkPeopleShops();
    }

    /**
     * Create an instance of {@link RemoveNegozio }
     * 
     */
    public RemoveNegozio createRemoveNegozio() {
        return new RemoveNegozio();
    }

    /**
     * Create an instance of {@link UpdateDirettoreResponse }
     * 
     */
    public UpdateDirettoreResponse createUpdateDirettoreResponse() {
        return new UpdateDirettoreResponse();
    }

    /**
     * Create an instance of {@link CreateNegozioResponse }
     * 
     */
    public CreateNegozioResponse createCreateNegozioResponse() {
        return new CreateNegozioResponse();
    }

    /**
     * Create an instance of {@link GetNegozio }
     * 
     */
    public GetNegozio createGetNegozio() {
        return new GetNegozio();
    }

    /**
     * Create an instance of {@link PrintDrunkPeopleShopsResponse }
     * 
     */
    public PrintDrunkPeopleShopsResponse createPrintDrunkPeopleShopsResponse() {
        return new PrintDrunkPeopleShopsResponse();
    }

    /**
     * Create an instance of {@link UpdateNegozioResponse }
     * 
     */
    public UpdateNegozioResponse createUpdateNegozioResponse() {
        return new UpdateNegozioResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateNegozioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unisa.it/", name = "updateNegozioResponse")
    public JAXBElement<UpdateNegozioResponse> createUpdateNegozioResponse(UpdateNegozioResponse value) {
        return new JAXBElement<UpdateNegozioResponse>(_UpdateNegozioResponse_QNAME, UpdateNegozioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrintDrunkPeopleShopsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unisa.it/", name = "printDrunkPeopleShopsResponse")
    public JAXBElement<PrintDrunkPeopleShopsResponse> createPrintDrunkPeopleShopsResponse(PrintDrunkPeopleShopsResponse value) {
        return new JAXBElement<PrintDrunkPeopleShopsResponse>(_PrintDrunkPeopleShopsResponse_QNAME, PrintDrunkPeopleShopsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNegozio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unisa.it/", name = "getNegozio")
    public JAXBElement<GetNegozio> createGetNegozio(GetNegozio value) {
        return new JAXBElement<GetNegozio>(_GetNegozio_QNAME, GetNegozio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Print }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unisa.it/", name = "print")
    public JAXBElement<Print> createPrint(Print value) {
        return new JAXBElement<Print>(_Print_QNAME, Print.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrintByRegionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unisa.it/", name = "printByRegionResponse")
    public JAXBElement<PrintByRegionResponse> createPrintByRegionResponse(PrintByRegionResponse value) {
        return new JAXBElement<PrintByRegionResponse>(_PrintByRegionResponse_QNAME, PrintByRegionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveNegozioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unisa.it/", name = "removeNegozioResponse")
    public JAXBElement<RemoveNegozioResponse> createRemoveNegozioResponse(RemoveNegozioResponse value) {
        return new JAXBElement<RemoveNegozioResponse>(_RemoveNegozioResponse_QNAME, RemoveNegozioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrintResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unisa.it/", name = "printResponse")
    public JAXBElement<PrintResponse> createPrintResponse(PrintResponse value) {
        return new JAXBElement<PrintResponse>(_PrintResponse_QNAME, PrintResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateNegozioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unisa.it/", name = "createNegozioResponse")
    public JAXBElement<CreateNegozioResponse> createCreateNegozioResponse(CreateNegozioResponse value) {
        return new JAXBElement<CreateNegozioResponse>(_CreateNegozioResponse_QNAME, CreateNegozioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveNegozio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unisa.it/", name = "removeNegozio")
    public JAXBElement<RemoveNegozio> createRemoveNegozio(RemoveNegozio value) {
        return new JAXBElement<RemoveNegozio>(_RemoveNegozio_QNAME, RemoveNegozio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDirettoreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unisa.it/", name = "updateDirettoreResponse")
    public JAXBElement<UpdateDirettoreResponse> createUpdateDirettoreResponse(UpdateDirettoreResponse value) {
        return new JAXBElement<UpdateDirettoreResponse>(_UpdateDirettoreResponse_QNAME, UpdateDirettoreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrintDrunkPeopleShops }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unisa.it/", name = "printDrunkPeopleShops")
    public JAXBElement<PrintDrunkPeopleShops> createPrintDrunkPeopleShops(PrintDrunkPeopleShops value) {
        return new JAXBElement<PrintDrunkPeopleShops>(_PrintDrunkPeopleShops_QNAME, PrintDrunkPeopleShops.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDirettore }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unisa.it/", name = "updateDirettore")
    public JAXBElement<UpdateDirettore> createUpdateDirettore(UpdateDirettore value) {
        return new JAXBElement<UpdateDirettore>(_UpdateDirettore_QNAME, UpdateDirettore.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NegozioEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unisa.it/", name = "negozioEntity")
    public JAXBElement<NegozioEntity> createNegozioEntity(NegozioEntity value) {
        return new JAXBElement<NegozioEntity>(_NegozioEntity_QNAME, NegozioEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateNegozio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unisa.it/", name = "createNegozio")
    public JAXBElement<CreateNegozio> createCreateNegozio(CreateNegozio value) {
        return new JAXBElement<CreateNegozio>(_CreateNegozio_QNAME, CreateNegozio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNegozioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unisa.it/", name = "getNegozioResponse")
    public JAXBElement<GetNegozioResponse> createGetNegozioResponse(GetNegozioResponse value) {
        return new JAXBElement<GetNegozioResponse>(_GetNegozioResponse_QNAME, GetNegozioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrintByRegion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unisa.it/", name = "printByRegion")
    public JAXBElement<PrintByRegion> createPrintByRegion(PrintByRegion value) {
        return new JAXBElement<PrintByRegion>(_PrintByRegion_QNAME, PrintByRegion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateNegozio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unisa.it/", name = "updateNegozio")
    public JAXBElement<UpdateNegozio> createUpdateNegozio(UpdateNegozio value) {
        return new JAXBElement<UpdateNegozio>(_UpdateNegozio_QNAME, UpdateNegozio.class, null, value);
    }

}
