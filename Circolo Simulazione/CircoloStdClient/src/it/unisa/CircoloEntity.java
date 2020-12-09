package it.unisa;

import static it.unisa.CircoloEntity.TROVA_PER_ID;
import static it.unisa.CircoloEntity.TROVA_PER_REGIONE;
import static it.unisa.CircoloEntity.TROVA_TUTTI;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

@Entity(name = "Circolo")
@NamedQueries({
    @NamedQuery(name = TROVA_TUTTI, query = "SELECT c FROM Circolo c"),
    @NamedQuery(name = TROVA_PER_REGIONE, query = "SELECT c FROM Circolo c WHERE "
            + "c.regione = ?1"),
    @NamedQuery(name = TROVA_PER_ID, query = "SELECT c FROM Circolo c WHERE "
            + "c.id = ?1")
})
@XmlRootElement
public class CircoloEntity implements Serializable {

    public final static String TROVA_TUTTI = "Circolo.TrovaTutti";
    public final static String TROVA_PER_REGIONE = "Circolo.TrovaPerRegione";
    public final static String TROVA_PER_ID = "Circolo.TrovaPerId";
    
    public CircoloEntity() {
        nomeCircolo = ""; responsabile = ""; email = "";
        città = ""; provincia = ""; regione = "";
    }
    
    public CircoloEntity(String nomeCircolo, String responsabile, String email, 
            String città, String provincia, String regione) {
        this.nomeCircolo = nomeCircolo;
        this.responsabile = responsabile;
        this.email = email;
        this.città = città;
        this.provincia = provincia;
        this.regione = regione;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomeCircolo() {
        return nomeCircolo;
    }

    public void setNomeCircolo(String nomeCircolo) {
        this.nomeCircolo = nomeCircolo;
    }

    public String getResponsabile() {
        return responsabile;
    }

    public void setResponsabile(String responsabile) {
        this.responsabile = responsabile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCittà() {
        return città;
    }

    public void setCittà(String città) {
        this.città = città;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getRegione() {
        return regione;
    }
    
    public void setRegione(String regione) {
        this.regione = regione;
    }

    @Override
    public String toString() {
        return "CircoloEntity{" + "id=" + id + ", nomeCircolo=" + nomeCircolo + ", responsabile=" + responsabile + ", email=" + email + ", citt\u00e0=" + città + ", provincia=" + provincia + ", regione=" + regione + '}';
    }    
    
    @Id @GeneratedValue
    private long id;
    @NotNull
    @Column(nullable = false, name = "nome_circolo")
    private String nomeCircolo;
    @NotNull
    @Column(nullable = false)
    private String responsabile;
    @NotNull
    @Column(nullable = false)
    private String email;
    @NotNull
    @Column(nullable = false)
    private String città;
    @NotNull
    @Column(nullable = false)
    private String provincia;
    @NotNull
    @Column(nullable = false)
    private String regione;
    
}
