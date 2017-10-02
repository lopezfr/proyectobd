package com.pbd1.proybd.web.controller;

import com.pbd1.proybd.service.Tc_empleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class Tc_empleadoController extends BaseController {

    @Autowired
    private Tc_empleadoService tc_empleadoService;

    //Todos los metodos en las paginas que va a controlar esta clase

    //Carga el listado con el metodo findall()
    @RequestMapping("/tc_empleado")
    public ModelAndView tc_empleadoInicio(){
        ModelMap modelMap = new ModelMap();
        modelMap.addAttribute("tc_empleado", tc_empleadoService.getTc_empleado());
        return new ModelAndView("empleados/empleados",modelMap);
    }
}
