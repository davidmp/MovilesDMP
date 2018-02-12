/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.evento.api;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upeu.evento.model.Usuario;
import pe.edu.upeu.evento.service.UsuarioServis;

/**
 *
 * @author Docente
 */
@RestController
@RequestMapping("/user")
public class UsuarioRestController {
    @Autowired
    public UsuarioServis servicio;
    
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Usuario> listarUsuario(){
    return servicio.listarEntidad();
    }
    @RequestMapping(value = "/adit", method = {RequestMethod.GET, RequestMethod.POST})
    public void modificarEntidad(@RequestBody Usuario entidad){
        servicio.modificarEntidad(entidad);
    }
    @RequestMapping(value = "/remove/{id}", method = {RequestMethod.DELETE, RequestMethod.GET})
    public void eliminarEntidadId(@PathVariable String id){
        servicio.eliminarEntidadId(Integer.parseInt(id));
    }
    
    @RequestMapping(value="/find/{id}", method = RequestMethod.GET)
    public Usuario buscarEntidadId(@PathVariable String id){
        return servicio.buscarEntidadId(Integer.parseInt(id));
    }
    
    @RequestMapping(value="/findn/{nombre}", method = RequestMethod.GET)
    public List<Usuario> buscarEntidadNombre(@PathVariable String nombre){
        return servicio.listarEntidadValor(nombre);
    }
    
    @RequestMapping(value = "/add", method = {RequestMethod.GET, RequestMethod.POST})
    public void guardarEntidad(@RequestBody Usuario usuario){
        //System.out.println("Holasssss: "+usuario.getNombres());
        servicio.guardarEntidad(usuario);
    }
}
