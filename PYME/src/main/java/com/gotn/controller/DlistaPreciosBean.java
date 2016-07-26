package com.gotn.controller;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.gotn.model.PymeDlistaPrecios;
import com.gotn.service.IDlistaPreciosService;

/*Creado por jjara 2016-07-26*/
@Component
public class DlistaPreciosBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private IDlistaPreciosService dlistaPreciosService;
	
	private List<PymeDlistaPrecios> dlistaPrecios;
	private PymeDlistaPrecios dlistaPrecio;
	private int accion;
	private String etiquetaBoton;
	private boolean habilitado;
	
	
	public void consultaListado(){
		dlistaPrecios = dlistaPreciosService.getlistaPrecios();
	}
	
	/* 1-guardar
	 * 2-actualizar
	 * 3-eliminar
	 * 4-consultar
	 * */
	/* Metodos de acciones CRUD*/
	public void agregar(){
		dlistaPrecio = new PymeDlistaPrecios();
		etiquetaBoton = "Guardar";
		accion = 1;
		habilitado = true;//es para saber si habilitamos los campos de captura del formulario.
	}
	public void actualizar(PymeDlistaPrecios pojo){
		dlistaPrecio = pojo;
		etiquetaBoton = "Actualizar";
		accion = 2;
		habilitado = true;
	}
	public void eliminar(PymeDlistaPrecios pojo){
		dlistaPrecio = pojo;
		etiquetaBoton = "Eliminar";
		accion = 3;
		habilitado = true;
	}
	public void consultar(PymeDlistaPrecios pojo){
		dlistaPrecio = pojo;
		etiquetaBoton = "Cerrar";
		accion = 4;
		habilitado = false;
	}
	public void guardarDlistaPrecios(){
		boolean result = false;
		switch (accion) {
		case 1:
			result = dlistaPreciosService.guardarlistaPrecios(dlistaPrecio);
			if (result) {
				System.out.println("Registro Exitoso");
			} else {
				System.out.println("Registro Fallido");
			}
			break;
		case 2:
			result = dlistaPreciosService.actualizarlistaPrecios(dlistaPrecio);
			if (result) {
				System.out.println("Registro Exitoso");
			} else {
				System.out.println("Registro Fallido");
			}
			break;
		case 3:
			result = dlistaPreciosService.eliminarlistaPrecios(dlistaPrecio);
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
	
	
	
	
	public List<PymeDlistaPrecios> getDlistaPrecios() {
		return dlistaPrecios;
	}
	public void setDlistaPrecios(List<PymeDlistaPrecios> dlistaPrecios) {
		this.dlistaPrecios = dlistaPrecios;
	}
	public PymeDlistaPrecios getDlistaPrecio() {
		return dlistaPrecio;
	}
	public void setDlistaPrecio(PymeDlistaPrecios dlistaPrecio) {
		this.dlistaPrecio = dlistaPrecio;
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
