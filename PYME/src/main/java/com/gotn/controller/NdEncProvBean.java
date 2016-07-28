package com.gotn.controller;

import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.gotn.model.PymeNdEncProv;
import com.gotn.service.INdEncProvService;



/*Creado por jjara 2016-07-26*/
@Component
@Scope("session")
public class NdEncProvBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Autowired
	private INdEncProvService ndEncProvService;
	
	private List<PymeNdEncProv> ndEncProvs;
	private PymeNdEncProv ndEncProv;
	private int accion;
	private String etiquetaBoton;
	private boolean habilitado;
	
	
	public void consultaListado(){
		ndEncProvs = ndEncProvService.getNdEncProvs();	
	}
	
	/* 1-guardar
	 * 2-actualizar
	 * 3-eliminar
	 * 4-consultar
	 * */
	/* Metodos de acciones CRUD*/
	public void agregar(){
		ndEncProv = new PymeNdEncProv();
		etiquetaBoton = "Guardar";
		accion = 1;
		habilitado = true;//es para saber si habilitamos los campos de captura del formulario.
	}
	public void actualizar(PymeNdEncProv pojo){
		ndEncProv = pojo;
		etiquetaBoton = "Actualizar";
		accion = 2;
		habilitado = true;
	}
	public void eliminar(PymeNdEncProv pojo){
		ndEncProv = pojo;
		etiquetaBoton = "Eliminar";
		accion = 3;
		habilitado = true;
	}
	public void consultar(PymeNdEncProv pojo){
		ndEncProv = pojo;
		etiquetaBoton = "Cerrar";
		accion = 4;
		habilitado = false;
	}
	
	
	public void guardarNdEncProv(){
		boolean result = false;
		switch (accion) {
		case 1:
			result = ndEncProvService.guardarNdEncProv(ndEncProv);
			if (result) {
				System.out.println("Registro Exitoso");
			} else {
				System.out.println("Registro Fallido");
			}
			break;
		case 2:
			result = ndEncProvService.actualizarNdEncProv(ndEncProv);
			if (result) {
				System.out.println("Registro Exitoso");
			} else {
				System.out.println("Registro Fallido");
			}
			break;
		case 3:
			result = ndEncProvService.eliminarNdEncProv(ndEncProv);
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
	
	
	
	
	public List<PymeNdEncProv> getNdEncProvs() {
		return ndEncProvs;
	}
	public void setNdEncProvs(List<PymeNdEncProv> ndEncProvs) {
		this.ndEncProvs = ndEncProvs;
	}
	public PymeNdEncProv getNdEncProv() {
		return ndEncProv;
	}
	public void setNdEncProv(PymeNdEncProv ndEncProv) {
		this.ndEncProv = ndEncProv;
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
