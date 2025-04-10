package com.duckers.teart.entities;
import java.util.List;
import jakarta.persistence.*;

@Entity
@Table(name = "ateliers")
public class Atelier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String nome;

    @Column
    private String cnpj;

    @OneToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    @JoinColumn(name = "id_dono_atelier", referencedColumnName = "id", insertable = false, updatable = false)
    private DonoAtelier donoAtelier;

    @Column(name = "id_dono_atelier")
    private long idDonoAtelier;
    

    @OneToMany(mappedBy = "atelier", cascade = { CascadeType.PERSIST })
    private List<Servico> servicos;

    @OneToMany(mappedBy = "atelier", cascade = { CascadeType.PERSIST })
    private List<Produto> produtos;

    @OneToMany(mappedBy = "atelier", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<EnderecoAtelier> enderecosAtelier;

    // Construtor padrão
    public Atelier() {}

    // Construtor com parâmetros
    public Atelier(String nome, String cnpj, DonoAtelier donoAtelier) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.donoAtelier = donoAtelier;
    }

    // GETTERS
    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public long getIdDonoAtelier() {
        return idDonoAtelier;
    }

    // SETTERS
    public void setId(long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    public void setIdDonoAtelier(long idDonoAtelier) {
        this.idDonoAtelier = idDonoAtelier;
    }
}
