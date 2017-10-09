package impl.tew.business;

import impl.tew.business.classes.*;


import java.util.List;

import com.tew.business.CorreosService;
import com.tew.business.exception.EntityAlreadyExistsException;
import com.tew.business.exception.EntityNotFoundException;
import com.tew.model.Correo;

/**
 * Clase de implementación (una de las posibles) del interfaz de la fachada de
 * servicios
 * 
 * @author Ana
 * 
 */
public class SimpleCorreosService implements CorreosService {

	@Override
	public List<Correo> getCorreosByDestinatario(String destinatario) throws Exception{
		return new CorreosListado().getCorreosByDestinatario(destinatario);
	}
	
	
	@Override
	public void saveCorreo(Correo correo) throws EntityAlreadyExistsException {
		new CorreosAlta().save(correo);
	}
/*
	@Override
	public void updateCorreo(Correo correo) throws EntityNotFoundException {
		new CorreosUpdate().update(Correo);
	}
*/
	@Override
	public void deleteCorreo(int id) throws EntityNotFoundException {
		new CorreosBaja().delete(id);
	}
	

	@Override
	public Correo findById(int id) throws EntityNotFoundException {
		return new CorreosBuscar().find(id);
	}
}

