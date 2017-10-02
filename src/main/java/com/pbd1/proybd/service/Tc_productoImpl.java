package com.pbd1.proybd.service;

import com.pbd1.proybd.domain.bo.Tc_producto;
import com.pbd1.proybd.domain.repository.Tc_productoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Tc_productoImpl implements Tc_productoService {
    private Tc_productoRepository tc_productoRepository;

    @Autowired
    public Tc_productoImpl(Tc_productoRepository tc_productoRepository){
        this.tc_productoRepository = tc_productoRepository;
    }

    @Override
    public List<Tc_producto> getTc_producto(){
        //Se crea una instancia tipo lista de objetos y se llena con el metodo del repositorio
        List<Tc_producto> listatc_producto = tc_productoRepository.findAll();

        //Se crea una instancia tipo lista pero tipo ArrayList esta solo sirve para devolverse en el return
        List<Tc_producto> tc_productoList = new ArrayList<>();

        //Se llena la lista tipo Arraylist usando un objeto intermedio
        for (Tc_producto tc_producto:listatc_producto){
            Tc_producto prod = new Tc_producto();
            prod.setIdEquipo(tc_producto.getIdEquipo());
            prod.setMarca(tc_producto.getMarca());
            prod.setModelo(tc_producto.getModelo());
            prod.setCategoria(tc_producto.getCategoria());
            prod.setUbicacion(tc_producto.getUbicacion());
            prod.setDescripcion(tc_producto.getDescripcion());
            prod.setEstado(tc_producto.getEstado());

            //Guardo la instancia en la lista return
            tc_productoList.add(prod);
        }

        return tc_productoList;
    }
}
