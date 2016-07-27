package com.gotn.controller;

import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.gotn.model.PymeFacncDetCli;
import com.gotn.service.IFacncDetCliService;




/*Creado por jjara 2016-07-26*/
@Component
public class FacncDetCliBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private IFacncDetCliService facncDetCliService;
	
	private List<PymeFacncDetCli> facncDetClis;
	private PymeFacncDetCli facncDetCli;
	private int accion;
	private String etiquetaBoton;
	private boolean habilitado;
	
	public void consultaListado(){
		facncDetClis = facncDetCliService.getFacncDetClis();	
	}
	
	/* 1-guardar
	 * 2-actualizar
	 * 3-eliminar
	 * 4-consultar
	 * */
	/* Metodos de acciones CRUD*/
	public void agregar(){
		facncDetCli = new PymeFacncDetCli();
		etiquetaBoton = "Guardar";
		accion = 1;
		habilitado = true;//es para saber si habilitamos los campos de captura del formulario.
	}
	public void actualizar(PymeFacncDetCli pojo){
		facncDetCli = pojo;
		etiquetaBoton = "Actualizar";
		accion = 2;
		habilitado = true;
	}
	public void eliminar(PymeFacncDetCli pojo){
		facncDetCli = pojo;
		etiquetaBoton = "Eliminar";
		accion = 3;
		habilitado = true;
	}
	public void consultar(PymeFacncDetCli pojo){
		facncDetCli = pojo;
		etiquetaBoton = "Cerrar";
		accion = 4;
		habilitado = false;
	}
	
	
	public void guardarFacncDetCli(){
		boolean result = false;
		switch (accion) {
		case 1:
			result = facncDetCliService.guardarFacncDetCli(facncDetCli);
			if (result) {
				System.out.println("Registro Exitoso");
			} else {
				System.out.println("Registro Fallido");
			}
			break;
		case 2:
			result = facncDetCliService.actualizarFacncDetCli(facncDetCli);
			if (result) {
				System.out.println("Registro Exitoso");
			} else {
				System.out.println("Registro Fallido");
			}
			break;
		case 3:
			result = facncDetCliService.eliminarFacncDetCli(facncDetCli);
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
	
	
	public List<PymeFacncDetCli> getFacncDetClis() {
		return facncDetClis;
	}
	public void setFacncDetClis(List<PymeFacncDetCli> facncDetClis) {
		this.facncDetClis = facncDetClis;
	}
	public PymeFacncDetCli getFacncDetCli() {
		return facncDetCli;
	}
	public void setFacncDetCli(PymeFacncDetCli facncDetCli) {
		this.facncDetCli = facncDetCli;
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
