
package it.unisa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per updateVotesResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="updateVotesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="songUpdated" type="{http://unisa.it/}canzoneEntity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateVotesResponse", propOrder = {
    "songUpdated"
})
public class UpdateVotesResponse {

    protected CanzoneEntity songUpdated;

    /**
     * Recupera il valore della proprietà songUpdated.
     * 
     * @return
     *     possible object is
     *     {@link CanzoneEntity }
     *     
     */
    public CanzoneEntity getSongUpdated() {
        return songUpdated;
    }

    /**
     * Imposta il valore della proprietà songUpdated.
     * 
     * @param value
     *     allowed object is
     *     {@link CanzoneEntity }
     *     
     */
    public void setSongUpdated(CanzoneEntity value) {
        this.songUpdated = value;
    }

}
