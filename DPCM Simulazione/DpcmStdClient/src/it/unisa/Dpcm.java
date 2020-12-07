package it.unisa;

import static it.unisa.Dpcm.FIND_ALL;
import static it.unisa.Dpcm.FIND_BY_EMERGENCY;
import static it.unisa.Dpcm.FIND_BY_ID;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
        @NamedQuery(name = FIND_ALL, query = "SELECT d FROM Dpcm d"),
        @NamedQuery(name = FIND_BY_ID, query = "SELECT d FROM Dpcm d WHERE d.id = ?1"),
        @NamedQuery(name = FIND_BY_EMERGENCY, query = "SELECT d FROM Dpcm d WHERE d.emergenza = ?1")
})
public class Dpcm implements Serializable {
    
    public static final String FIND_ALL = "Dpcm.findAllDpcms";
    public static final String FIND_BY_ID = "Dpcm.findDpcmById";
    public static final String FIND_BY_EMERGENCY = "Dpcm.findDpcmByEmergency";
    
    @Id @GeneratedValue
    private long id;
    private String nome, emergenza, tipo, livello;
    private int numPres;

    public Dpcm() {
        nome = ""; emergenza = ""; tipo = ""; livello = ""; numPres = 0;
    }

    public Dpcm(String nome, String emergenza, String tipo, String livello, int numPres) {
        this.nome = nome;
        this.emergenza = emergenza;
        this.tipo = tipo;
        this.livello = livello;
        this.numPres = numPres;
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmergenza() {
        return emergenza;
    }

    public void setEmergenza(String emergenza) {
        this.emergenza = emergenza;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLivello() {
        return livello;
    }

    public void setLivello(String livello) {
        this.livello = livello;
    }

    public int getNumPres() {
        return numPres;
    }

    public void setNumPres(int numPres) {
        this.numPres = numPres;
    }

    @Override
    public String toString() {
        return "Dpcm{" + "id=" + id + ", nome=" + nome + ", emergenza=" + emergenza + ", tipo=" + tipo + ", livello=" + livello + ", numPres=" + numPres + '}';
    }
    
}
