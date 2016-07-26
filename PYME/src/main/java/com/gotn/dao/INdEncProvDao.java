package com.gotn.dao;

import java.util.List;

import com.gotn.model.PymeNdEncProv;

//Elaborado por Juan Jara 25-07-2016 16:59

public interface INdEncProvDao {
	void guardarNdEncProv(PymeNdEncProv entidad );
	void actualizarNdEncProv(PymeNdEncProv entidad);
	void eliminarNdEncProv(PymeNdEncProv entidad);
	PymeNdEncProv getNdEncProv(Integer id);
	List<PymeNdEncProv> getNdEncProvs();
}