package com.duckers.teart.models;
import jakarta.persistence.*;


@Entity
@Table(name = "donos_atelier")
public class DonoAtelierModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String nomeSocial;

    @Column
    private String nomeUsuario;

    @Column
    private String email;

    @Column
    private String senha;

    @Column
    private String cpf;

    @OneToOne(mappedBy = "donoAtelierModel", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private AtelierModel atelier;

    // Construtor padrão
    public DonoAtelierModel() {}

    // Construtor com parâmetros
    public DonoAtelierModel(String nomeSocial, String nomeUsuario, String email, String senha, String cpf, AtelierModel atelier) {
        this.nomeSocial = nomeSocial;
        this.nomeUsuario = nomeUsuario;
        this.email = email;
        this.senha = senha;
        this.cpf = cpf;
        this.atelier = atelier;
    }

    // GETTERS
    public long getId() {
        return id;
    }

    public String getNomeSocial() {
        return nomeSocial;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public String getCpf() {
        return cpf;
    }

    public AtelierModel getAtelier() {
        return atelier;
    }

    // SETTERS
    public void setId(long id) {
        this.id = id;
    }

    public void setNomeSocial(String nomeSocial) {
        this.nomeSocial = nomeSocial;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setAtelier(AtelierModel atelier) {
        this.atelier = atelier;
    }
}
