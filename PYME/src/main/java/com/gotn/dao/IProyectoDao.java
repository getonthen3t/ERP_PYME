package com.gotn.dao;

import java.util.List;

import com.gotn.model.PymeProyecto;



//Elaborado por Juan Jara 25-07-2016 16:59

public interface IProyectoDao {
	void guardarProyecto(PymeProyecto entidad );
	void actualizarProyecto(PymeProyecto entidad);
	void eliminarProyecto(PymeProyecto entidad);
	PymeProyecto getProyecto(Integer id);
	List<PymeProyecto> getProyectos();
}
