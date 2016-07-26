package com.gotn.dao;

import java.util.List;

import com.gotn.model.PymeNdDetProv;



//Elaborado por Juan Jara 25-07-2016 16:59

public interface INdDetProvDao {
	void guardarNdDetProv(PymeNdDetProv entidad );
	void actualizarNdDetProv(PymeNdDetProv entidad);
	void eliminarNdDetProv(PymeNdDetProv entidad);
	PymeNdDetProv getNdDetProv(Integer id);
	List<PymeNdDetProv> getNdDetProvs();
}