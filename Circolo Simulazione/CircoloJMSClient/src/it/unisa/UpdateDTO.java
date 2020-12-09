package it.unisa;

import java.io.Serializable;

public class UpdateDTO implements Serializable {  

    public UpdateDTO(long id, String nomeCircolo, String responsabile) {
        this.id = id;
        this.nomeCircolo = nomeCircolo;
        this.responsabile = responsabile;
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

    @Override
    public String toString() {
        return "UpdateDTO{" + "id=" + id + ", nomeCircolo=" + nomeCircolo + ", responsabile=" + responsabile + '}';
    }
    
    private long id;
    private String nomeCircolo;
    private String responsabile;
    
}
