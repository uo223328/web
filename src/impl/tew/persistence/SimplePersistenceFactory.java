package impl.tew.persistence;

import com.tew.persistence.UsuarioDao;
import com.tew.persistence.CorreoDao;
import com.tew.persistence.PersistenceFactory;

/**
 * Implementaci??????n de la factoria que devuelve implementaci??????n de la capa
 * de persistencia con Jdbc 
 * 
 * @author Ana
 *
 */
public class SimplePersistenceFactory implements PersistenceFactory {

	@Override
	public CorreoDao createCorreoDao() {
		return new CorreoJdbcDao();
	}
	@Override
	public UsuarioDao createUsuarioDao() {
		return new UsuarioJdbcDao();
	}

}
