
package it.unisa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for negozioEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="negozioEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="città" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="direttore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nomeNegozio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="provincia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="venditeBirreAlcoliche" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="venditeBirreAnalcoliche" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "negozioEntity", propOrder = {
    "citt\u00e0",
    "direttore",
    "id",
    "nomeNegozio",
    "provincia",
    "regione",
    "venditeBirreAlcoliche",
    "venditeBirreAnalcoliche"
})
public class NegozioEntity {

    protected String città;
    protected String direttore;
    protected int id;
    protected String nomeNegozio;
    protected String provincia;
    protected String regione;
    protected int venditeBirreAlcoliche;
    protected int venditeBirreAnalcoliche;

    /**
     * Gets the value of the città property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCittà() {
        return città;
    }

    /**
     * Sets the value of the città property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCittà(String value) {
        this.città = value;
    }

    /**
     * Gets the value of the direttore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirettore() {
        return direttore;
    }

    /**
     * Sets the value of the direttore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirettore(String value) {
        this.direttore = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the nomeNegozio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeNegozio() {
        return nomeNegozio;
    }

    /**
     * Sets the value of the nomeNegozio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeNegozio(String value) {
        this.nomeNegozio = value;
    }

    /**
     * Gets the value of the provincia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvincia() {
        return provincia;
    }

    /**
     * Sets the value of the provincia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvincia(String value) {
        this.provincia = value;
    }

    /**
     * Gets the value of the regione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegione() {
        return regione;
    }

    /**
     * Sets the value of the regione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegione(String value) {
        this.regione = value;
    }

    /**
     * Gets the value of the venditeBirreAlcoliche property.
     * 
     */
    public int getVenditeBirreAlcoliche() {
        return venditeBirreAlcoliche;
    }

    /**
     * Sets the value of the venditeBirreAlcoliche property.
     * 
     */
    public void setVenditeBirreAlcoliche(int value) {
        this.venditeBirreAlcoliche = value;
    }

    /**
     * Gets the value of the venditeBirreAnalcoliche property.
     * 
     */
    public int getVenditeBirreAnalcoliche() {
        return venditeBirreAnalcoliche;
    }

    /**
     * Sets the value of the venditeBirreAnalcoliche property.
     * 
     */
    public void setVenditeBirreAnalcoliche(int value) {
        this.venditeBirreAnalcoliche = value;
    }

}
