package impl.tew.business.classes;

import com.tew.business.exception.EntityNotFoundException;
import com.tew.infrastructure.Factories;
import com.tew.persistence.CorreoDao;
import com.tew.persistence.exception.NotPersistedException;

public class CorreosBaja {

	public void delete(int id) throws EntityNotFoundException {
		CorreoDao dao = Factories.persistence.createCorreoDao();
		try {
			dao.delete(id);
		}
		catch (NotPersistedException ex) {
			throw new EntityNotFoundException("Correo no eliminado " + id, ex);
		}
	}
}
