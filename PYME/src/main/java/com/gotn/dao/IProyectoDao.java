package com.gotn.dao;

import java.util.List;

import com.gotn.model.PymeProyecto;



//Elaborado por Juan Jara 25-07-2016 16:59

public interface IProyectoDao {
	void guardarConsecutivo(PymeProyecto entidad );
	void actualizarConsecutivo(PymeProyecto entidad);
	void eliminarConsecutivo(PymeProyecto entidad);
	PymeProyecto getConsecutivo(Integer id);
	List<PymeProyecto> getConsecutivos();
}
