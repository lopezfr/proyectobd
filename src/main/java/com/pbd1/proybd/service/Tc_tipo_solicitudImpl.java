package com.pbd1.proybd.service;

import com.pbd1.proybd.domain.bo.Tc_tipo_solicitud;
import com.pbd1.proybd.domain.repository.Tc_tipo_solicitudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Tc_tipo_solicitudImpl implements Tc_tipo_solicitudService {

    private Tc_tipo_solicitudRepository tc_tipo_solicitudRepository;

    @Autowired
    public Tc_tipo_solicitudImpl(Tc_tipo_solicitudRepository tc_tipo_solicitudRepository){
        this.tc_tipo_solicitudRepository = tc_tipo_solicitudRepository;
    }

    public List<Tc_tipo_solicitud> getTc_tipo_solicitud() {

        //Se crea una instancia tipo lista de objetos y se llena con el metodo del repositorio
        List<Tc_tipo_solicitud> listatc_tipo_solicitud = tc_tipo_solicitudRepository.findAll();
        //Se crea una instancia tipo lista pero tipo ArrayList esta solo sirve para devolverse en el return
        List<Tc_tipo_solicitud> tc_tipo_solicitudList = new ArrayList<>();

        //Se llena la lista tipo Arraylist usando un objeto intermedio
        for (Tc_tipo_solicitud tc_tipo_solicitud:listatc_tipo_solicitud){

            Tc_tipo_solicitud tipoSol = new Tc_tipo_solicitud();
            tipoSol.setCodTipoSol(tc_tipo_solicitud.getCodTipoSol());
            tipoSol.setDescripcion(tc_tipo_solicitud.getDescripcion());

            //guardo la instancia en la lista return
            tc_tipo_solicitudList.add(tipoSol);
        }

        return tc_tipo_solicitudList;
    }
}
