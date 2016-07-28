package com.gotn.controller;

import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.gotn.model.PymeMlistaPrecios;
import com.gotn.service.IMlistaPreciosService;


/*Creado por jjara 2016-07-26*/
@Component
@Scope("session")
public class MlistaPreciosBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private IMlistaPreciosService mlistaPreciosService;
	
	private List<PymeMlistaPrecios> mlistaPrecios;
	private PymeMlistaPrecios mlistaPrecio;
	private int accion;
	private String etiquetaBoton;
	private boolean habilitado;
	
	public void consultaListado(){
		mlistaPrecios = mlistaPreciosService.getMlistaPrecios();	
	}
	
	/* 1-guardar
	 * 2-actualizar
	 * 3-eliminar
	 * 4-consultar
	 * */
	/* Metodos de acciones CRUD*/
	public void agregar(){
		mlistaPrecio = new PymeMlistaPrecios();
		etiquetaBoton = "Guardar";
		accion = 1;
		habilitado = true;//es para saber si habilitamos los campos de captura del formulario.
	}
	public void actualizar(PymeMlistaPrecios pojo){
		mlistaPrecio = pojo;
		etiquetaBoton = "Actualizar";
		accion = 2;
		habilitado = true;
	}
	public void eliminar(PymeMlistaPrecios pojo){
		mlistaPrecio = pojo;
		etiquetaBoton = "Eliminar";
		accion = 3;
		habilitado = true;
	}
	public void consultar(PymeMlistaPrecios pojo){
		mlistaPrecio = pojo;
		etiquetaBoton = "Cerrar";
		accion = 4;
		habilitado = false;
	}
	
	
	public void guardarMlistaPrecios(){
		boolean result = false;
		switch (accion) {
		case 1:
			result = mlistaPreciosService.guardarMlistaPrecios(mlistaPrecio);
			if (result) {
				System.out.println("Registro Exitoso");
			} else {
				System.out.println("Registro Fallido");
			}
			break;
		case 2:
			result = mlistaPreciosService.actualizarMlistaPrecios(mlistaPrecio);
			if (result) {
				System.out.println("Registro Exitoso");
			} else {
				System.out.println("Registro Fallido");
			}
			break;
		case 3:
			result = mlistaPreciosService.eliminarMlistaPrecios(mlistaPrecio);
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
	
	
	
	
	
	public List<PymeMlistaPrecios> getMlistaPrecios() {
		return mlistaPrecios;
	}
	public void setMlistaPrecios(List<PymeMlistaPrecios> mlistaPrecios) {
		this.mlistaPrecios = mlistaPrecios;
	}
	public PymeMlistaPrecios getMlistaPrecio() {
		return mlistaPrecio;
	}
	public void setMlistaPrecio(PymeMlistaPrecios mlistaPrecio) {
		this.mlistaPrecio = mlistaPrecio;
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
