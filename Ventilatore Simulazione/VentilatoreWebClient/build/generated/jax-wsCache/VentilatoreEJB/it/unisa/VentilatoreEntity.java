
package it.unisa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ventilatoreEntity complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ventilatoreEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="elemVenduti" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="giriMinuto" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="marca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modello" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rumore" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ventilatoreEntity", propOrder = {
    "elemVenduti",
    "giriMinuto",
    "id",
    "marca",
    "modello",
    "nazione",
    "rumore"
})
public class VentilatoreEntity {

    protected int elemVenduti;
    protected int giriMinuto;
    protected long id;
    protected String marca;
    protected String modello;
    protected String nazione;
    protected int rumore;

    /**
     * Recupera il valore della proprietà elemVenduti.
     * 
     */
    public int getElemVenduti() {
        return elemVenduti;
    }

    /**
     * Imposta il valore della proprietà elemVenduti.
     * 
     */
    public void setElemVenduti(int value) {
        this.elemVenduti = value;
    }

    /**
     * Recupera il valore della proprietà giriMinuto.
     * 
     */
    public int getGiriMinuto() {
        return giriMinuto;
    }

    /**
     * Imposta il valore della proprietà giriMinuto.
     * 
     */
    public void setGiriMinuto(int value) {
        this.giriMinuto = value;
    }

    /**
     * Recupera il valore della proprietà id.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Imposta il valore della proprietà id.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Recupera il valore della proprietà marca.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Imposta il valore della proprietà marca.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarca(String value) {
        this.marca = value;
    }

    /**
     * Recupera il valore della proprietà modello.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModello() {
        return modello;
    }

    /**
     * Imposta il valore della proprietà modello.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModello(String value) {
        this.modello = value;
    }

    /**
     * Recupera il valore della proprietà nazione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazione() {
        return nazione;
    }

    /**
     * Imposta il valore della proprietà nazione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazione(String value) {
        this.nazione = value;
    }

    /**
     * Recupera il valore della proprietà rumore.
     * 
     */
    public int getRumore() {
        return rumore;
    }

    /**
     * Imposta il valore della proprietà rumore.
     * 
     */
    public void setRumore(int value) {
        this.rumore = value;
    }

}
