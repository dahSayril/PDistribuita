
package it.unisa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per taskEntity complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="taskEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="assegnatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oreLavoro" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="percentualeCompletamento" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tipo" type="{http://unisa.it/}tipo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "taskEntity", propOrder = {
    "assegnatario",
    "id",
    "nome",
    "oreLavoro",
    "percentualeCompletamento",
    "tipo"
})
public class TaskEntity {

    protected String assegnatario;
    protected int id;
    protected String nome;
    protected int oreLavoro;
    protected int percentualeCompletamento;
    protected Tipo tipo;

    /**
     * Recupera il valore della proprietà assegnatario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssegnatario() {
        return assegnatario;
    }

    /**
     * Imposta il valore della proprietà assegnatario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssegnatario(String value) {
        this.assegnatario = value;
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
     * Recupera il valore della proprietà nome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Imposta il valore della proprietà nome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Recupera il valore della proprietà oreLavoro.
     * 
     */
    public int getOreLavoro() {
        return oreLavoro;
    }

    /**
     * Imposta il valore della proprietà oreLavoro.
     * 
     */
    public void setOreLavoro(int value) {
        this.oreLavoro = value;
    }

    /**
     * Recupera il valore della proprietà percentualeCompletamento.
     * 
     */
    public int getPercentualeCompletamento() {
        return percentualeCompletamento;
    }

    /**
     * Imposta il valore della proprietà percentualeCompletamento.
     * 
     */
    public void setPercentualeCompletamento(int value) {
        this.percentualeCompletamento = value;
    }

    /**
     * Recupera il valore della proprietà tipo.
     * 
     * @return
     *     possible object is
     *     {@link Tipo }
     *     
     */
    public Tipo getTipo() {
        return tipo;
    }

    /**
     * Imposta il valore della proprietà tipo.
     * 
     * @param value
     *     allowed object is
     *     {@link Tipo }
     *     
     */
    public void setTipo(Tipo value) {
        this.tipo = value;
    }

}
