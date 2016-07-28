package com.gotn.controller;

import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.gotn.model.PymeNdDetProv;
import com.gotn.service.INdDetProvService;



/*Creado por jjara 2016-07-26*/
@Component
@Scope("session")
public class NdDetProvBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Autowired
	private INdDetProvService ndDetProvService;
	
	private List<PymeNdDetProv> ndDetProvs;
	private PymeNdDetProv ndDetProv;
	private int accion;
	private String etiquetaBoton;
	private boolean habilitado;
	
	public void consultaListado(){
		ndDetProvs = ndDetProvService.getNdDetProvs();	
	}
	
	
	/* 1-guardar
	 * 2-actualizar
	 * 3-eliminar
	 * 4-consultar
	 * */
	/* Metodos de acciones CRUD*/
	public void agregar(){
		ndDetProv = new PymeNdDetProv();
		etiquetaBoton = "Guardar";
		accion = 1;
		habilitado = true;//es para saber si habilitamos los campos de captura del formulario.
	}
	public void actualizar(PymeNdDetProv pojo){
		ndDetProv = pojo;
		etiquetaBoton = "Actualizar";
		accion = 2;
		habilitado = true;
	}
	public void eliminar(PymeNdDetProv pojo){
		ndDetProv = pojo;
		etiquetaBoton = "Eliminar";
		accion = 3;
		habilitado = true;
	}
	public void consultar(PymeNdDetProv pojo){
		ndDetProv = pojo;
		etiquetaBoton = "Cerrar";
		accion = 4;
		habilitado = false;
	}
	
	
	public void guardarDentradas(){
		boolean result = false;
		switch (accion) {
		case 1:
			result = ndDetProvService.guardarNdDetProv(ndDetProv);
			if (result) {
				System.out.println("Registro Exitoso");
			} else {
				System.out.println("Registro Fallido");
			}
			break;
		case 2:
			result = ndDetProvService.actualizarNdDetProv(ndDetProv);
			if (result) {
				System.out.println("Registro Exitoso");
			} else {
				System.out.println("Registro Fallido");
			}
			break;
		case 3:
			result = ndDetProvService.eliminarNdDetProv(ndDetProv);
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
	
	
	
	public List<PymeNdDetProv> getNdDetProvs() {
		return ndDetProvs;
	}
	public void setNdDetProvs(List<PymeNdDetProv> ndDetProvs) {
		this.ndDetProvs = ndDetProvs;
	}
	public PymeNdDetProv getNdDetProv() {
		return ndDetProv;
	}
	public void setNdDetProv(PymeNdDetProv ndDetProv) {
		this.ndDetProv = ndDetProv;
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
