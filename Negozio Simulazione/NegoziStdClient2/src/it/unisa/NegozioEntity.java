package it.unisa;

import static it.unisa.NegozioEntity.TROVA_TUTTI;
import static it.unisa.NegozioEntity.TROVA_PER_ID;
import static it.unisa.NegozioEntity.TROVA_PER_REGIONE;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

@Entity(name = "Negozio")
@NamedQueries({
    @NamedQuery(name = TROVA_TUTTI, query = "SELECT n FROM Negozio n"),
    @NamedQuery(name = TROVA_PER_ID, query = "SELECT n FROM Negozio n "
            + "WHERE n.id = ?1"),
    @NamedQuery(name = TROVA_PER_REGIONE, query = "SELECT n FROM Negozio n "
            + "WHERE n.regione = ?1")
})
@XmlRootElement
public class NegozioEntity implements Serializable {

    public final static String TROVA_TUTTI = "Negozio.TrovaTutti";
    public final static String TROVA_PER_ID = "Negozio.TrovaPerId";
    public final static String TROVA_PER_REGIONE = "Negozio.TrovaPerRegione";
    
    public NegozioEntity() { }

    public NegozioEntity(String nomeNegozio, String direttore,
            int venditeAnnoPrecedente, int venditeAnnoCorrente, String città, 
            String provincia, String regione) {
        this.nomeNegozio = nomeNegozio;
        this.direttore = direttore;
        this.venditeAnnoPrecedente = venditeAnnoPrecedente;
        this.venditeAnnoCorrente = venditeAnnoCorrente;
        this.città = città;
        this.provincia = provincia;
        this.regione = regione;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeNegozio() {
        return nomeNegozio;
    }

    public void setNomeNegozio(String nomeNegozio) {
        this.nomeNegozio = nomeNegozio;
    }

    public int getVenditeAnnoPrecedente() {
        return venditeAnnoPrecedente;
    }

    public void setVenditeAnnoPrecedente(int venditeAnnoPrecedente) {
        this.venditeAnnoPrecedente = venditeAnnoPrecedente;
    }

    public int getVenditeAnnoCorrente() {
        return venditeAnnoCorrente;
    }

    public void setVenditeAnnoCorrente(int venditeAnnoCorrente) {
        this.venditeAnnoCorrente = venditeAnnoCorrente;
    }
    
    
    public String getDirettore() {
        return direttore;
    }

    public void setDirettore(String direttore) {
        this.direttore = direttore;
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
        return "NegozioEntity{" + "id=" + id + ", nomeNegozio=" + nomeNegozio + 
                ", direttore=" + direttore + ", venditeAnnoPrecedente=" + venditeAnnoPrecedente + 
                ", venditeAnnoCorrente=" + venditeAnnoCorrente + ", citt\u00e0=" + 
                città + ", provincia=" + provincia + ", regione=" + regione + '}';
    }
    
    @Id @GeneratedValue
    private int id;
    @NotNull
    @Column(name = "nome_negozio", nullable = false)
    private String nomeNegozio;
    @NotNull
    @Column(nullable = false)
    private String direttore;
    @NotNull
    @Column(name = "vendite_anno_precedente", nullable = false)
    @Min(0)
    private int venditeAnnoPrecedente;
    @NotNull
    @Column(name = "vendite_anno_corrente", nullable = false)
    @Min(0)
    private int venditeAnnoCorrente;
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
