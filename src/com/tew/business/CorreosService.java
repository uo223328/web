package com.tew.business;

import java.util.List;

import com.tew.business.exception.EntityAlreadyExistsException;
import com.tew.business.exception.EntityNotFoundException;
import com.tew.model.Correo;

/**
 * Este es el interfaz que ofrecer�� cualquier implementaci��n de la clase fachada.
 * 
 * Al separar la implementaci��n de la fachada de su interfaz se permite cambiar 
 * las implementaciones reales de la fachada. Esto es muy ��til cuando se necesita 
 * a��adir funcionalidad extra como acceso remoto, web services,
 * control de acceso, etc. Al hacerlo de esta forma esos cambios solo 
 * afectan a las factorias y no al contenido de las capas. Las factor��as, en
 * un desarrollo profesional, se configuran declarativamente (properties, xml, etc)
 * 
 * @author Enrique
 *
 */
public interface CorreosService {

	List<Correo> getCorreosByDestinatario(String destinatario) throws Exception;
	
	Correo findById(int id) throws EntityNotFoundException;
	
	void saveCorreo(Correo correo) throws EntityAlreadyExistsException;
	//void updateCorreo(Correo Correo) throws EntityNotFoundException;
	void deleteCorreo(int id) throws EntityNotFoundException;
	

}
