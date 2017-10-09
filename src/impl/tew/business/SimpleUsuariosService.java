package impl.tew.business;

import impl.tew.business.classes.*;


import java.util.List;

import com.tew.business.UsuariosService;
import com.tew.business.exception.EntityAlreadyExistsException;
import com.tew.business.exception.EntityNotFoundException;
import com.tew.model.Usuario;

/**
 * Clase de implementación (una de las posibles) del interfaz de la fachada de
 * servicios
 * 
 * @author Enrique
 * 
 */
public class SimpleUsuariosService implements UsuariosService {

	@Override
	public List<Usuario> getUsuarios() throws Exception{
		return new UsuariosListado().getUsuarios();
	}
	/*
	@Override
	public void saveUsuario(Usuario Usuario) throws EntityAlreadyExistsException {
		new UsuariosAlta().save(Usuario);
	}
	*/
	@Override
	public void updateUsuario(Usuario usuario) throws EntityNotFoundException {
		new UsuariosUpdate().update(usuario);
	}
	
	@Override
	public void deleteUsuario(String login) throws EntityNotFoundException {
		new UsuariosBaja().delete(login);
	}
	

	@Override
	public Usuario findByLogin(String login) throws EntityNotFoundException {
		return new UsuariosBuscar().find(login);
	}
}

