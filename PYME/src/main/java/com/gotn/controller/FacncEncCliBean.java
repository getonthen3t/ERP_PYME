package com.gotn.controller;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.gotn.model.PymeFacncEncCli;
import com.gotn.service.IFacncEncCliService;


/*Creado por jjara 2016-07-26*/
@Component
@Scope("session")
public class FacncEncCliBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private IFacncEncCliService facncEncCliService;
	
	private List<PymeFacncEncCli> facncEncClis;
	private PymeFacncEncCli facncEncCli;
	private int accion;
	private String etiquetaBoton;
	private boolean habilitado;
	
	public void consultaListado(){
		facncEncClis = facncEncCliService.getFacncEncClis();	
	}
	
	/* 1-guardar
	 * 2-actualizar
	 * 3-eliminar
	 * 4-consultar
	 * */
	/* Metodos de acciones CRUD*/
	public void agregar(){
		facncEncCli = new PymeFacncEncCli();
		etiquetaBoton = "Guardar";
		accion = 1;
		habilitado = true;//es para saber si habilitamos los campos de captura del formulario.
	}
	public void actualizar(PymeFacncEncCli pojo){
		facncEncCli = pojo;
		etiquetaBoton = "Actualizar";
		accion = 2;
		habilitado = true;
	}
	public void eliminar(PymeFacncEncCli pojo){
		facncEncCli = pojo;
		etiquetaBoton = "Eliminar";
		accion = 3;
		habilitado = true;
	}
	public void consultar(PymeFacncEncCli pojo){
		facncEncCli = pojo;
		etiquetaBoton = "Cerrar";
		accion = 4;
		habilitado = false;
	}
	
	
	public void guardarFacncEncCli(){
		boolean result = false;
		switch (accion) {
		case 1:
			result = facncEncCliService.guardarFacncEncCli(facncEncCli);
			if (result) {
				System.out.println("Registro Exitoso");
			} else {
				System.out.println("Registro Fallido");
			}
			break;
		case 2:
			result = facncEncCliService.actualizarFacncEncCli(facncEncCli);
			if (result) {
				System.out.println("Registro Exitoso");
			} else {
				System.out.println("Registro Fallido");
			}
			break;
		case 3:
			result = facncEncCliService.eliminarFacncEncCli(facncEncCli);
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
	
	
	
	public List<PymeFacncEncCli> getFacncEncClis() {
		return facncEncClis;
	}
	public void setFacncEncClis(List<PymeFacncEncCli> facncEncClis) {
		this.facncEncClis = facncEncClis;
	}
	public PymeFacncEncCli getFacncEncCli() {
		return facncEncCli;
	}
	public void setFacncEncCli(PymeFacncEncCli facncEncCli) {
		this.facncEncCli = facncEncCli;
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
