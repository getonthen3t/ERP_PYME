package com.gotn.dao;

import java.util.List;

import com.gotn.model.PymeNdEncProv;

//Elaborado por Juan Jara 25-07-2016 16:59

public interface INdEncProvDao {
	void guardarConsecutivo(PymeNdEncProv entidad );
	void actualizarConsecutivo(PymeNdEncProv entidad);
	void eliminarConsecutivo(PymeNdEncProv entidad);
	PymeNdEncProv getConsecutivo(Integer id);
	List<PymeNdEncProv> getConsecutivos();
}