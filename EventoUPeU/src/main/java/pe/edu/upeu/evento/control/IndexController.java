/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.evento.control;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import pe.edu.upeu.evento.model.Usuario;
import pe.edu.upeu.evento.service.UsuarioServis;

/**
 *
 * @author Docente
 */

@Controller
@RequestMapping("/")
public class IndexController {
    
    @Autowired
    MessageSource mesagesource;
    @Autowired
    UsuarioServis service;
    
    @RequestMapping(value = {"/index"},method = RequestMethod.GET)
    public ModelAndView paginaPrincipal(ModelMap model){
        
        return  new ModelAndView("index");
    }
    
    @RequestMapping(value = { "/","/login"},method = RequestMethod.GET)
    public ModelAndView paginaLogin(ModelMap model){
        
        return  new ModelAndView("login");
    }
    @RequestMapping(value = {"/validar"},method = RequestMethod.POST)
    public ModelAndView principalValidarLogin(ModelMap model, HttpServletRequest r){
        Usuario lista=null;
        String usuario=r.getParameter("usuario");
        String clave=r.getParameter("clave");
        lista=service.usuarioLogin(usuario, clave);
        if(lista!=null){
            return new ModelAndView("usuario/mainUsuario");
        }else{
            return new ModelAndView("login");
        }
    }
    
}
