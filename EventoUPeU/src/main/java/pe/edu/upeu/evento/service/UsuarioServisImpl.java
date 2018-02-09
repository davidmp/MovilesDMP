/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.evento.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upeu.evento.dao.UsuarioDao;
import pe.edu.upeu.evento.model.Usuario;

/**
 *
 * @author Docente
 */
@Service("usuarioService")
@Transactional
public class UsuarioServisImpl implements UsuarioServis{
    
    @Autowired
    public UsuarioDao dao;
    
    @Override
    public List<Usuario> listarEntidad() {
        return dao.listarEntidad();
    }

    @Override
    public Usuario buscarEntidadId(int id) {
        return dao.buscarEntidadId(id);
    }

    @Override
    public void guardarEntidad(Usuario usuario) {
        dao.guardarEntidad(usuario);
    }

    @Override
    public void eliminarEntidadId(int id) {
        dao.eliminarEntidadId(id);
    }

    @Override
    public void modificarEntidad(Usuario usuario) {
        dao.modificarEntidad(usuario);
    }

    @Override
    public List<Usuario> listarEntidadValor(String dato) {
        return dao.listarEntidadValor(dato);
    }

    @Override
    public Usuario usuarioLogin(String usuario, String clave) {
        return dao.usuarioLogin(usuario, clave);
    }
    
}
