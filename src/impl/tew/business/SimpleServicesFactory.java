package impl.tew.business;


import com.tew.business.UsuariosService;
import com.tew.business.CorreosService;
import com.tew.business.ServicesFactory;

public class SimpleServicesFactory implements ServicesFactory {

	@Override
	public CorreosService createCorreosService() {
		return new SimpleCorreosService();
	}
	@Override
	public UsuariosService createUsuariosService() {
		return new SimpleUsuariosService();
	}
}
