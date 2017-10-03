package com.pbd1.proybd.service;

import com.pbd1.proybd.domain.bo.Td_factura;
import com.pbd1.proybd.domain.repository.Td_facturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Td_facturaImpl implements Td_facturaService{

    private Td_facturaRepository td_facturaRepository;

    @Autowired
    public Td_facturaImpl(Td_facturaRepository td_facturaRepository){
        this.td_facturaRepository = td_facturaRepository;
    }

    public List<Td_factura> getTd_factura() {
        //Se crea una instancia tipo lista de objetos y se llena con el metodo del repositorio
        List<Td_factura> listatd_factura = td_facturaRepository.findAll();
        //Se crea una instancia tipo lista pero tipo ArrayList esta solo sirve para devolverse en el return
        List<Td_factura> td_facturaList = new ArrayList<>();

        //Se llena la lista tipo Arraylist usando un objeto intermedio
        for(Td_factura td_factura:listatd_factura){

            Td_factura fact = new Td_factura();
            fact.setIdCorrelDet(td_factura.getIdCorrelDet());
            fact.setTdCodFact(td_factura.getTdCodFact());
            fact.setValorProd(td_factura.getValorProd());
            fact.setDescuento(td_factura.getDescuento());
            fact.setTcProdCodEquipo(td_factura.getTcProdCodEquipo());
            fact.setTmFactSerieFact(td_factura.getTmFactSerieFact());
            fact.setTmFactNumFact(td_factura.getTmFactNumFact());

            td_facturaList.add(fact);
        }

        return td_facturaList;
    }
}
