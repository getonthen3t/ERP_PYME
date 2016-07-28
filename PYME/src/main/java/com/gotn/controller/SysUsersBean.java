package com.gotn.controller;

import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.gotn.model.PymeSysUsers;
import com.gotn.service.ISysUsersService;



/*Creado por jjara 2016-07-26*/
@Component
@Scope("session")
public class SysUsersBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private ISysUsersService sysUsersService;
	
	
	private List<PymeSysUsers> sysUsers;
	private PymeSysUsers sysUser;
	private int accion;
	private String etiquetaBoton;
	private boolean habilitado;
	
	public void consultaListado(){
		sysUsers = sysUsersService.getSysUsers();	
	}
	
	/* 1-guardar
	 * 2-actualizar
	 * 3-eliminar
	 * 4-consultar
	 * */
	/* Metodos de acciones CRUD*/
	public void agregar(){
		sysUser = new PymeSysUsers();
		etiquetaBoton = "Guardar";
		accion = 1;
		habilitado = true;//es para saber si habilitamos los campos de captura del formulario.
	}
	public void actualizar(PymeSysUsers pojo){
		sysUser = pojo;
		etiquetaBoton = "Actualizar";
		accion = 2;
		habilitado = true;
	}
	public void eliminar(PymeSysUsers pojo){
		sysUser = pojo;
		etiquetaBoton = "Eliminar";
		accion = 3;
		habilitado = true;
	}
	public void consultar(PymeSysUsers pojo){
		sysUser = pojo;
		etiquetaBoton = "Cerrar";
		accion = 4;
		habilitado = false;
	}
	
	
	public void guardarSysUsers(){
		boolean result = false;
		switch (accion) {
		case 1:
			result = sysUsersService.guardarSysUser(sysUser);
			if (result) {
				System.out.println("Registro Exitoso");
			} else {
				System.out.println("Registro Fallido");
			}
			break;
		case 2:
			result = sysUsersService.actualizarSysUser(sysUser);
			if (result) {
				System.out.println("Registro Exitoso");
			} else {
				System.out.println("Registro Fallido");
			}
			break;
		case 3:
			result = sysUsersService.eliminarSysUser(sysUser);
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
	
	
	
	public List<PymeSysUsers> getSysUsers() {
		return sysUsers;
	}
	public void setSysUsers(List<PymeSysUsers> sysUsers) {
		this.sysUsers = sysUsers;
	}
	public PymeSysUsers getSysUser() {
		return sysUser;
	}
	public void setSysUser(PymeSysUsers sysUser) {
		this.sysUser = sysUser;
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
