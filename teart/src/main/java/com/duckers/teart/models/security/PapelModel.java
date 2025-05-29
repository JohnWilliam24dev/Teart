package com.duckers.teart.models.security;

import jakarta.persistence.*;

@Entity
@Table(name = "papeis")
public class PapelModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String papel;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_usuario", referencedColumnName = "id", insertable = false, updatable = false)
    private UsuarioModel usuarioModel;

    @Column(name = "id_usuario")
    private long usuarioId;

    public PapelModel() {
    }

    public PapelModel(String papel) {
        this.papel = papel;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPapel() {
        return papel;
    }

    public void setPapel(String papel) {
        this.papel = papel;
    }

    @Override
    public String toString() {
        return "Papel{" +
                "id=" + id +
                ", papel='" + papel + '\'' +
                '}';
    }

    public UsuarioModel getUsuario() {
        return usuarioModel;
    }

    public void setUsuario(UsuarioModel usuarioModel) {
        this.usuarioModel = usuarioModel;
    }

    public long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(long usuarioId) {
        this.usuarioId = usuarioId;
    }
}
