package com.gotn.controller;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.gotn.model.PymeTipoCambio;
import com.gotn.service.ITipoCambioService;

import oracle.sql.DATE;




/*Creado por jjara 2016-07-26*/
@Component
@Scope("session")
@ManagedBean
public class TipoCambioBean implements Serializable {
	
	public TipoCambioBean() {
		super();
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private ITipoCambioService tipoCambioService;
	
	private List<PymeTipoCambio> tipoCambios;
	private PymeTipoCambio tipoCambio;
	private int accion;
	private String etiquetaBoton;
	private boolean habilitado;
	
	public void consultaListado(){
		tipoCambios = tipoCambioService.getTipoCambios();	
	}
	
	
	/* 1-guardar
	 * 2-actualizar
	 * 3-eliminar
	 * 4-consultar
	 * */
	/* Metodos de acciones CRUD*/
	public void agregar() throws ParseException{
		tipoCambio = new PymeTipoCambio();
		tipoCambio.setTcCompra(10000.222);
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
		String dateInString = "7-Jun-2013";
		Date date = formatter.parse(dateInString);
		tipoCambio.setTcFecha(date);
		etiquetaBoton = "Guardar";
		accion = 1;
		habilitado = true;//es para saber si habilitamos los campos de captura del formulario.
		guardarTipoCambio();
	}
	public void actualizar(PymeTipoCambio pojo){
		tipoCambio = pojo;
		etiquetaBoton = "Actualizar";
		accion = 2;
		habilitado = true;
	}
	public void eliminar(PymeTipoCambio pojo){
		tipoCambio = pojo;
		etiquetaBoton = "Eliminar";
		accion = 3;
		habilitado = true;
	}
	public void consultar(PymeTipoCambio pojo){
		tipoCambio = pojo;
		etiquetaBoton = "Cerrar";
		accion = 4;
		habilitado = false;
	}
	
	
	public void guardarTipoCambio(){
		boolean result = false;
		switch (accion) {
		case 1:
			result = tipoCambioService.guardarTipoCambio(tipoCambio);
			if (result) {
				System.out.println("Registro Exitoso");
			} else {
				System.out.println("Registro Fallido");
			}
			break;
		case 2:
			result = tipoCambioService.actualizarTipoCambio(tipoCambio);
			if (result) {
				System.out.println("Registro Exitoso");
			} else {
				System.out.println("Registro Fallido");
			}
			break;
		case 3:
			result = tipoCambioService.eliminarTipoCambio(tipoCambio);
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
	
	
	
	public List<PymeTipoCambio> getTipoCambios() {
		return tipoCambios;
	}
	public void setTipoCambios(List<PymeTipoCambio> tipoCambios) {
		this.tipoCambios = tipoCambios;
	}
	public PymeTipoCambio getTipoCambio() {
		return tipoCambio;
	}
	public void setTipoCambio(PymeTipoCambio tipoCambio) {
		this.tipoCambio = tipoCambio;
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
