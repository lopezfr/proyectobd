package com.pbd1.proybd.service;

import com.pbd1.proybd.domain.bo.Tc_cliente;
import com.pbd1.proybd.domain.repository.Tc_clienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Tc_clienteImpl implements Tc_clienteService {
    private Tc_clienteRepository tc_clienteRepository;

    @Autowired
    public Tc_clienteImpl(Tc_clienteRepository tc_clienteRepository){
        this.tc_clienteRepository = tc_clienteRepository;
    }

    @Override
    public List<Tc_cliente> getTc_cliente() {
        //Se crea una instancia tipo lista de objetos y se llena con el metodo del repositorio
        List<Tc_cliente> listatc_cliente = tc_clienteRepository.findAll();

        //Se crea una instancia tipo lista pero tipo ArrayList esta solo sirve para devolverse en el return
        List<Tc_cliente> tc_clienteList = new ArrayList<>();

        //Se llena la lista tipo ArrayList usando un objeto intermedio
        for (Tc_cliente tc_cliente:listatc_cliente){
            Tc_cliente client = new Tc_cliente();
            client.setIdCliente(tc_cliente.getIdCliente());
            client.setNit(tc_cliente.getNit());
            client.setPrimerNombre(tc_cliente.getPrimerNombre());
            client.setSegundoNombre(tc_cliente.getSegundoNombre());
            client.setPrimerApellido(tc_cliente.getPrimerApellido());
            client.setSegundoApellido(tc_cliente.getSegundoApellido());
            client.setDireccion1(tc_cliente.getDireccion1());
            client.setDireccion2(tc_cliente.getDireccion2());
            client.setTelefono(tc_cliente.getTelefono());
            client.setCelular(tc_cliente.getCelular());
            client.setCorreo(tc_cliente.getCorreo());
            client.setEstado(tc_cliente.getEstado());

            //Guardo la instancia en la lista return
            tc_clienteList.add(client);
        }

        return tc_clienteList;
    }
}
