package impl.tew.business.classes;

import com.tew.business.exception.EntityAlreadyExistsException;
import com.tew.infrastructure.Factories;
import com.tew.model.Correo;
import com.tew.persistence.CorreoDao;
import com.tew.persistence.exception.AlreadyPersistedException;

public class CorreosAlta {

	public void save(Correo correo) throws EntityAlreadyExistsException {
		CorreoDao dao = Factories.persistence.createCorreoDao();
		try {
			dao.save(correo);
		}
		catch (AlreadyPersistedException ex) {
			throw new EntityAlreadyExistsException("Correo ya existe " + correo, ex);
		}
	}

}

