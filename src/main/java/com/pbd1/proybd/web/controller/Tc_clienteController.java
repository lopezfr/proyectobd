package com.pbd1.proybd.web.controller;

import com.pbd1.proybd.service.Tc_clienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Tc_clienteController extends BaseController{
    @Autowired
    private Tc_clienteService tc_clienteService;

    //Todos los metodos en las paginas que van a controlar esta clase

    //Carga el listado con el metodo findall()
    @RequestMapping("/tc_cliente")
    public ModelAndView tc_clienteInicio(){
        ModelMap modelMap = new ModelMap();
        modelMap.addAttribute("tc_cliente", tc_clienteService.getTc_cliente());
        return new ModelAndView("clientes/clientes",modelMap);
    }
}
