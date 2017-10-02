package com.pbd1.proybd.web.controller;

import com.pbd1.proybd.service.Tc_tipo_solicitudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Tc_tipo_solicitudController extends BaseController {

    @Autowired
    private Tc_tipo_solicitudService tipo_solicitudService;

    //Todos los metodos en las paginas que va a controlar esta clase


    //carga el listado con el metodo findall()
    @RequestMapping("/tc_tipo_solicitud")
    public ModelAndView tc_tipo_solicitudInicio(){
        ModelMap modelMap = new ModelMap();
        modelMap.addAttribute("tc_tipo_solicitud", tipo_solicitudService.getTc_tipo_solicitud());
        return new ModelAndView("solicitudes/solicitudes",modelMap);
    }
}
