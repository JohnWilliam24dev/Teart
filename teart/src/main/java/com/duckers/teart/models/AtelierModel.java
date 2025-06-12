package com.duckers.teart.models;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;

@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@Entity
@Table(name = "ateliers")
public class AtelierModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String nome;

    @Column
    private String cnpj;

    @OneToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    @JoinColumn(name = "id_dono_atelier", referencedColumnName = "id", insertable = false, updatable = false)
    private DonoAtelierModel donoAtelierModel;

    @Column(name = "id_dono_atelier")
    private long idDonoAtelier;
    

    @OneToMany(mappedBy = "atelier", cascade = { CascadeType.PERSIST })
    private List<ServicoModel> servicos;

    @OneToMany(mappedBy = "atelier", cascade = { CascadeType.PERSIST })
    private List<ProdutoModel> produtos;

    @OneToMany(mappedBy = "atelier", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<EnderecoAtelierModel> enderecosAtelier;

    // Construtor padrão
    public AtelierModel() {}

    // Construtor com parâmetros
    public AtelierModel(String nome, String cnpj, DonoAtelierModel donoAtelierModel) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.donoAtelierModel = donoAtelierModel;
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

    public DonoAtelierModel getDonoAtelierModel() {
        return donoAtelierModel;
    }

    public void setDonoAtelierModel(DonoAtelierModel donoAtelierModel) {
        this.donoAtelierModel = donoAtelierModel;
    }

    public List<EnderecoAtelierModel> getEnderecosAtelier() {
        return enderecosAtelier;
    }

    public void setEnderecosAtelier(List<EnderecoAtelierModel> enderecosAtelier) {
        this.enderecosAtelier = enderecosAtelier;
    }

    public List<ProdutoModel> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<ProdutoModel> produtos) {
        this.produtos = produtos;
    }

    public List<ServicoModel> getServicos() {
        return servicos;
    }

    public void setServicos(List<ServicoModel> servicos) {
        this.servicos = servicos;
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
