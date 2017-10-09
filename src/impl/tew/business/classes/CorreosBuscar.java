package impl.tew.business.classes;

import com.tew.business.exception.EntityNotFoundException;
import com.tew.infrastructure.Factories;
import com.tew.model.Correo;
import com.tew.persistence.CorreoDao;

public class CorreosBuscar {

	public Correo find(int id) throws EntityNotFoundException {
		CorreoDao dao = Factories.persistence.createCorreoDao();
		Correo a = dao.findById(id);
		if ( a == null) {
			throw new EntityNotFoundException("No se ha encontrado el Correo");
		}
		
		return a;
	}

}