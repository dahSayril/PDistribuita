
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

    private final static QName _OttieniCircoli_QNAME = new QName("http://unisa.it/", "ottieniCircoli");
    private final static QName _OttieniPerProvincia_QNAME = new QName("http://unisa.it/", "ottieniPerProvincia");
    private final static QName _OttieniPerRegione_QNAME = new QName("http://unisa.it/", "ottieniPerRegione");
    private final static QName _AggiornaCircolo_QNAME = new QName("http://unisa.it/", "aggiornaCircolo");
    private final static QName _CircoloEntity_QNAME = new QName("http://unisa.it/", "circoloEntity");
    private final static QName _CreaCircolo_QNAME = new QName("http://unisa.it/", "creaCircolo");
    private final static QName _EliminaCircolo_QNAME = new QName("http://unisa.it/", "eliminaCircolo");
    private final static QName _OttieniCircoliResponse_QNAME = new QName("http://unisa.it/", "ottieniCircoliResponse");
    private final static QName _EliminaCircoloResponse_QNAME = new QName("http://unisa.it/", "eliminaCircoloResponse");
    private final static QName _AggiornaCircoloResponse_QNAME = new QName("http://unisa.it/", "aggiornaCircoloResponse");
    private final static QName _OttieniPerRegioneResponse_QNAME = new QName("http://unisa.it/", "ottieniPerRegioneResponse");
    private final static QName _OttieniCircoloResponse_QNAME = new QName("http://unisa.it/", "ottieniCircoloResponse");
    private final static QName _OttieniCircolo_QNAME = new QName("http://unisa.it/", "ottieniCircolo");
    private final static QName _OttieniPerProvinciaResponse_QNAME = new QName("http://unisa.it/", "ottieniPerProvinciaResponse");
    private final static QName _CreaCircoloResponse_QNAME = new QName("http://unisa.it/", "creaCircoloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.unisa
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OttieniCircolo }
     * 
     */
    public OttieniCircolo createOttieniCircolo() {
        return new OttieniCircolo();
    }

    /**
     * Create an instance of {@link OttieniPerProvinciaResponse }
     * 
     */
    public OttieniPerProvinciaResponse createOttieniPerProvinciaResponse() {
        return new OttieniPerProvinciaResponse();
    }

    /**
     * Create an instance of {@link OttieniCircoloResponse }
     * 
     */
    public OttieniCircoloResponse createOttieniCircoloResponse() {
        return new OttieniCircoloResponse();
    }

    /**
     * Create an instance of {@link CreaCircoloResponse }
     * 
     */
    public CreaCircoloResponse createCreaCircoloResponse() {
        return new CreaCircoloResponse();
    }

    /**
     * Create an instance of {@link EliminaCircoloResponse }
     * 
     */
    public EliminaCircoloResponse createEliminaCircoloResponse() {
        return new EliminaCircoloResponse();
    }

    /**
     * Create an instance of {@link CreaCircolo }
     * 
     */
    public CreaCircolo createCreaCircolo() {
        return new CreaCircolo();
    }

    /**
     * Create an instance of {@link EliminaCircolo }
     * 
     */
    public EliminaCircolo createEliminaCircolo() {
        return new EliminaCircolo();
    }

    /**
     * Create an instance of {@link OttieniCircoliResponse }
     * 
     */
    public OttieniCircoliResponse createOttieniCircoliResponse() {
        return new OttieniCircoliResponse();
    }

    /**
     * Create an instance of {@link AggiornaCircoloResponse }
     * 
     */
    public AggiornaCircoloResponse createAggiornaCircoloResponse() {
        return new AggiornaCircoloResponse();
    }

    /**
     * Create an instance of {@link OttieniPerRegioneResponse }
     * 
     */
    public OttieniPerRegioneResponse createOttieniPerRegioneResponse() {
        return new OttieniPerRegioneResponse();
    }

    /**
     * Create an instance of {@link AggiornaCircolo }
     * 
     */
    public AggiornaCircolo createAggiornaCircolo() {
        return new AggiornaCircolo();
    }

    /**
     * Create an instance of {@link CircoloEntity }
     * 
     */
    public CircoloEntity createCircoloEntity() {
        return new CircoloEntity();
    }

    /**
     * Create an instance of {@link OttieniCircoli }
     * 
     */
    public OttieniCircoli createOttieniCircoli() {
        return new OttieniCircoli();
    }

    /**
     * Create an instance of {@link OttieniPerRegione }
     * 
     */
    public OttieniPerRegione createOttieniPerRegione() {
        return new OttieniPerRegione();
    }

    /**
     * Create an instance of {@link OttieniPerProvincia }
     * 
     */
    public OttieniPerProvincia createOttieniPerProvincia() {
        return new OttieniPerProvincia();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OttieniCircoli }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unisa.it/", name = "ottieniCircoli")
    public JAXBElement<OttieniCircoli> createOttieniCircoli(OttieniCircoli value) {
        return new JAXBElement<OttieniCircoli>(_OttieniCircoli_QNAME, OttieniCircoli.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OttieniPerProvincia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unisa.it/", name = "ottieniPerProvincia")
    public JAXBElement<OttieniPerProvincia> createOttieniPerProvincia(OttieniPerProvincia value) {
        return new JAXBElement<OttieniPerProvincia>(_OttieniPerProvincia_QNAME, OttieniPerProvincia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OttieniPerRegione }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unisa.it/", name = "ottieniPerRegione")
    public JAXBElement<OttieniPerRegione> createOttieniPerRegione(OttieniPerRegione value) {
        return new JAXBElement<OttieniPerRegione>(_OttieniPerRegione_QNAME, OttieniPerRegione.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AggiornaCircolo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unisa.it/", name = "aggiornaCircolo")
    public JAXBElement<AggiornaCircolo> createAggiornaCircolo(AggiornaCircolo value) {
        return new JAXBElement<AggiornaCircolo>(_AggiornaCircolo_QNAME, AggiornaCircolo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CircoloEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unisa.it/", name = "circoloEntity")
    public JAXBElement<CircoloEntity> createCircoloEntity(CircoloEntity value) {
        return new JAXBElement<CircoloEntity>(_CircoloEntity_QNAME, CircoloEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreaCircolo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unisa.it/", name = "creaCircolo")
    public JAXBElement<CreaCircolo> createCreaCircolo(CreaCircolo value) {
        return new JAXBElement<CreaCircolo>(_CreaCircolo_QNAME, CreaCircolo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminaCircolo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unisa.it/", name = "eliminaCircolo")
    public JAXBElement<EliminaCircolo> createEliminaCircolo(EliminaCircolo value) {
        return new JAXBElement<EliminaCircolo>(_EliminaCircolo_QNAME, EliminaCircolo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OttieniCircoliResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unisa.it/", name = "ottieniCircoliResponse")
    public JAXBElement<OttieniCircoliResponse> createOttieniCircoliResponse(OttieniCircoliResponse value) {
        return new JAXBElement<OttieniCircoliResponse>(_OttieniCircoliResponse_QNAME, OttieniCircoliResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminaCircoloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unisa.it/", name = "eliminaCircoloResponse")
    public JAXBElement<EliminaCircoloResponse> createEliminaCircoloResponse(EliminaCircoloResponse value) {
        return new JAXBElement<EliminaCircoloResponse>(_EliminaCircoloResponse_QNAME, EliminaCircoloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AggiornaCircoloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unisa.it/", name = "aggiornaCircoloResponse")
    public JAXBElement<AggiornaCircoloResponse> createAggiornaCircoloResponse(AggiornaCircoloResponse value) {
        return new JAXBElement<AggiornaCircoloResponse>(_AggiornaCircoloResponse_QNAME, AggiornaCircoloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OttieniPerRegioneResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unisa.it/", name = "ottieniPerRegioneResponse")
    public JAXBElement<OttieniPerRegioneResponse> createOttieniPerRegioneResponse(OttieniPerRegioneResponse value) {
        return new JAXBElement<OttieniPerRegioneResponse>(_OttieniPerRegioneResponse_QNAME, OttieniPerRegioneResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OttieniCircoloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unisa.it/", name = "ottieniCircoloResponse")
    public JAXBElement<OttieniCircoloResponse> createOttieniCircoloResponse(OttieniCircoloResponse value) {
        return new JAXBElement<OttieniCircoloResponse>(_OttieniCircoloResponse_QNAME, OttieniCircoloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OttieniCircolo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unisa.it/", name = "ottieniCircolo")
    public JAXBElement<OttieniCircolo> createOttieniCircolo(OttieniCircolo value) {
        return new JAXBElement<OttieniCircolo>(_OttieniCircolo_QNAME, OttieniCircolo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OttieniPerProvinciaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unisa.it/", name = "ottieniPerProvinciaResponse")
    public JAXBElement<OttieniPerProvinciaResponse> createOttieniPerProvinciaResponse(OttieniPerProvinciaResponse value) {
        return new JAXBElement<OttieniPerProvinciaResponse>(_OttieniPerProvinciaResponse_QNAME, OttieniPerProvinciaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreaCircoloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unisa.it/", name = "creaCircoloResponse")
    public JAXBElement<CreaCircoloResponse> createCreaCircoloResponse(CreaCircoloResponse value) {
        return new JAXBElement<CreaCircoloResponse>(_CreaCircoloResponse_QNAME, CreaCircoloResponse.class, null, value);
    }

}
