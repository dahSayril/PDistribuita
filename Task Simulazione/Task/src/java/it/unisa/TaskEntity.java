/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa;

import static it.unisa.TaskEntity.TROVA_NON_COMPLETATI;
import static it.unisa.TaskEntity.TROVA_PER_ASSEGNATARIO;
import static it.unisa.TaskEntity.TROVA_PER_ID;
import static it.unisa.TaskEntity.TROVA_PER_ORE_LAVORO;
import static it.unisa.TaskEntity.TROVA_PER_ORE_MINIME_LAVORO;
import static it.unisa.TaskEntity.TROVA_PER_TIPO;
import static it.unisa.TaskEntity.TROVA_TUTTI;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.EnumType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author CORSO_PD
 */
@Entity(name = "Task")
@NamedQueries({
    @NamedQuery(name = TROVA_PER_ID, query = "SELECT t FROM Task t WHERE "
            + "t.id = ?1"),
    @NamedQuery(name = TROVA_PER_TIPO, query = "SELECT t FROM Task t WHERE "
            + "t.tipo = ?1"),
    @NamedQuery(name = TROVA_PER_ORE_LAVORO, query = "SELECT t FROM Task t WHERE "
            + "t.oreLavoro = ?1"),
    @NamedQuery(name = TROVA_PER_ASSEGNATARIO, query = "SELECT t FROM Task t WHERE "
            + "t.assegnatario = ?1"),
    @NamedQuery(name = TROVA_PER_ORE_MINIME_LAVORO, query = "SELECT t FROM Task t WHERE "
            + "t.oreLavoro < ?1"),
    @NamedQuery(name = TROVA_NON_COMPLETATI, query = "SELECT t FROM Task t WHERE "
            + "t.percentualeCompletamento < 100"),
    @NamedQuery(name = TROVA_TUTTI, query = "Select t FROM Task t")
})
@XmlRootElement
public class TaskEntity implements Serializable {

    public static final String TROVA_PER_ID = "Task.TrovaPerId";
    public static final String TROVA_PER_TIPO = "Task.TrovaPerTipo";
    public static final String TROVA_PER_ORE_LAVORO = "Task.TrovaPerOreLavoro";
    public static final String TROVA_PER_ASSEGNATARIO = "Task.TrovaPerAssegnatario";
    public static final String TROVA_PER_ORE_MINIME_LAVORO = "Task.TrovaPerOreMinimeLavoro";
    public static final String TROVA_NON_COMPLETATI = "Task.TrovaPerNonCompletati";
    public static final String TROVA_TUTTI = "Task.TrovaTutti";
    
    public TaskEntity() { }

    public TaskEntity(String nome, Tipo tipo, int oreLavoro, String assegnatario, 
            int percentualeCompletamento) {
        this.nome = nome;
        this.tipo = tipo;
        this.oreLavoro = oreLavoro;
        this.assegnatario = assegnatario;
        this.percentualeCompletamento = percentualeCompletamento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public int getOreLavoro() {
        return oreLavoro;
    }

    public void setOreLavoro(int oreLavoro) {
        this.oreLavoro = oreLavoro;
    }

    public String getAssegnatario() {
        return assegnatario;
    }

    public void setAssegnatario(String assegnatario) {
        this.assegnatario = assegnatario;
    }

    public int getPercentualeCompletamento() {
        return percentualeCompletamento;
    }

    public void setPercentualeCompletamento(int percentualeCompletamento) {
        this.percentualeCompletamento = percentualeCompletamento;
    }

    @Override
    public String toString() {
        return "Task{" + "id=" + id + ", nome=" + nome + ", tipo=" + tipo + 
                ", oreLavoro=" + oreLavoro + ", assegnatario=" + assegnatario + 
                ", percentualeCompletamento=" + percentualeCompletamento + '}';
    }
    
    @PrePersist @PreUpdate
    private void validate() {
        if(oreLavoro < 1 || oreLavoro > 8)
            throw new IllegalArgumentException("Invalid hours work");
        if(percentualeCompletamento < 0 || percentualeCompletamento > 100)
            throw new IllegalArgumentException("Invalid percent complete");
    }
    
    @Id @GeneratedValue
    private int id;
    @NotNull
    @Column(nullable = false)
    private String nome;
    @NotNull
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Tipo tipo;
    @NotNull
    @Column(name = "ore_lavoro", nullable = false)
    private int oreLavoro;
    @NotNull
    @Column(nullable = false)
    private String assegnatario;
    @NotNull
    @Column(name = "percentuale_completamento", nullable = false)
    private int percentualeCompletamento;
    
}
