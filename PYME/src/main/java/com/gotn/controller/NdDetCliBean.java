package com.gotn.controller;

import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.gotn.model.PymeNdDetCli;
import com.gotn.service.INdDetCliService;



/*Creado por jjara 2016-07-26*/
@Component
@Scope("session")
public class NdDetCliBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private INdDetCliService ndDetCliService;
	

	private List<PymeNdDetCli> ndDetClis;
	private PymeNdDetCli ndDetCli;
	private int accion;
	private String etiquetaBoton;
	private boolean habilitado;
	
	
	public void consultaListado(){
		ndDetClis = ndDetCliService.getNdDetClis();	
	}
	
	/* 1-guardar
	 * 2-actualizar
	 * 3-eliminar
	 * 4-consultar
	 * */
	/* Metodos de acciones CRUD*/
	public void agregar(){
		ndDetCli = new PymeNdDetCli();
		etiquetaBoton = "Guardar";
		accion = 1;
		habilitado = true;//es para saber si habilitamos los campos de captura del formulario.
	}
	public void actualizar(PymeNdDetCli pojo){
		ndDetCli = pojo;
		etiquetaBoton = "Actualizar";
		accion = 2;
		habilitado = true;
	}
	public void eliminar(PymeNdDetCli pojo){
		ndDetCli = pojo;
		etiquetaBoton = "Eliminar";
		accion = 3;
		habilitado = true;
	}
	public void consultar(PymeNdDetCli pojo){
		ndDetCli = pojo;
		etiquetaBoton = "Cerrar";
		accion = 4;
		habilitado = false;
	}
	
	
	public void guardarNdDetCli(){
		boolean result = false;
		switch (accion) {
		case 1:
			result = ndDetCliService.guardarNdDetCli(ndDetCli);
			if (result) {
				System.out.println("Registro Exitoso");
			} else {
				System.out.println("Registro Fallido");
			}
			break;
		case 2:
			result = ndDetCliService.actualizarNdDetCli(ndDetCli);
			if (result) {
				System.out.println("Registro Exitoso");
			} else {
				System.out.println("Registro Fallido");
			}
			break;
		case 3:
			result = ndDetCliService.eliminarNdDetCli(ndDetCli);
			if (result) {
				System.out.println("Registro Exitoso");
			} else {
				System.out.println("Registro Fallido");
			}
			break;	
		
		default:
			break;
		}
	}
	
	
	public List<PymeNdDetCli> getNdDetClis() {
		return ndDetClis;
	}
	public void setNdDetClis(List<PymeNdDetCli> ndDetClis) {
		this.ndDetClis = ndDetClis;
	}
	public PymeNdDetCli getNdDetCli() {
		return ndDetCli;
	}
	public void setNdDetCli(PymeNdDetCli ndDetCli) {
		this.ndDetCli = ndDetCli;
	}
	public int getAccion() {
		return accion;
	}
	public void setAccion(int accion) {
		this.accion = accion;
	}
	public String getEtiquetaBoton() {
		return etiquetaBoton;
	}
	public void setEtiquetaBoton(String etiquetaBoton) {
		this.etiquetaBoton = etiquetaBoton;
	}
	public boolean isHabilitado() {
		return habilitado;
	}
	public void setHabilitado(boolean habilitado) {
		this.habilitado = habilitado;
	}
	
	
	
	
	

}
