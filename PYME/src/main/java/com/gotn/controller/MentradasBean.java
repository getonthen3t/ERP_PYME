package com.gotn.controller;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.gotn.model.PymeMentradas;
import com.gotn.service.IMentradasService;



/*Creado por jjara 2016-07-26*/
@Component
@Scope("session")
public class MentradasBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Autowired
	private IMentradasService mentradasService;
	
	private List<PymeMentradas> mentradas;
	private PymeMentradas mentrada;
	private int accion;
	private String etiquetaBoton;
	private boolean habilitado;
	
	public void consultaListado(){
		mentradas = mentradasService.getMentradas();	
	}
	
	/* 1-guardar
	 * 2-actualizar
	 * 3-eliminar
	 * 4-consultar
	 * */
	/* Metodos de acciones CRUD*/
	public void agregar(){
		mentrada = new PymeMentradas();
		etiquetaBoton = "Guardar";
		accion = 1;
		habilitado = true;//es para saber si habilitamos los campos de captura del formulario.
	}
	public void actualizar(PymeMentradas pojo){
		mentrada = pojo;
		etiquetaBoton = "Actualizar";
		accion = 2;
		habilitado = true;
	}
	public void eliminar(PymeMentradas pojo){
		mentrada = pojo;
		etiquetaBoton = "Eliminar";
		accion = 3;
		habilitado = true;
	}
	public void consultar(PymeMentradas pojo){
		mentrada = pojo;
		etiquetaBoton = "Cerrar";
		accion = 4;
		habilitado = false;
	}
	
	
	public void guardarMentradas(){
		boolean result = false;
		switch (accion) {
		case 1:
			result = mentradasService.guardarMentradas(mentrada);
			if (result) {
				System.out.println("Registro Exitoso");
			} else {
				System.out.println("Registro Fallido");
			}
			break;
		case 2:
			result = mentradasService.actualizarMentradas(mentrada);
			if (result) {
				System.out.println("Registro Exitoso");
			} else {
				System.out.println("Registro Fallido");
			}
			break;
		case 3:
			result = mentradasService.eliminarMentradas(mentrada);
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
	
	
	
	public List<PymeMentradas> getMentradas() {
		return mentradas;
	}
	public void setMentradas(List<PymeMentradas> mentradas) {
		this.mentradas = mentradas;
	}
	public PymeMentradas getMentrada() {
		return mentrada;
	}
	public void setMentrada(PymeMentradas mentrada) {
		this.mentrada = mentrada;
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
