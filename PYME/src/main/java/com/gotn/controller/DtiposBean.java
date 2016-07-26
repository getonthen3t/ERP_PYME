package com.gotn.controller;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.gotn.model.PymeDtipos;

import com.gotn.service.IDtiposService;


/*Creado por jjara 2016-07-26*/
@Component
public class DtiposBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private IDtiposService dtiposService;
	
	private List<PymeDtipos> dtipos;
	private PymeDtipos dtipo;
	private int accion;
	private String etiquetaBoton;
	private boolean habilitado;
	
	public void consultaListado(){
		dtipos = dtiposService.getDtipos();
	}

	/* 1-guardar
	 * 2-actualizar
	 * 3-eliminar
	 * 4-consultar
	 * */
	/* Metodos de acciones CRUD*/
	public void agregar(){
		dtipo = new PymeDtipos();
		etiquetaBoton = "Guardar";
		accion = 1;
		habilitado = true;//es para saber si habilitamos los campos de captura del formulario.
	}
	public void actualizar(PymeDtipos pojo){
		dtipo = pojo;
		etiquetaBoton = "Actualizar";
		accion = 2;
		habilitado = true;
	}
	public void eliminar(PymeDtipos pojo){
		dtipo = pojo;
		etiquetaBoton = "Eliminar";
		accion = 3;
		habilitado = true;
	}
	public void consultar(PymeDtipos pojo){
		dtipo = pojo;
		etiquetaBoton = "Cerrar";
		accion = 4;
		habilitado = false;
	}
	
	public void guardarDtipos(){
		boolean result = false;
		switch (accion) {
		case 1:
			result = dtiposService.guardarDtipos(dtipo);
			if (result) {
				System.out.println("Registro Exitoso");
			} else {
				System.out.println("Registro Fallido");
			}
			break;
		case 2:
			result = dtiposService.actualizarDtipos(dtipo);
			if (result) {
				System.out.println("Registro Exitoso");
			} else {
				System.out.println("Registro Fallido");
			}
			break;
		case 3:
			result = dtiposService.eliminarDtipos(dtipo);
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
	
	
	
	
	
	public List<PymeDtipos> getDtipos() {
		return dtipos;
	}

	public void setDtipos(List<PymeDtipos> dtipos) {
		this.dtipos = dtipos;
	}

	public PymeDtipos getDtipo() {
		return dtipo;
	}

	public void setDtipo(PymeDtipos dtipo) {
		this.dtipo = dtipo;
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
