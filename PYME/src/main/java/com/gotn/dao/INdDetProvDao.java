package com.gotn.dao;

import java.util.List;

import com.gotn.model.PymeNdDetProv;



//Elaborado por Juan Jara 25-07-2016 16:59

public interface INdDetProvDao {
	void guardarConsecutivo(PymeNdDetProv entidad );
	void actualizarConsecutivo(PymeNdDetProv entidad);
	void eliminarConsecutivo(PymeNdDetProv entidad);
	PymeNdDetProv getConsecutivo(Integer id);
	List<PymeNdDetProv> getConsecutivos();
}