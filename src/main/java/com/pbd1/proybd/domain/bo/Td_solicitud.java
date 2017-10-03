package com.pbd1.proybd.domain.bo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "td_solicitud")
public class Td_solicitud implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "td_codigo_solicitud")
    protected long tdCodSol;

    @Column(name = "estado")
    private String estado;

    @Column(name = "tc_tip_sol_tc_cod_tip_sol")
    private long tcTipSolTcCodTipSol;

    @Column(name = "tc_emp_cod_user")
    private long tcEmpCodUser;

    @Column(name = "tc_prod_cod_equipo")
    private long tcProdCodEquipo;

    @Column(name = "tm_sol_tm_cod_sol")
    private long tmSolTmCodSol;

    public long getTdCodSol() {
        return tdCodSol;
    }

    public void setTdCodSol(long tdCodSol) {
        this.tdCodSol = tdCodSol;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public long getTcTipSolTcCodTipSol() {
        return tcTipSolTcCodTipSol;
    }

    public void setTcTipSolTcCodTipSol(long tcTipSolTcCodTipSol) {
        this.tcTipSolTcCodTipSol = tcTipSolTcCodTipSol;
    }

    public long getTcEmpCodUser() {
        return tcEmpCodUser;
    }

    public void setTcEmpCodUser(long tcEmpCodUser) {
        this.tcEmpCodUser = tcEmpCodUser;
    }

    public long getTcProdCodEquipo() {
        return tcProdCodEquipo;
    }

    public void setTcProdCodEquipo(long tcProdCodEquipo) {
        this.tcProdCodEquipo = tcProdCodEquipo;
    }

    public long getTmSolTmCodSol() {
        return tmSolTmCodSol;
    }

    public void setTmSolTmCodSol(long tmSolTmCodSol) {
        this.tmSolTmCodSol = tmSolTmCodSol;
    }
}
