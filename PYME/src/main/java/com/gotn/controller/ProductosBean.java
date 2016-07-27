package com.gotn.controller;

import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.gotn.model.PymeProductos;
import com.gotn.service.IProductosService;



/*Creado por jjara 2016-07-26*/
@Component
public class ProductosBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private IProductosService productosService;
	

	private List<PymeProductos> productos;
	private PymeProductos producto;
	private int accion;
	private String etiquetaBoton;
	private boolean habilitado;
	
	
	public void consultaListado(){
		productos = productosService.getProductos();	
	}
	
	/* 1-guardar
	 * 2-actualizar
	 * 3-eliminar
	 * 4-consultar
	 * */
	/* Metodos de acciones CRUD*/
	public void agregar(){
		producto = new PymeProductos();
		etiquetaBoton = "Guardar";
		accion = 1;
		habilitado = true;//es para saber si habilitamos los campos de captura del formulario.
	}
	public void actualizar(PymeProductos pojo){
		producto = pojo;
		etiquetaBoton = "Actualizar";
		accion = 2;
		habilitado = true;
	}
	public void eliminar(PymeProductos pojo){
		producto = pojo;
		etiquetaBoton = "Eliminar";
		accion = 3;
		habilitado = true;
	}
	public void consultar(PymeProductos pojo){
		producto = pojo;
		etiquetaBoton = "Cerrar";
		accion = 4;
		habilitado = false;
	}
	
	
	public void guardarProductos(){
		boolean result = false;
		switch (accion) {
		case 1:
			result = productosService.guardarProducto(producto);
			if (result) {
				System.out.println("Registro Exitoso");
			} else {
				System.out.println("Registro Fallido");
			}
			break;
		case 2:
			result = productosService.actualizarProducto(producto);
			if (result) {
				System.out.println("Registro Exitoso");
			} else {
				System.out.println("Registro Fallido");
			}
			break;
		case 3:
			result = productosService.eliminarProducto(producto);
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
	
	
	public List<PymeProductos> getProductos() {
		return productos;
	}
	public void setProductos(List<PymeProductos> productos) {
		this.productos = productos;
	}
	public PymeProductos getProducto() {
		return producto;
	}
	public void setProducto(PymeProductos producto) {
		this.producto = producto;
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
