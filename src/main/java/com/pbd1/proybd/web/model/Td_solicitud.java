package com.pbd1.proybd.web.model;

public class Td_solicitud {

    private long tdCodSol;
    private String estado;
    private long tcTipSolTcCodTipSol;
    private long tcEmpCodUser;
    private long tcProdCodEquipo;
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
