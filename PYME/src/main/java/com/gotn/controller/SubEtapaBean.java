package com.gotn.controller;

import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.gotn.model.PymeSubetapa;
import com.gotn.service.ISubetapaService;



/*Creado por jjara 2016-07-26*/
@Component
@Scope("session")
public class SubEtapaBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private ISubetapaService subetapaService;
	
	private List<PymeSubetapa> subEtapas;
	private PymeSubetapa subEtapa;
	private int accion;
	private String etiquetaBoton;
	private boolean habilitado;
	
	public void consultaListado(){
		subEtapas = subetapaService.getSubetapas();	
	}
	
	/* 1-guardar
	 * 2-actualizar
	 * 3-eliminar
	 * 4-consultar
	 * */
	/* Metodos de acciones CRUD*/
	public void agregar(){
		subEtapa = new PymeSubetapa();
		etiquetaBoton = "Guardar";
		accion = 1;
		habilitado = true;//es para saber si habilitamos los campos de captura del formulario.
	}
	public void actualizar(PymeSubetapa pojo){
		subEtapa = pojo;
		etiquetaBoton = "Actualizar";
		accion = 2;
		habilitado = true;
	}
	public void eliminar(PymeSubetapa pojo){
		subEtapa = pojo;
		etiquetaBoton = "Eliminar";
		accion = 3;
		habilitado = true;
	}
	public void consultar(PymeSubetapa pojo){
		subEtapa = pojo;
		etiquetaBoton = "Cerrar";
		accion = 4;
		habilitado = false;
	}
	
	
	public void guardarSubEtapa(){
		boolean result = false;
		switch (accion) {
		case 1:
			result = subetapaService.guardarSubetapa(subEtapa);
			if (result) {
				System.out.println("Registro Exitoso");
			} else {
				System.out.println("Registro Fallido");
			}
			break;
		case 2:
			result = subetapaService.actualizarSubetapa(subEtapa);
			if (result) {
				System.out.println("Registro Exitoso");
			} else {
				System.out.println("Registro Fallido");
			}
			break;
		case 3:
			result = subetapaService.eliminarSubetapa(subEtapa);
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
	
	
	
	
	public List<PymeSubetapa> getSubEtapas() {
		return subEtapas;
	}
	public void setSubEtapas(List<PymeSubetapa> subEtapas) {
		this.subEtapas = subEtapas;
	}
	public PymeSubetapa getSubEtapa() {
		return subEtapa;
	}
	public void setSubEtapa(PymeSubetapa subEtapa) {
		this.subEtapa = subEtapa;
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
