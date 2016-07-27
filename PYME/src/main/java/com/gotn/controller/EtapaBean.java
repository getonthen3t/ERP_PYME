package com.gotn.controller;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.gotn.model.PymeEtapa;
import com.gotn.service.IEtapaService;


/*Creado por jjara 2016-07-26*/
@Component
public class EtapaBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	@Autowired
	private IEtapaService etapaService;
	
	private List<PymeEtapa> etapas;
	private PymeEtapa etapa;
	private int accion;
	private String etiquetaBoton;
	private boolean habilitado;
	
	public void consultaListado(){
		etapas = etapaService.getEtapas();	
	}
	
	/* 1-guardar
	 * 2-actualizar
	 * 3-eliminar
	 * 4-consultar
	 * */
	/* Metodos de acciones CRUD*/
	public void agregar(){
		etapa = new PymeEtapa();
		etiquetaBoton = "Guardar";
		accion = 1;
		habilitado = true;//es para saber si habilitamos los campos de captura del formulario.
	}
	public void actualizar(PymeEtapa pojo){
		etapa = pojo;
		etiquetaBoton = "Actualizar";
		accion = 2;
		habilitado = true;
	}
	public void eliminar(PymeEtapa pojo){
		etapa = pojo;
		etiquetaBoton = "Eliminar";
		accion = 3;
		habilitado = true;
	}
	public void consultar(PymeEtapa pojo){
		etapa = pojo;
		etiquetaBoton = "Cerrar";
		accion = 4;
		habilitado = false;
	}
	
	
	public void guardarEtapa(){
		boolean result = false;
		switch (accion) {
		case 1:
			result = etapaService.guardarEtapa(etapa);
			if (result) {
				System.out.println("Registro Exitoso");
			} else {
				System.out.println("Registro Fallido");
			}
			break;
		case 2:
			result = etapaService.actualizarEtapa(etapa);
			if (result) {
				System.out.println("Registro Exitoso");
			} else {
				System.out.println("Registro Fallido");
			}
			break;
		case 3:
			result = etapaService.eliminarEtapa(etapa);
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
	
	
	
	
	
	public List<PymeEtapa> getEtapas() {
		return etapas;
	}
	public void setEtapas(List<PymeEtapa> etapas) {
		this.etapas = etapas;
	}
	public PymeEtapa getEtapa() {
		return etapa;
	}
	public void setEtapa(PymeEtapa etapa) {
		this.etapa = etapa;
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
