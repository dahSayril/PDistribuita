package it.unisa;

import static it.unisa.CorsoEntity.TROVA_PER_CATEGORIA;
import static it.unisa.CorsoEntity.TROVA_PER_ID;
import static it.unisa.CorsoEntity.TROVA_TUTTI;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity(name = "Corso")
@NamedQueries({
    @NamedQuery(name = TROVA_TUTTI, query = "SELECT c FROM Corso c"),
    @NamedQuery(name = TROVA_PER_ID, query = "SELECT c FROM Corso c WHERE c.id = ?1"),
    @NamedQuery(name = TROVA_PER_CATEGORIA, query = "SELECT c FROM Corso c WHERE "
            + "c.categoria = ?1")
})
public class CorsoEntity implements Serializable {

    public static final String TROVA_TUTTI = "Corso.TrovaTutti";
    public static final String TROVA_PER_ID = "Corso.TrovaPerId";
    public static final String TROVA_PER_CATEGORIA = "Corso.TrovaPerCategoria";
    
    public CorsoEntity() { }

    public CorsoEntity(String nomeCorso, CorsoLaurea corsoLaurea, Tipo tipo, 
            Categoria categoria, int numStudenti) {
        this.nomeCorso = nomeCorso;
        this.corsoLaurea = corsoLaurea;
        this.tipo = tipo;
        this.categoria = categoria;
        this.numStudenti = numStudenti;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeCorso() {
        return nomeCorso;
    }

    public void setNomeCorso(String nomeCorso) {
        this.nomeCorso = nomeCorso;
    }

    public CorsoLaurea getCorsoLaurea() {
        return corsoLaurea;
    }

    public void setCorsoLaurea(CorsoLaurea corsoLaurea) {
        this.corsoLaurea = corsoLaurea;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public int getNumStudenti() {
        return numStudenti;
    }

    public void setNumStudenti(int numStudenti) {
        this.numStudenti = numStudenti;
    }

    @Override
    public String toString() {
        return "CorsoEntity{" + "id=" + id + ", nomeCorso=" + nomeCorso + ", corsoLaurea=" + corsoLaurea + ", tipo=" + tipo + ", categoria=" + categoria + ", numStudenti=" + numStudenti + '}';
    }
      
    @Id @GeneratedValue
    private int id;
    @NotNull
    @Column(nullable = false, name = "nome_corso")
    private String nomeCorso;
    @NotNull
    @Column(nullable = false, name = "corso_laurea")
    @Enumerated(EnumType.STRING)
    private CorsoLaurea corsoLaurea;
    @NotNull
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Tipo tipo;
    @NotNull
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Categoria categoria;
    @NotNull
    @Column(nullable = false, name = "numero_studenti")
    @Min(0)
    private int numStudenti;
    
}
