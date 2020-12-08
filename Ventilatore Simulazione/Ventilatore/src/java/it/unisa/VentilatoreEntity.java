package it.unisa;

import static it.unisa.VentilatoreEntity.FIND_ALL;
import static it.unisa.VentilatoreEntity.FIND_BY_COUNTRY;
import static it.unisa.VentilatoreEntity.FIND_BY_ID;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

@Entity(name = "Ventilatore")
@NamedQueries({
    @NamedQuery(name = FIND_ALL, query = "SELECT v FROM Ventilatore v"),
    @NamedQuery(name = FIND_BY_ID, query = "SELECT v FROM Ventilatore v "
            + "WHERE v.id = ?1"),
    @NamedQuery(name = FIND_BY_COUNTRY, query = "SELECT v FROM Ventilatore v "
            + "WHERE v.nazione = ?1")
})
@XmlRootElement
public class VentilatoreEntity implements Serializable {

    public final static String FIND_ALL = "Ventilatore.trovaTuttiVentilatori";
    public final static String FIND_BY_ID = "Ventilatore.trovaVentilatoreDaId";
    public final static String FIND_BY_COUNTRY = "Ventilatore.trovaVentilatoriInNazione";
    
    public VentilatoreEntity() {
        modello = ""; marca = ""; nazione = "";
        giriMinuto = 0; rumore = 0; elemVenduti = 0;
    }
    
    public VentilatoreEntity(String modello, String marca, String nazione, 
            int giriMinuto, int rumore, int elemVenduti) {
        this.modello = modello;
        this.marca = marca;
        this.nazione = nazione;
        this.giriMinuto = giriMinuto;
        this.rumore = rumore;
        this.elemVenduti = elemVenduti;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNazione() {
        return nazione;
    }

    public void setNazione(String nazione) {
        this.nazione = nazione;
    }

    public int getGiriMinuto() {
        return giriMinuto;
    }

    public void setGiriMinuto(int giriMinuto) {
        this.giriMinuto = giriMinuto;
    }

    public int getRumore() {
        return rumore;
    }

    public void setRumore(int rumore) {
        this.rumore = rumore;
    }

    public int getElemVenduti() {
        return elemVenduti;
    }

    public void setElemVenduti(int elemVenduti) {
        this.elemVenduti = elemVenduti;
    }

    @Override
    public String toString() {
        return "VentilatoreEntity{" + "id=" + id + ", modello=" + modello + ", marca=" + marca + ", nazione=" + nazione + ", giriMinuto=" + giriMinuto + ", rumore=" + rumore + ", elemVenduti=" + elemVenduti + '}';
    }
    
    @Id @GeneratedValue
    private long id;
    @NotNull
    @Column(nullable = false)
    private String modello;
    @NotNull
    @Column(nullable = false)
    private String marca;
    @NotNull
    @Min(value = 0)
    @Column(name = "giri_al_minuto", nullable = false)
    private int giriMinuto;
    @NotNull
    @Column(nullable = false)
    @Min(value = 0)
    @Max(value = 10)
    private int rumore;
    @NotNull
    @Min(value = 0)
    @Column(name = "elementi_venduti", nullable = false)
    private int elemVenduti;
    @NotNull
    @Column(nullable = false)
    private String nazione;
    
}
