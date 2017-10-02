package com.pbd1.proybd.service;

import com.pbd1.proybd.domain.bo.Tc_proveedor;
import com.pbd1.proybd.domain.repository.Tc_proveedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Tc_proveedorImpl implements Tc_proveedorService{

    private Tc_proveedorRepository tc_proveedorRepository;

    @Autowired
    public Tc_proveedorImpl(Tc_proveedorRepository tc_proveedorRepository){
        this.tc_proveedorRepository = tc_proveedorRepository;
    }

    public List<Tc_proveedor> getTc_proveedor(){

        //Se crea una instancia tipo lista de objetos y se llena con el metodo del repositorio
        List<Tc_proveedor> listatc_proveedor = tc_proveedorRepository.findAll();
        //Se crea una instancia tipo lista pero tipo ArrayList esta solo sirve para devolverse en el return
        List<Tc_proveedor> tc_proveedorList = new ArrayList<>();

        //Se llena la lista tipo Arraylist usando un objeto intermedio
        for (Tc_proveedor tc_proveedor:listatc_proveedor){

            Tc_proveedor prov = new Tc_proveedor();
            prov.setIdProveedor(tc_proveedor.getIdProveedor());
            prov.setNombre(tc_proveedor.getNombre());
            prov.setDescripcion(tc_proveedor.getDescripcion());
            prov.setEstado(tc_proveedor.getEstado());

            //guardo la instancia en la lista return
            tc_proveedorList.add(prov);
        }

        return tc_proveedorList;
    }
}
