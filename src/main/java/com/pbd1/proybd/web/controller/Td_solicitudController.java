package com.pbd1.proybd.web.controller;

import com.pbd1.proybd.service.Td_solicitudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Td_solicitudController extends BaseController{

    @Autowired
    private Td_solicitudService td_solicitudService;

    //Todos los metodos en las paginas que va a controlar esta clase

    //carga el listado con el metodo findall()
    @RequestMapping("/td_solicitud")
    public ModelAndView td_solicitudInicio(){
        ModelMap modelMap = new ModelMap();
        modelMap.addAttribute("td_solicitud", td_solicitudService.getTd_Solicitud());
        return new ModelAndView("tdSolicitudes/tdSolicitudes", modelMap);
    }
}
