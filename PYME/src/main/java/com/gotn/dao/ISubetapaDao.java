package com.gotn.dao;

import java.util.List;

import com.gotn.model.PymeSubetapa;



//Elaborado por Juan Jara 25-07-2016 16:59

public interface ISubetapaDao {
	void guardarSubetapa(PymeSubetapa entidad );
	void actualizarSubetapa(PymeSubetapa entidad);
	void eliminarSubetapa(PymeSubetapa entidad);
	PymeSubetapa getSubetapa(Integer id);
	List<PymeSubetapa> getSubetapas();
}