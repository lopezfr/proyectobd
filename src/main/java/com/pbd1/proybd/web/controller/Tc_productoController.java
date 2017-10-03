package com.pbd1.proybd.web.controller;

import com.pbd1.proybd.service.Tc_productoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Tc_productoController extends BaseController {

    @Autowired
    private Tc_productoService tc_productoService;

    //Todos los metodos en las paginas que va a controlar esta clase

    //Carga el listado con el metodo findall()
    @RequestMapping("/tc_producto")
    public ModelAndView tc_productoInicio(){
        ModelMap modelMap = new ModelMap();
        modelMap.addAttribute("tc_producto", tc_productoService.getTc_producto());
        return new ModelAndView("productos/productos",modelMap);
    }
}
