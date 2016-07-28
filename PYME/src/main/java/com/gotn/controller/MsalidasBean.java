package com.gotn.controller;

import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.gotn.model.PymeMsalidas;
import com.gotn.service.IMsalidasService;




/*Creado por jjara 2016-07-26*/
@Component
@Scope("session")
public class MsalidasBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private IMsalidasService msalidasService;
	
	private List<PymeMsalidas> msalidas;
	private PymeMsalidas msalida;
	private int accion;
	private String etiquetaBoton;
	private boolean habilitado;
	
	public void consultaListado(){
		msalidas = msalidasService.getMsalidas();	
	}
	
	/* 1-guardar
	 * 2-actualizar
	 * 3-eliminar
	 * 4-consultar
	 * */
	/* Metodos de acciones CRUD*/
	public void agregar(){
		msalida = new PymeMsalidas();
		etiquetaBoton = "Guardar";
		accion = 1;
		habilitado = true;//es para saber si habilitamos los campos de captura del formulario.
	}
	public void actualizar(PymeMsalidas pojo){
		msalida = pojo;
		etiquetaBoton = "Actualizar";
		accion = 2;
		habilitado = true;
	}
	public void eliminar(PymeMsalidas pojo){
		msalida = pojo;
		etiquetaBoton = "Eliminar";
		accion = 3;
		habilitado = true;
	}
	public void consultar(PymeMsalidas pojo){
		msalida = pojo;
		etiquetaBoton = "Cerrar";
		accion = 4;
		habilitado = false;
	}
	
	
	public void guardarMsalidas(){
		boolean result = false;
		switch (accion) {
		case 1:
			result = msalidasService.guardarMsalidas(msalida);
			if (result) {
				System.out.println("Registro Exitoso");
			} else {
				System.out.println("Registro Fallido");
			}
			break;
		case 2:
			result = msalidasService.actualizarMsalidas(msalida);
			if (result) {
				System.out.println("Registro Exitoso");
			} else {
				System.out.println("Registro Fallido");
			}
			break;
		case 3:
			result = msalidasService.eliminarMsalidas(msalida);
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
	
	
	
	
	public List<PymeMsalidas> getMsalidas() {
		return msalidas;
	}
	public void setMsalidas(List<PymeMsalidas> msalidas) {
		this.msalidas = msalidas;
	}
	public PymeMsalidas getMsalida() {
		return msalida;
	}
	public void setMsalida(PymeMsalidas msalida) {
		this.msalida = msalida;
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
