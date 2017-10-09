package com.tew.presentation;
import java.io.Serializable;
import javax.faces.bean.*;
import javax.faces.event.ActionEvent;
import com.tew.business.UsuariosService;
import com.tew.infrastructure.Factories;
import com.tew.model.Usuario;
//@ManagedBean
//@SessionScoped
public class BeanUsuarios implements Serializable{
	private static final long serialVersionUID = 55555L;
	//Se añade este atributo de entidad para recibir el Usuario concreto seleccionado
	//de la tabla o de un formulario
	//Es necesario inicializarlo para que al entrar desde el formulario de
	//Altaform.xhtml se puedan dejar los valores en un objeto existente
	private Usuario usuario = new Usuario();
	private Usuario[] usuarios=null;
	public BeanUsuarios(){
		iniciaUsuario(null);
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Usuario[] getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(Usuario[] usuarios) {
		this.usuarios = usuarios;
	}
	public void iniciaUsuario(ActionEvent event){
		usuario.setLogin("LOGIN");
		usuario.setNombre("NOMBRE");
		usuario.setApellidos("APELLIDOS");
		usuario.setEmail("EMAIL@email.com");
		usuario.setPasswd("PASSWD");
		usuario.setRol("ROL");
		usuario.setActivo(true);
	}
	public String listado(){
		UsuariosService service;
		try{
			//Acceso a la implementación de la capa de negocio
			//a través de la factoria
			service=Factories.services.createUsuariosService();
			//Así le damos información a toArray para poder hacer el casting a Usuario()
			usuarios=(Usuario[])service.getUsuarios().toArray(new Usuario[0]);
			return "exito";
		}catch(Exception e){e.printStackTrace();
		return "error";}
	}
	/*
	public String edit(){
		UsuariosService service;
		try{
			//Acceso a la implementación de la capa de negocio
			//a través de la factoria
			service=Factories.services.createUsuariosService();
			//Recargamos el Usuario en la tabla de datos por si hubiera habido cambio
			usuario=service.findByLogin(usuario.getLogin());
			return "exito";
		}catch(Exception e){e.printStackTrace();
		return "error";}
	}
	*/
	public String salva(){
		UsuariosService service;
		try{
			//Acceso a la implementación de la capa de negocio
			//a través de la factoria
			service=Factories.services.createUsuariosService();
			
			service.updateUsuario(usuario);
			
			//Actualizamos el javabean de Usuario inyectado en la tabla
			usuarios=(Usuario[])service.getUsuarios().toArray(new Usuario[0]);
			return "exito";
		}catch(Exception e){e.printStackTrace();
		return "error";}
	}
	
	public String baja(){
		UsuariosService service;
		try{
			//Acceso a la implementación de la capa de negocio
			//a través de la factoria
			service=Factories.services.createUsuariosService();
			service.deleteUsuario(usuario.getLogin());
			//Actualizamos el javabean de Usuario inyectado en la tabla
			usuarios=(Usuario[])service.getUsuarios().toArray(new Usuario[0]);
			return "exito";
		}catch(Exception e){e.printStackTrace();
		return "error";}
	}
	
}
