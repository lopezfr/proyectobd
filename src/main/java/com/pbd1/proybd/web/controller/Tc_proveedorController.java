package com.pbd1.proybd.web.controller;

import com.pbd1.proybd.service.Tc_proveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Tc_proveedorController extends BaseController{

    @Autowired
    private Tc_proveedorService tc_proveedorService;

    //Todos los metodos en las paginas que va a controlar esta clase

    //carga el listado con el metodo findall()
    @RequestMapping("/tc_proveedor")
    public ModelAndView tc_proveedorInicio(){
        ModelMap modelMap = new ModelMap();
        modelMap.addAttribute("tc_proveedor", tc_proveedorService.getTc_proveedor());
        return new ModelAndView("proveedores/proveedores",modelMap);
    }
}
