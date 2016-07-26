package com.gotn.controller;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gotn.model.PymeConsecutivos;
import com.gotn.model.PymeDentradas;
import com.gotn.service.IDentradasService;
import java.util.List;


/*Creado por jjara 2016-07-26*/
@Component
public class DentradasBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private IDentradasService dentradasService;

	private List<PymeDentradas> dentradas;
	private PymeDentradas dentrada;
	private int accion;
	private String etiquetaBoton;
	private boolean habilitado;
	
	public void consultaListado(){
		dentradas = dentradasService.getDentradas();	
	}
	
	/* 1-guardar
	 * 2-actualizar
	 * 3-eliminar
	 * 4-consultar
	 * */
	/* Metodos de acciones CRUD*/
	public void agregar(){
		dentrada = new PymeDentradas();
		etiquetaBoton = "Guardar";
		accion = 1;
		habilitado = true;//es para saber si habilitamos los campos de captura del formulario.
	}
	public void actualizar(PymeDentradas pojo){
		dentrada = pojo;
		etiquetaBoton = "Actualizar";
		accion = 2;
		habilitado = true;
	}
	public void eliminar(PymeDentradas pojo){
		dentrada = pojo;
		etiquetaBoton = "Eliminar";
		accion = 3;
		habilitado = true;
	}
	public void consultar(PymeDentradas pojo){
		dentrada = pojo;
		etiquetaBoton = "Cerrar";
		accion = 4;
		habilitado = false;
	}
	
	
	public void guardarDentradas(){
		boolean result = false;
		switch (accion) {
		case 1:
			result = dentradasService.guardarDentradas(dentrada);
			if (result) {
				System.out.println("Registro Exitoso");
			} else {
				System.out.println("Registro Fallido");
			}
			break;
		case 2:
			result = dentradasService.actualizarDentradas(dentrada);
			if (result) {
				System.out.println("Registro Exitoso");
			} else {
				System.out.println("Registro Fallido");
			}
			break;
		case 3:
			result = dentradasService.eliminarDentradas(dentrada);
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
	
	
	
	
	public List<PymeDentradas> getDentradas() {
		return dentradas;
	}
	public void setDentradas(List<PymeDentradas> dentradas) {
		this.dentradas = dentradas;
	}
	public PymeDentradas getDentrada() {
		return dentrada;
	}
	public void setDentrada(PymeDentradas dentrada) {
		this.dentrada = dentrada;
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
