package com.duckers.teart.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "enderecos_usuario")
public class EnderecoUsuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private long idUsuario;
    @Column
    private String rua;
    @Column
    private int numero;
    @Column
    private String bairro;
    @Column
    private String cidade;
    @Column
    private String estado;
    @Column
    private String pais;
    @Column
    private String cep;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "usuario_id", referencedColumnName = "id")
    private Usuario usuario;

    public EnderecoUsuario() {
    }

    public EnderecoUsuario(long idUsuario, String rua, int numero, String bairro, String cidade, String estado, String pais, String cep, Usuario usuario) {
        this.idUsuario = idUsuario;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.cep = cep;
        this.usuario = usuario;
    }

}