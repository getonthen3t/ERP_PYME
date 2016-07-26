package com.gotn.dao;

import java.util.List;

import com.gotn.model.PymeProductos;


//Elaborado por Juan Jara 25-07-2016 16:59

public interface IProductosDao {
	void guardarProducto(PymeProductos entidad );
	void actualizarProducto(PymeProductos entidad);
	void eliminarProducto(PymeProductos entidad);
	PymeProductos getProducto(Integer id);
	List<PymeProductos> getProductos();
}