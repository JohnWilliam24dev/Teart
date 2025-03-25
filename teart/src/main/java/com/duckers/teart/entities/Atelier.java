package com.duckers.teart.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
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
    @Column
    private long idDonoAtelier;
    @OneToMany(mappedBy = "atelier", cascade = CascadeType.ALL)
    private List<EnderecoAtelier> enderecoAtelierList = new ArrayList<>();

    public Atelier() {
    }

    public Atelier(String nome, String cnpj, long idDonoAtelier, List<EnderecoAtelier> enderecoAtelierList) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.idDonoAtelier = idDonoAtelier;
        this.enderecoAtelierList = enderecoAtelierList;
    }

}
