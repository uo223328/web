package com.tew.presentation;
import java.io.Serializable;
import javax.faces.bean.*;
import javax.faces.event.ActionEvent;
import com.tew.business.CorreosService;
import com.tew.infrastructure.Factories;
import com.tew.model.Correo;
import com.tew.model.Usuario;
//@ManagedBean
//@SessionScoped
public class BeanCorreos implements Serializable{
	private static final long serialVersionUID = 55555L;
	//Se añade este atributo de entidad para recibir el Correo concreto seleccionado
	//de la tabla o de un formulario
	//Es necesario inicializarlo para que al entrar desde el formulario de
	//Altaform.xhtml se puedan dejar los valores en un objeto existente
	private Correo correo = new Correo();
	private Correo[] correos=null;
	public BeanCorreos(){
		//iniciaCorreo(null);
	}
	public Correo getCorreo() {
		return correo;
	}
	public void setCorreo(Correo correo) {
		this.correo = correo;
	}
	public Correo[] getCorreos() {
		return correos;
	}
	public void setCorreos(Correo[] correos) {
		this.correos = correos;
	}
	/*
	public void iniciaCorreo(ActionEvent event){
		correo.setID(3);
		correo.setID_emisor("ID_EMISOR");
		correo.setID_destinatario("ID_DESTINATARIO");
		correo.setFecha(1000);
		correo.setAsunto("ASUNTO");
		correo.setTexto("TEXTO");
	}
	*/
	public String listado(Usuario usuario){
		CorreosService service;
		try{
			//Acceso a la implementación de la capa de negocio
			//a través de la factoria
			service=Factories.services.createCorreosService();
			//Así le damos información a toArray para poder hacer el casting a Correo()
			correos=(Correo[])service.getCorreosByDestinatario(usuario.getLogin()).toArray(new Correo[0]);
			return "exito";
		}catch(Exception e){e.printStackTrace();
		return "error";}
	}
	/*
	public String edit(){
		CorreosService service;
		try{
			//Acceso a la implementación de la capa de negocio
			//a través de la factoria
			service=Factories.services.createCorreosService();
			//Recargamos el Correo en la tabla de datos por si hubiera habido cambio
			Correo=service.findById(Correo.getId());
			return "exito";
		}catch(Exception e){e.printStackTrace();
		return "error";}
	}
	
	public String salva(){
		CorreosService service;
		try{
			//Acceso a la implementación de la capa de negocio
			//a través de la factoria
			service=Factories.services.createCorreosService();
			service.saveCorreo(correo);
			//Actualizamos el javabean de Correo inyectado en la tabla
			correos=(Correo[])service.getCorreosByDestinatario(usuario).toArray(new Correo[0]);
			return "exito";
		}catch(Exception e){e.printStackTrace();
		return "error";}
	}
	
	public String baja(){
		CorreosService service;
		try{
			//Acceso a la implementación de la capa de negocio
			//a través de la factoria
			service=Factories.services.createCorreosService();
			service.deleteCorreo(correo.getID());
			//Actualizamos el javabean de Correo inyectado en la tabla
			Correos=(Correo[])service.getCorreos().toArray(new Correo[0]);
			return "exito";
		}catch(Exception e){e.printStackTrace();
		return "error";}
	
	}
	*/
	
}

