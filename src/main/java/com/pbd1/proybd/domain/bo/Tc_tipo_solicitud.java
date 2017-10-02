package com.pbd1.proybd.domain.bo;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "tc_tipo_solicitud")
public class Tc_tipo_solicitud implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tc_codigo_tipo_solicitud")
    protected long codTipoSol;

    @Column(name = "descripcion")
    private String descripcion;

    public long getCodTipoSol() {
        return codTipoSol;
    }

    public void setCodTipoSol(long codTipoSol) {
        this.codTipoSol = codTipoSol;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
