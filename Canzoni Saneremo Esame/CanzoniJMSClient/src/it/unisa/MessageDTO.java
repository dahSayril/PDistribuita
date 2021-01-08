package it.unisa;

import java.io.Serializable;

public class MessageDTO implements Serializable{

    public MessageDTO(String nome, String incipit) {
        this.nome = nome;
        this.incipit = incipit;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIncipit() {
        return incipit;
    }

    public void setIncipit(String incipit) {
        this.incipit = incipit;
    }

    @Override
    public String toString() {
        return "MessageDTO{" + "nome=" + nome + ", incipit=" + incipit + '}';
    }
    
    private String nome;
    private String incipit;
    
}
