package com.gotn.dao;

import java.util.List;

import com.gotn.model.PymeProductos;


//Elaborado por Juan Jara 25-07-2016 16:59

public interface IProductosDao {
	void guardarConsecutivo(PymeProductos entidad );
	void actualizarConsecutivo(PymeProductos entidad);
	void eliminarConsecutivo(PymeProductos entidad);
	PymeProductos getConsecutivo(Integer id);
	List<PymeProductos> getConsecutivos();
}