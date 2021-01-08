
package it.unisa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per canzoneEntity complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="canzoneEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cantanto" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="categoria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="incipit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomePezzo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="votiRicevuti" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "canzoneEntity", propOrder = {
    "cantanto",
    "categoria",
    "id",
    "incipit",
    "nomePezzo",
    "votiRicevuti"
})
public class CanzoneEntity {

    protected boolean cantanto;
    protected String categoria;
    protected int id;
    protected String incipit;
    protected String nomePezzo;
    protected int votiRicevuti;

    /**
     * Recupera il valore della proprietà cantanto.
     * 
     */
    public boolean isCantanto() {
        return cantanto;
    }

    /**
     * Imposta il valore della proprietà cantanto.
     * 
     */
    public void setCantanto(boolean value) {
        this.cantanto = value;
    }

    /**
     * Recupera il valore della proprietà categoria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Imposta il valore della proprietà categoria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoria(String value) {
        this.categoria = value;
    }

    /**
     * Recupera il valore della proprietà id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Imposta il valore della proprietà id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Recupera il valore della proprietà incipit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncipit() {
        return incipit;
    }

    /**
     * Imposta il valore della proprietà incipit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncipit(String value) {
        this.incipit = value;
    }

    /**
     * Recupera il valore della proprietà nomePezzo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomePezzo() {
        return nomePezzo;
    }

    /**
     * Imposta il valore della proprietà nomePezzo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomePezzo(String value) {
        this.nomePezzo = value;
    }

    /**
     * Recupera il valore della proprietà votiRicevuti.
     * 
     */
    public int getVotiRicevuti() {
        return votiRicevuti;
    }

    /**
     * Imposta il valore della proprietà votiRicevuti.
     * 
     */
    public void setVotiRicevuti(int value) {
        this.votiRicevuti = value;
    }

}
