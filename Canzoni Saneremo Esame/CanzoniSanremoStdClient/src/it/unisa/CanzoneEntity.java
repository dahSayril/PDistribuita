package it.unisa;


import static it.unisa.CanzoneEntity.TROVA_PER_CATEGORIA;
import static it.unisa.CanzoneEntity.TROVA_PER_ID;
import static it.unisa.CanzoneEntity.TROVA_TUTTI;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity(name = "Canzone")
@NamedQueries({
    @NamedQuery(name = TROVA_TUTTI, query = "SELECT c FROM Canzone c"),
    @NamedQuery(name = TROVA_PER_ID, query = "SELECT c FROM Canzone c WHERE c.id = ?1"),
    @NamedQuery(name = TROVA_PER_CATEGORIA, query = "SELECT c FROM Canzone c"
        + " WHERE c.categoria = :categoria")
})
public class CanzoneEntity implements Serializable {
  
    public static final String TROVA_TUTTI = "Canzone.TrovaTutti";
    public static final String TROVA_PER_ID = "Canzone.TrovaPerId";
    public static final String TROVA_PER_CATEGORIA = "Canzone.TrovaPerCategoria";

    public CanzoneEntity() { }

    public CanzoneEntity(String nomePezzo, String categoria, String incipit, 
            boolean cantanto, int votiRicevuti) {
        this.nomePezzo = nomePezzo;
        this.categoria = categoria;
        this.incipit = incipit;
        this.cantanto = cantanto;
        this.votiRicevuti = votiRicevuti;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomePezzo() {
        return nomePezzo;
    }

    public void setNomePezzo(String nomePezzo) {
        this.nomePezzo = nomePezzo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getIncipit() {
        return incipit;
    }

    public void setIncipit(String incipit) {
        this.incipit = incipit;
    }

    public boolean isCantanto() {
        return cantanto;
    }

    public void setCantanto(boolean cantanto) {
        this.cantanto = cantanto;
    }

    public int getVotiRicevuti() {
        return votiRicevuti;
    }

    public void setVotiRicevuti(int votiRicevuti) {
        this.votiRicevuti = votiRicevuti;
    }

    @Override
    public String toString() {
        return "CanzoneEntity{" + "id=" + id + ", nomePezzo=" + nomePezzo + 
                ", categoria=" + categoria + ", incipit=" + incipit + 
                ", cantanto=" + cantanto + ", votiRicevuti=" + votiRicevuti + 
                '}';
    }
    
    @Id @GeneratedValue
    private int id;
    
    @NotNull
    @Column(name = "nome", nullable = false)
    private String nomePezzo;
    
    @NotNull
    @Column(nullable = false)
    private String categoria;
    
    @NotNull
    @Column(nullable = false)
    private String incipit;
    
    @NotNull
    @Column(nullable = false)
    private boolean cantanto;
    
    @NotNull @Min(0)
    @Column(name = "voti", nullable = false)
    private int votiRicevuti;
    
}
