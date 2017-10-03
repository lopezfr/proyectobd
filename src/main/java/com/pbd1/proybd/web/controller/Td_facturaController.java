package com.pbd1.proybd.web.controller;

import com.pbd1.proybd.service.Td_facturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Td_facturaController extends BaseController{

    @Autowired
    private Td_facturaService td_facturaService;

    //Todos los metodos en las paginas que va a controlar esta clase

    //carga el listado con el metodo findall()
    @RequestMapping("/td_factura")
    public ModelAndView td_facturaInicio(){
        ModelMap modelMap = new ModelMap();
        modelMap.addAttribute("td_factura", td_facturaService.getTd_factura());
        return new ModelAndView("detalleFact/detalleFact",modelMap);
    }
}
