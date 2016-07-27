package com.gotn.controller;

import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.gotn.model.PymeSysPermisos;
import com.gotn.service.ISysPermisosService;


/*Creado por jjara 2016-07-26*/
@Component
public class SysPermisosBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private ISysPermisosService sysPermisosService;
	
	private List<PymeSysPermisos> syspermisos;
	private PymeSysPermisos syspermiso;
	private int accion;
	private String etiquetaBoton;
	private boolean habilitado;
	
	public void consultaListado(){
		syspermisos = sysPermisosService.getSysPermisos();	
	}
	
	/* 1-guardar
	 * 2-actualizar
	 * 3-eliminar
	 * 4-consultar
	 * */
	/* Metodos de acciones CRUD*/
	public void agregar(){
		syspermiso = new PymeSysPermisos();
		etiquetaBoton = "Guardar";
		accion = 1;
		habilitado = true;//es para saber si habilitamos los campos de captura del formulario.
	}
	public void actualizar(PymeSysPermisos pojo){
		syspermiso = pojo;
		etiquetaBoton = "Actualizar";
		accion = 2;
		habilitado = true;
	}
	public void eliminar(PymeSysPermisos pojo){
		syspermiso = pojo;
		etiquetaBoton = "Eliminar";
		accion = 3;
		habilitado = true;
	}
	public void consultar(PymeSysPermisos pojo){
		syspermiso = pojo;
		etiquetaBoton = "Cerrar";
		accion = 4;
		habilitado = false;
	}
	
	
	public void guardarSysPermisos(){
		boolean result = false;
		switch (accion) {
		case 1:
			result = sysPermisosService.guardarSysPermiso(syspermiso);
			if (result) {
				System.out.println("Registro Exitoso");
			} else {
				System.out.println("Registro Fallido");
			}
			break;
		case 2:
			result = sysPermisosService.actualizarSysPermiso(syspermiso);
			if (result) {
				System.out.println("Registro Exitoso");
			} else {
				System.out.println("Registro Fallido");
			}
			break;
		case 3:
			result = sysPermisosService.eliminarSysPermiso(syspermiso);
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
	
	
	
	public List<PymeSysPermisos> getSyspermisos() {
		return syspermisos;
	}
	public void setSyspermisos(List<PymeSysPermisos> syspermisos) {
		this.syspermisos = syspermisos;
	}
	public PymeSysPermisos getSyspermiso() {
		return syspermiso;
	}
	public void setSyspermiso(PymeSysPermisos syspermiso) {
		this.syspermiso = syspermiso;
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
