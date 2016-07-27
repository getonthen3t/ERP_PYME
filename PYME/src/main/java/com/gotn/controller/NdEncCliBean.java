package com.gotn.controller;

import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.gotn.model.PymeNdEncCli;
import com.gotn.service.INdEncCliService;



/*Creado por jjara 2016-07-26*/
@Component
public class NdEncCliBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private INdEncCliService ndEncCliService;
	
	private List<PymeNdEncCli> ndEncClis;
	private PymeNdEncCli ndEncCli;
	private int accion;
	private String etiquetaBoton;
	private boolean habilitado;
	
	public void consultaListado(){
		ndEncClis = ndEncCliService.getNdEncClis();	
	}
	
	/* 1-guardar
	 * 2-actualizar
	 * 3-eliminar
	 * 4-consultar
	 * */
	/* Metodos de acciones CRUD*/
	public void agregar(){
		ndEncCli = new PymeNdEncCli();
		etiquetaBoton = "Guardar";
		accion = 1;
		habilitado = true;//es para saber si habilitamos los campos de captura del formulario.
	}
	public void actualizar(PymeNdEncCli pojo){
		ndEncCli = pojo;
		etiquetaBoton = "Actualizar";
		accion = 2;
		habilitado = true;
	}
	public void eliminar(PymeNdEncCli pojo){
		ndEncCli = pojo;
		etiquetaBoton = "Eliminar";
		accion = 3;
		habilitado = true;
	}
	public void consultar(PymeNdEncCli pojo){
		ndEncCli = pojo;
		etiquetaBoton = "Cerrar";
		accion = 4;
		habilitado = false;
	}
	
	
	public void guardarNdEncCli(){
		boolean result = false;
		switch (accion) {
		case 1:
			result = ndEncCliService.guardarNdEncCli(ndEncCli);
			if (result) {
				System.out.println("Registro Exitoso");
			} else {
				System.out.println("Registro Fallido");
			}
			break;
		case 2:
			result = ndEncCliService.actualizarNdEncCli(ndEncCli);
			if (result) {
				System.out.println("Registro Exitoso");
			} else {
				System.out.println("Registro Fallido");
			}
			break;
		case 3:
			result = ndEncCliService.eliminarNdEncCli(ndEncCli);
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
	
	
	
	public List<PymeNdEncCli> getNdEncClis() {
		return ndEncClis;
	}
	public void setNdEncClis(List<PymeNdEncCli> ndEncClis) {
		this.ndEncClis = ndEncClis;
	}
	public PymeNdEncCli getNdEncCli() {
		return ndEncCli;
	}
	public void setNdEncCli(PymeNdEncCli ndEncCli) {
		this.ndEncCli = ndEncCli;
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
