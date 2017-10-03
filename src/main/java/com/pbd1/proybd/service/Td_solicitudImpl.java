package com.pbd1.proybd.service;

import com.pbd1.proybd.domain.bo.Td_solicitud;
import com.pbd1.proybd.domain.repository.Td_solicitudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Td_solicitudImpl implements Td_solicitudService{

    private Td_solicitudRepository td_solicitudRepository;

    @Autowired
    public Td_solicitudImpl(Td_solicitudRepository td_solicitudRepository){
        this.td_solicitudRepository = td_solicitudRepository;
    }

    public List<Td_solicitud> getTd_Solicitud() {

        //Se crea una instancia tipo lista de objetos y se llena con el metodo del repositorio
        List<Td_solicitud> listatd_solicitud = td_solicitudRepository.findAll();
        //Se crea una instancia tipo lista pero tipo ArrayList esta solo sirve para devolverse en el return
        List<Td_solicitud> td_solicitudList = new ArrayList<>();

        //Se llena la lista tipo Arraylist usando un objeto intermedio
        for (Td_solicitud td_solicitud:listatd_solicitud){

            Td_solicitud solicitud = new Td_solicitud();
            solicitud.setTdCodSol(td_solicitud.getTdCodSol());
            solicitud.setEstado(td_solicitud.getEstado());
            solicitud.setTcTipSolTcCodTipSol(td_solicitud.getTcTipSolTcCodTipSol());
            solicitud.setTcEmpCodUser(td_solicitud.getTcEmpCodUser());
            solicitud.setTcProdCodEquipo(td_solicitud.getTcProdCodEquipo());
            solicitud.setTmSolTmCodSol(td_solicitud.getTmSolTmCodSol());

            td_solicitudList.add(solicitud);
        }

        return td_solicitudList;
    }
}
