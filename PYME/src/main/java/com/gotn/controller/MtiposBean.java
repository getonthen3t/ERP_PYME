package com.gotn.controller;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.gotn.model.PymeMtipos;
import com.gotn.service.IMtiposService;




/*Creado por jjara 2016-07-26*/
@Component
public class MtiposBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private IMtiposService mtiposService;
	
	private List<PymeMtipos> mtipos;
	private PymeMtipos mtipo;
	private int accion;
	private String etiquetaBoton;
	private boolean habilitado;
	
	public void consultaListado(){
		mtipos = mtiposService.getMtipos();	
	}
	
	/* 1-guardar
	 * 2-actualizar
	 * 3-eliminar
	 * 4-consultar
	 * */
	/* Metodos de acciones CRUD*/
	public void agregar(){
		mtipo = new PymeMtipos();
		etiquetaBoton = "Guardar";
		accion = 1;
		habilitado = true;//es para saber si habilitamos los campos de captura del formulario.
	}
	public void actualizar(PymeMtipos pojo){
		mtipo = pojo;
		etiquetaBoton = "Actualizar";
		accion = 2;
		habilitado = true;
	}
	public void eliminar(PymeMtipos pojo){
		mtipo = pojo;
		etiquetaBoton = "Eliminar";
		accion = 3;
		habilitado = true;
	}
	public void consultar(PymeMtipos pojo){
		mtipo = pojo;
		etiquetaBoton = "Cerrar";
		accion = 4;
		habilitado = false;
	}
	
	
	public void guardarMtipos(){
		boolean result = false;
		switch (accion) {
		case 1:
			result = mtiposService.guardarMtipos(mtipo);
			if (result) {
				System.out.println("Registro Exitoso");
			} else {
				System.out.println("Registro Fallido");
			}
			break;
		case 2:
			result = mtiposService.actualizarMtipos(mtipo);
			if (result) {
				System.out.println("Registro Exitoso");
			} else {
				System.out.println("Registro Fallido");
			}
			break;
		case 3:
			result = mtiposService.eliminarMtipos(mtipo);
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
	
	
	
	public List<PymeMtipos> getMtipos() {
		return mtipos;
	}
	public void setMtipos(List<PymeMtipos> mtipos) {
		this.mtipos = mtipos;
	}
	public PymeMtipos getMtipo() {
		return mtipo;
	}
	public void setMtipo(PymeMtipos mtipo) {
		this.mtipo = mtipo;
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
