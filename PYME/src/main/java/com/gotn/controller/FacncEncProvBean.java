package com.gotn.controller;

import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.gotn.model.PymeFacncEncProv;
import com.gotn.service.IFacncEncProvService;


/*Creado por jjara 2016-07-26*/
@Component
@Scope("session")
public class FacncEncProvBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private IFacncEncProvService facncEncProvService;
	
	private List<PymeFacncEncProv> facncEncProvs;
	private PymeFacncEncProv facncEncProv;
	private int accion;
	private String etiquetaBoton;
	private boolean habilitado;
	
	public void consultaListado(){
		facncEncProvs = facncEncProvService.getFacncEncProvs();	
	}
	
	/* 1-guardar
	 * 2-actualizar
	 * 3-eliminar
	 * 4-consultar
	 * */
	/* Metodos de acciones CRUD*/
	public void agregar(){
		facncEncProv = new PymeFacncEncProv();
		etiquetaBoton = "Guardar";
		accion = 1;
		habilitado = true;//es para saber si habilitamos los campos de captura del formulario.
	}
	public void actualizar(PymeFacncEncProv pojo){
		facncEncProv = pojo;
		etiquetaBoton = "Actualizar";
		accion = 2;
		habilitado = true;
	}
	public void eliminar(PymeFacncEncProv pojo){
		facncEncProv = pojo;
		etiquetaBoton = "Eliminar";
		accion = 3;
		habilitado = true;
	}
	public void consultar(PymeFacncEncProv pojo){
		facncEncProv = pojo;
		etiquetaBoton = "Cerrar";
		accion = 4;
		habilitado = false;
	}
	
	
	public void guardarFacncEncProv(){
		boolean result = false;
		switch (accion) {
		case 1:
			result = facncEncProvService.guardarFacncEncProv(facncEncProv);
			if (result) {
				System.out.println("Registro Exitoso");
			} else {
				System.out.println("Registro Fallido");
			}
			break;
		case 2:
			result = facncEncProvService.actualizarFacncEncProv(facncEncProv);
			if (result) {
				System.out.println("Registro Exitoso");
			} else {
				System.out.println("Registro Fallido");
			}
			break;
		case 3:
			result = facncEncProvService.eliminarFacncEncProv(facncEncProv);
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
	
	
	
	
	
	public List<PymeFacncEncProv> getFacncEncProvs() {
		return facncEncProvs;
	}

	public void setFacncEncProvs(List<PymeFacncEncProv> facncEncProvs) {
		this.facncEncProvs = facncEncProvs;
	}

	public PymeFacncEncProv getFacncEncProv() {
		return facncEncProv;
	}

	public void setFacncEncProv(PymeFacncEncProv facncEncProv) {
		this.facncEncProv = facncEncProv;
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
