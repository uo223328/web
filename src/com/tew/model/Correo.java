package com.tew.model;

public class Correo {
	private int ID;
	private String ID_emisor;
	private String ID_destinatario;
	private long fecha;
	private String asunto;
	private String texto;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getID_emisor() {
		return ID_emisor;
	}
	public void setID_emisor(String iD_emisor) {
		ID_emisor = iD_emisor;
	}
	public String getID_destinatario() {
		return ID_destinatario;
	}
	public void setID_destinatario(String iD_destinatario) {
		ID_destinatario = iD_destinatario;
	}
	public long getFecha() {
		return fecha;
	}
	public void setFecha(long fecha) {
		this.fecha = fecha;
	}
	public String getAsunto() {
		return asunto;
	}
	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}

}
