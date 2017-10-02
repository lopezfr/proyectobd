package com.pbd1.proybd.domain.bo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "td_factura")
public class Td_factura implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "correlativo_detalle")
    protected long idCorrelDet;

    @Column(name = "td_codigo_factura")
    private long tdCodFact;

    @Column(name = "valor_producto")
    private long valorProd;

    @Column(name = "descuento")
    private long descuento;

    @Column(name = "tc_producto_codigo_equipo")
    private long tcProdCodEquipo;

    @Column(name = "tm_factura_serie_factura")
    private String tmFactSerieFact;

    @Column(name = "tm_factura_no_factura")
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
