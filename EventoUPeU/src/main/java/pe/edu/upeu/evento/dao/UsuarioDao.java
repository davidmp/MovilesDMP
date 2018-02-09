/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.evento.dao;

import java.util.List;
import pe.edu.upeu.evento.model.Usuario;

/**
 *
 * @author Docente
 */
public interface UsuarioDao {
    public List<Usuario> listarEntidad();
    public Usuario buscarEntidadId(int id);
    public void guardarEntidad(Usuario usuario);
    public void eliminarEntidadId(int id);
    public void modificarEntidad(Usuario usuario);
    public List<Usuario> listarEntidadValor(String dato);
    
    public Usuario usuarioLogin(String usuario,String clave);
    
}
