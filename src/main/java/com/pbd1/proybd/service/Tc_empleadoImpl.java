package com.pbd1.proybd.service;

import com.pbd1.proybd.domain.bo.Tc_empleado;
import com.pbd1.proybd.domain.repository.Tc_empleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Tc_empleadoImpl implements Tc_empleadoService {
    private Tc_empleadoRepository tc_empleadoRepository;

    @Autowired
    public Tc_empleadoImpl(Tc_empleadoRepository tc_empleadoRepository){
        this.tc_empleadoRepository = tc_empleadoRepository;
    }

    @Override
    public List<Tc_empleado> getTc_empleado(){
        //Se crea una instancia tipo lista de objetos y se llena con el metodo del repositorio
        List<Tc_empleado> listatc_empleado = tc_empleadoRepository.findAll();

        //Se crea una instancia tipo lista pero tipo ArrayList esta solo sirve para devolverse en el return
        List<Tc_empleado> tc_empleadoList = new ArrayList<>();

        //Se llena la lista tipo Arraylist usando un objeto intermedio
        for (Tc_empleado tc_empleado:listatc_empleado){
            Tc_empleado empl = new Tc_empleado();
            empl.setCodUsuario(tc_empleado.getCodUsuario());
            empl.setPrimerNombre(tc_empleado.getPrimerNombre());
            empl.setSegundoNombre(tc_empleado.getSegundoNombre());
            empl.setPrimerApellido(tc_empleado.getPrimerApellido());
            empl.setSegundoApellido(tc_empleado.getSegundoApellido());
            empl.setPuesto(tc_empleado.getPuesto());

            //Guardo la instancia en la lista return
            tc_empleadoList.add(empl);
        }

        return tc_empleadoList;
    }
}
