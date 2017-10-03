package com.pbd1.proybd.web.model;

public class Td_factura {

    private long idCorrelDet;
    private long tdCodFact;
    private long valorProd;
    private long descuento;
    private long tcProdCodEquipo;
    private String tmFactSerieFact;
    private long tmFactNumFact;

    public long getIdCorrelDet() {
        return idCorrelDet;
    }

    public void setIdCorrelDet(long idCorrelDet) {
        this.idCorrelDet = idCorrelDet;
    }

    public long getTdCodFact() {
        return tdCodFact;
    }

    public void setTdCodFact(long tdCodFact) {
        this.tdCodFact = tdCodFact;
    }

    public long getValorProd() {
        return valorProd;
    }

    public void setValorProd(long valorProd) {
        this.valorProd = valorProd;
    }

    public long getDescuento() {
        return descuento;
    }

    public void setDescuento(long descuento) {
        this.descuento = descuento;
    }

    public long getTcProdCodEquipo() {
        return tcProdCodEquipo;
    }

    public void setTcProdCodEquipo(long tcProdCodEquipo) {
        this.tcProdCodEquipo = tcProdCodEquipo;
    }

    public String getTmFactSerieFact() {
        return tmFactSerieFact;
    }

    public void setTmFactSerieFact(String tmFactSerieFact) {
        this.tmFactSerieFact = tmFactSerieFact;
    }

    public long getTmFactNumFact() {
        return tmFactNumFact;
    }

    public void setTmFactNumFact(long tmFactNumFact) {
        this.tmFactNumFact = tmFactNumFact;
    }
}
