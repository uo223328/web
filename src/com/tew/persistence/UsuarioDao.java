package com.tew.persistence;

import java.util.List;

import com.tew.model.Usuario;
import com.tew.persistence.exception.AlreadyPersistedException;
import com.tew.persistence.exception.NotPersistedException;

/**
 * Interfaz de la fachada a servicios de persistencia para la entidad Usuario.
 * 
 * En esta versi��n aparecen los otros m��todos b��sicos de un servicio 
 * de persistencia
 * 
 * @author Ana
 *
 */
public interface UsuarioDao {

	List<Usuario> getUsuarios();
	/*
	void save(Alumno a) throws AlreadyPersistedException;
	*/
	void update(Usuario a) throws NotPersistedException;
	
	void delete(String Login) throws NotPersistedException;
	
	Usuario findByLogin(String login);

}
