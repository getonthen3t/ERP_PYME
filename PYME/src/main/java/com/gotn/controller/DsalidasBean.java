package com.gotn.controller;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.gotn.model.PymeDsalidas;
import com.gotn.service.IDsalidasService;


/*Creado por jjara 2016-07-26*/
@Component
@Scope("session")
public class DsalidasBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private IDsalidasService dsalidasService;
	
	private List<PymeDsalidas> dsalidas;
	private PymeDsalidas dsalida;
	private int accion;
	private String etiquetaBoton;
	private boolean habilitado;
	
	public void consultaListado(){
		dsalidas = dsalidasService.getDsalidas();
	}
	
	/* 1-guardar
	 * 2-actualizar
	 * 3-eliminar
	 * 4-consultar
	 * */
	/* Metodos de acciones CRUD*/
	
	public void agregar(){
		dsalida = new PymeDsalidas();
		etiquetaBoton = "Guardar";
		accion = 1;
		habilitado = true;//es para saber si habilitamos los campos de captura del formulario.
	}
	public void actualizar(PymeDsalidas pojo){
		dsalida = pojo;
		etiquetaBoton = "Actualizar";
		accion = 2;
		habilitado = true;
	}
	public void eliminar(PymeDsalidas pojo){
		dsalida = pojo;
		etiquetaBoton = "Eliminar";
		accion = 3;
		habilitado = true;
	}
	public void consultar(PymeDsalidas pojo){
		dsalida = pojo;
		etiquetaBoton = "Cerrar";
		accion = 4;
		habilitado = false;
	}
	
	
	public void guardarDsalidas(){
		boolean result = false;
		switch (accion) {
		case 1:
			result = dsalidasService.guardarDsalidas(dsalida);
			if (result) {
				System.out.println("Registro Exitoso");
			} else {
				System.out.println("Registro Fallido");
			}
			break;
		case 2:
			result = dsalidasService.actualizarDsalidas(dsalida);
			if (result) {
				System.out.println("Registro Exitoso");
			} else {
				System.out.println("Registro Fallido");
			}
			break;
		case 3:
			result = dsalidasService.eliminarDsalidas(dsalida);
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
	
	
	public List<PymeDsalidas> getDsalidas() {
		return dsalidas;
	}
	public void setDsalidas(List<PymeDsalidas> dsalidas) {
		this.dsalidas = dsalidas;
	}
	public PymeDsalidas getDsalida() {
		return dsalida;
	}
	public void setDsalida(PymeDsalidas dsalida) {
		this.dsalida = dsalida;
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
