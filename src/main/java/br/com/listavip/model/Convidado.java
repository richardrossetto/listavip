package br.com.listavip.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by richard on 25/11/17.
 */

@Data
@Entity(name = "convidado")
public class Convidado {

    @Id
    @GeneratedValue
    private Long id;

    private String nome;
    private String email;
    private String telefone;

    public Convidado(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public Convidado() {
    }
}
