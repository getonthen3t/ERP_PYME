package com.gotn.controller;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.gotn.model.PymeSysSeguridad;
import com.gotn.service.ISysSeguridadService;



/*Creado por jjara 2016-07-26*/
@Component
public class SysSeguridadBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private ISysSeguridadService sysSeguridadService;

	private List<PymeSysSeguridad> sysSeguridads;
	private PymeSysSeguridad sysSeguridad;
	private int accion;
	private String etiquetaBoton;
	private boolean habilitado;
	
	public void consultaListado(){
		sysSeguridads = sysSeguridadService.getSysSeguridades();	
	}
	
	/* 1-guardar
	 * 2-actualizar
	 * 3-eliminar
	 * 4-consultar
	 * */
	/* Metodos de acciones CRUD*/
	public void agregar(){
		sysSeguridad = new PymeSysSeguridad();
		etiquetaBoton = "Guardar";
		accion = 1;
		habilitado = true;//es para saber si habilitamos los campos de captura del formulario.
	}
	public void actualizar(PymeSysSeguridad pojo){
		sysSeguridad = pojo;
		etiquetaBoton = "Actualizar";
		accion = 2;
		habilitado = true;
	}
	public void eliminar(PymeSysSeguridad pojo){
		sysSeguridad = pojo;
		etiquetaBoton = "Eliminar";
		accion = 3;
		habilitado = true;
	}
	public void consultar(PymeSysSeguridad pojo){
		sysSeguridad = pojo;
		etiquetaBoton = "Cerrar";
		accion = 4;
		habilitado = false;
	}
	
	
	public void guardarSysSeguridad(){
		boolean result = false;
		switch (accion) {
		case 1:
			result = sysSeguridadService.guardarSysSeguridad(sysSeguridad);
			if (result) {
				System.out.println("Registro Exitoso");
			} else {
				System.out.println("Registro Fallido");
			}
			break;
		case 2:
			result = sysSeguridadService.actualizarSysSeguridad(sysSeguridad);
			if (result) {
				System.out.println("Registro Exitoso");
			} else {
				System.out.println("Registro Fallido");
			}
			break;
		case 3:
			result = sysSeguridadService.eliminarSysSeguridad(sysSeguridad);
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
	
	
	public List<PymeSysSeguridad> getSysSeguridads() {
		return sysSeguridads;
	}
	public void setSysSeguridads(List<PymeSysSeguridad> sysSeguridads) {
		this.sysSeguridads = sysSeguridads;
	}
	public PymeSysSeguridad getSysSeguridad() {
		return sysSeguridad;
	}
	public void setSysSeguridad(PymeSysSeguridad sysSeguridad) {
		this.sysSeguridad = sysSeguridad;
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
