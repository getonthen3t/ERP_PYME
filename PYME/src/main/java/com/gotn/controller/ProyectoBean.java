package com.gotn.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.gotn.model.PymeProyecto;
import com.gotn.service.IProyectoService;



/*Creado por jjara 2016-07-26*/
@Component
@Scope("session")
@ManagedBean
public class ProyectoBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	private IProyectoService proyectoService;
	
	private List<PymeProyecto> proyectos;
	private PymeProyecto proyecto;
	private int accion;
	private String etiquetaBoton;
	private boolean habilitado;
	
	public void consultaListado(){
		proyectos = proyectoService.getProyectos();	
	}
	
	/* 1-guardar
	 * 2-actualizar
	 * 3-eliminar
	 * 4-consultar
	 * */
	/* Metodos de acciones CRUD*/
	public void agregar(){
		proyecto = new PymeProyecto();
		etiquetaBoton = "Guardar";
		accion = 1;
		habilitado = true;//es para saber si habilitamos los campos de captura del formulario.
	}
	public void actualizar(PymeProyecto pojo){
		proyecto = pojo;
		etiquetaBoton = "Actualizar";
		accion = 2;
		habilitado = true;
	}
	public void eliminar(PymeProyecto pojo){
		proyecto = pojo;
		etiquetaBoton = "Eliminar";
		accion = 3;
		habilitado = true;
	}
	public void consultar(PymeProyecto pojo){
		proyecto = pojo;
		etiquetaBoton = "Cerrar";
		accion = 4;
		habilitado = false;
	}
	
	
	public void guardarProyecto(){
		boolean result = false;
		switch (accion) {
		case 1:
			result = proyectoService.guardarProyecto(proyecto);
			if (result) {
				System.out.println("Registro Exitoso");
			} else {
				System.out.println("Registro Fallido");
			}
			break;
		case 2:
			result = proyectoService.actualizarProyecto(proyecto);
			if (result) {
				System.out.println("Registro Exitoso");
			} else {
				System.out.println("Registro Fallido");
			}
			break;
		case 3:
			result = proyectoService.eliminarProyecto(proyecto);
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
	
	
	
	
	public List<PymeProyecto> getProyectos() {
		return proyectos;
	}
	public void setProyectos(List<PymeProyecto> proyectos) {
		this.proyectos = proyectos;
	}
	public PymeProyecto getProyecto() {
		return proyecto;
	}
	public void setProyecto(PymeProyecto proyecto) {
		this.proyecto = proyecto;
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
