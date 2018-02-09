/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.evento.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.evento.SysDataAccess;
import pe.edu.upeu.evento.model.Usuario;

/**
 *
 * @author Docente
 */
@Repository("usuarioDao")
public class UsuarioDaoImpl extends SysDataAccess<Integer, Usuario> implements UsuarioDao{
    
    @SuppressWarnings("unchecked")
    public List<Usuario> listarEntidad(){ return getListAll();}
    public Usuario buscarEntidadId(int id){ return getById(id);}
    public void guardarEntidad(Usuario usuario){ savev(usuario); }
    public void eliminarEntidadId(int id){delete(id); }
    public void modificarEntidad(Usuario usuario){ update(usuario);}
    
    public List<Usuario> listarEntidadValor(String dato){             
        return (List<Usuario>)sessionFactory.getCurrentSession()
                               .createQuery(" SELECT a FROM Usuario a WHERE a.dnicodigo LIKE ? ")
                                .setString(0, "%"+dato+"%").list();
    }   
    
    public Usuario usuarioLogin(String usuario,String clave){ 
        return (Usuario)sessionFactory.getCurrentSession()
                        .createQuery(" SELECT a FROM Usuario a where a.usuario=? and a.clave=? ")
                        .setString(0, usuario)
                        .setString(1, clave).uniqueResult();
    }   
}
