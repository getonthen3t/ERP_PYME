package com.gotn.dao;

import java.util.List;

import com.gotn.model.PymeSubetapa;



//Elaborado por Juan Jara 25-07-2016 16:59

public interface ISubetapaDao {
	void guardarConsecutivo(PymeSubetapa entidad );
	void actualizarConsecutivo(PymeSubetapa entidad);
	void eliminarConsecutivo(PymeSubetapa entidad);
	PymeSubetapa getConsecutivo(Integer id);
	List<PymeSubetapa> getConsecutivos();
}