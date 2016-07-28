package com.gotn.controller;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.gotn.model.PymeEmpresa;
import com.gotn.service.IEmpresaService;


/*Creado por jjara 2016-07-26*/
@Component
@Scope("session")
public class EmpresaBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private IEmpresaService empresaService;
	

	private List<PymeEmpresa> empresas;
	private PymeEmpresa empresa;
	private int accion;
	private String etiquetaBoton;
	private boolean habilitado;
	
	public void consultaListado(){
		empresas = empresaService.getEmpresas();	
	}
	

	/* 1-guardar
	 * 2-actualizar
	 * 3-eliminar
	 * 4-consultar
	 * */
	/* Metodos de acciones CRUD*/
	public void agregar(){
		empresa = new PymeEmpresa();
		etiquetaBoton = "Guardar";
		accion = 1;
		habilitado = true;//es para saber si habilitamos los campos de captura del formulario.
	}
	public void actualizar(PymeEmpresa pojo){
		empresa = pojo;
		etiquetaBoton = "Actualizar";
		accion = 2;
		habilitado = true;
	}
	public void eliminar(PymeEmpresa pojo){
		empresa = pojo;
		etiquetaBoton = "Eliminar";
		accion = 3;
		habilitado = true;
	}
	public void consultar(PymeEmpresa pojo){
		empresa = pojo;
		etiquetaBoton = "Cerrar";
		accion = 4;
		habilitado = false;
	}
	
	public void guardarEmpresa(){
		boolean result = false;
		switch (accion) {
		case 1:
			result = empresaService.guardarEmpresa(empresa);
			if (result) {
				System.out.println("Registro Exitoso");
			} else {
				System.out.println("Registro Fallido");
			}
			break;
		case 2:
			result = empresaService.actualizarEmpresa(empresa);
			if (result) {
				System.out.println("Registro Exitoso");
			} else {
				System.out.println("Registro Fallido");
			}
			break;
		case 3:
			result = empresaService.eliminarEmpresa(empresa);
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


	public List<PymeEmpresa> getEmpresas() {
		return empresas;
	}


	public void setEmpresas(List<PymeEmpresa> empresas) {
		this.empresas = empresas;
	}


	public PymeEmpresa getEmpresa() {
		return empresa;
	}


	public void setEmpresa(PymeEmpresa empresa) {
		this.empresa = empresa;
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
