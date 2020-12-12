package it.unisa;

import static it.unisa.CdEntity.TROVA_PER_ID;
import static it.unisa.CdEntity.TROVA_TUTTI;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

@Entity(name = "Cd")
@NamedQueries({
    @NamedQuery(name = TROVA_TUTTI, query = "SELECT cd FROM Cd cd"),
    @NamedQuery(name = TROVA_PER_ID, query = "SELECT cd FROM Cd cd WHERE cd.id = ?1")
})
@XmlRootElement
public class CdEntity implements Serializable {

    public CdEntity() {
        
    }

    public CdEntity(String id, String titolo, String autore, double prezzo) {
        this.id = id;
        this.titolo = titolo;
        this.autore = autore;
        this.prezzo = prezzo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return "CdEntity{" + "id=" + id + ", titolo=" + titolo + 
                ", autore=" + autore + ", prezzo=" + prezzo + '}';
    }
     
    @Id
    private String id;
    @NotNull
    @Column(nullable = false)
    private String titolo;
    @NotNull
    @Column(nullable = false)
    private String autore;
    @NotNull
    @Min(0)
    @Column(nullable = false)
    private double prezzo;
    
    public static final String TROVA_TUTTI = "Cd.TrovaTutti";
    public static final String TROVA_PER_ID = "Cd.TrovaPerId";
    
}
