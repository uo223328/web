package com.tew.persistence;

import java.util.List;

import com.tew.model.Correo;
import com.tew.persistence.exception.AlreadyPersistedException;
import com.tew.persistence.exception.NotPersistedException;

/**
 * Interfaz de la fachada a servicios de persistencia para la entidad Correo.
 * 
 * En esta versi��n aparecen los otros m��todos b��sicos de un servicio 
 * de persistencia
 * 
 * @author Ana
 *
 */
public interface CorreoDao {

	List<Correo> getCorreosByDestinatario(String destinatario);
	
	void save(Correo a) throws AlreadyPersistedException;
	//void update(Alumno a) throws NotPersistedException;
	void delete(int id) throws NotPersistedException;
	
	Correo findById(int id);

}
