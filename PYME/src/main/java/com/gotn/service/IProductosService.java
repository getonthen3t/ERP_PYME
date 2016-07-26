package com.gotn.service;

import java.util.List;

import com.gotn.model.PymeProductos;

public interface IProductosService {
	public boolean guardarProducto(PymeProductos pojo);
	public boolean actualizarProducto(PymeProductos pojo);
	public boolean eliminarProducto(PymeProductos pojo);
	public PymeProductos getProducto(int idProducto);
	public List<PymeProductos> getProductos();
}
