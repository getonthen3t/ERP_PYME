package com.gotn.controller;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.gotn.model.PymeConsecutivos;
import com.gotn.service.IConsecutivoService;
/*Creado por asanchez 2016-07-25*/
@Component
@Scope("session")
public class ConsecutivoBean implements Serializable {
/*	Spring maneja cuatro tipos de scope: singleton - prototype - session- request
 * 
 * */
	/**
	 * serialVersionUID <- Hace mas facil utilizar las clase serializables
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private IConsecutivoService consecutivoService;
	
	private List<PymeConsecutivos> consecutivos;
	private PymeConsecutivos consecutivo;
	private int accion;
	private String etiquetaBoton;
	private boolean habilitado;
	
	public void consultaListado(){
		consecutivos = consecutivoService.getConsecutivos();
	}
	
	/* 1-guardar
	 * 2-actualizar
	 * 3-eliminar
	 * 4-consultar
	 * */
	/* Metodos de acciones CRUD*/
	public void agregar(){
		consecutivo = new PymeConsecutivos();
		etiquetaBoton = "Guardar";
		accion = 1;
		habilitado = true;//es para saber si habilitamos los campos de captura del formulario.
	}
	public void actualizar(PymeConsecutivos pojo){
		consecutivo = pojo;
		etiquetaBoton = "Actualizar";
		accion = 2;
		habilitado = true;
	}
	public void eliminar(PymeConsecutivos pojo){
		consecutivo = pojo;
		etiquetaBoton = "Eliminar";
		accion = 3;
		habilitado = true;
	}
	public void consultar(PymeConsecutivos pojo){
		consecutivo = pojo;
		etiquetaBoton = "Cerrar";
		accion = 4;
		habilitado = false;
	}
	public void guardarConsecutivo(){
		boolean result = false;
		switch (accion) {
		case 1:
			result = consecutivoService.guardarConsecutivo(consecutivo);
			if (result) {
				System.out.println("Registro Exitoso");
			} else {
				System.out.println("Registro Fallido");
			}
			break;
		case 2:
			result = consecutivoService.actualizarConsecutivo(consecutivo);
			if (result) {
				System.out.println("Registro Exitoso");
			} else {
				System.out.println("Registro Fallido");
			}
			break;
		case 3:
			result = consecutivoService.eliminarConsecutivo(consecutivo);
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
	
	public List<PymeConsecutivos> getConsecutivos() {
		return consecutivos;
	}
	public void setConsecutivos(List<PymeConsecutivos> consecutivos) {
		this.consecutivos = consecutivos;
	}
	public PymeConsecutivos getConsecutivo() {
		return consecutivo;
	}
	public void setConsecutivo(PymeConsecutivos consecutivo) {
		this.consecutivo = consecutivo;
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
