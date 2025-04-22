package com.duckers.teart.models;
import jakarta.persistence.*;

@Entity
@Table(name = "enderecos_atelier")
public class EnderecoAtelierModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String rua;

    @Column
    private String numero;

    @Column
    private String logradouro;

    @Column
    private String bairro;

    @Column
    private String cidade;

    @Column
    private String estado;

    @Column
    private String cep;

    @ManyToOne
    @JoinColumn(name = "id_atelier", referencedColumnName = "id", insertable = false, updatable=false)
    private AtelierModel atelier;

    @Column(name = "id_atelier")
    private long idAtelier;


    // Construtor padrao
    public EnderecoAtelierModel() {}

    // Construtor com parametros
    public EnderecoAtelierModel(String rua, String numero, String logradouro, String bairro, String cidade, String estado, String cep, AtelierModel atelier) {
        this.rua = rua;
        this.numero = numero;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.atelier = atelier;
    }

    // GETTERS
    public long getId() {
        return id;
    }

    public String getRua() {
        return rua;
    }

    public String getNumero() {
        return numero;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getCep() {
        return cep;
    }
    
    public long getIdAtelier() {
        return idAtelier;
    }


    // SETTERS
    public void setId(long id) {
        this.id = id;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    
    public void setIdAtelier(long idAtelier) {
        this.idAtelier = idAtelier;
    }
}
