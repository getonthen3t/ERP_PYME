package com.gotn.controller;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.gotn.model.PymeDentradas;
import com.gotn.model.PymeFacncDetProv;
import com.gotn.service.IDentradasService;
import com.gotn.service.IFacncDetProvService;



/*Creado por jjara 2016-07-26*/
@Component
@Scope("session")
public class FacncDetProvBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Autowired
	private IFacncDetProvService facncDetProvService;
	
	
	private List<PymeFacncDetProv> facncDetProvs;
	private PymeFacncDetProv facncDetProv;
	private int accion;
	private String etiquetaBoton;
	private boolean habilitado;
	
	public void consultaListado(){
		facncDetProvs = facncDetProvService.getFacncDetProvs();	
	}
	
	
	/* 1-guardar
	 * 2-actualizar
	 * 3-eliminar
	 * 4-consultar
	 * */
	/* Metodos de acciones CRUD*/
	public void agregar(){
		facncDetProv = new PymeFacncDetProv();
		etiquetaBoton = "Guardar";
		accion = 1;
		habilitado = true;//es para saber si habilitamos los campos de captura del formulario.
	}
	public void actualizar(PymeFacncDetProv pojo){
		facncDetProv = pojo;
		etiquetaBoton = "Actualizar";
		accion = 2;
		habilitado = true;
	}
	public void eliminar(PymeFacncDetProv pojo){
		facncDetProv = pojo;
		etiquetaBoton = "Eliminar";
		accion = 3;
		habilitado = true;
	}
	public void consultar(PymeFacncDetProv pojo){
		facncDetProv = pojo;
		etiquetaBoton = "Cerrar";
		accion = 4;
		habilitado = false;
	}
	
	
	public void guardarFacncDetProv(){
		boolean result = false;
		switch (accion) {
		case 1:
			result = facncDetProvService.guardarFacncDetProv(facncDetProv);
			if (result) {
				System.out.println("Registro Exitoso");
			} else {
				System.out.println("Registro Fallido");
			}
			break;
		case 2:
			result = facncDetProvService.actualizarFacncDetProv(facncDetProv);
			if (result) {
				System.out.println("Registro Exitoso");
			} else {
				System.out.println("Registro Fallido");
			}
			break;
		case 3:
			result = facncDetProvService.eliminarFacncDetProv(facncDetProv);
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
	
	
	
	public List<PymeFacncDetProv> getFacncDetProvs() {
		return facncDetProvs;
	}
	public void setFacncDetProvs(List<PymeFacncDetProv> facncDetProvs) {
		this.facncDetProvs = facncDetProvs;
	}
	public PymeFacncDetProv getFacncDetProv() {
		return facncDetProv;
	}
	public void setFacncDetProv(PymeFacncDetProv facncDetProv) {
		this.facncDetProv = facncDetProv;
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
