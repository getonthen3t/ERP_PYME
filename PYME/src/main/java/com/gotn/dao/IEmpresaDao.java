package com.gotn.dao;

import java.util.List;

import com.gotn.model.PymeEmpresa;


//Elaborado por Juan Jara 25-07-2016 16:59

public interface IEmpresaDao {
	void guardarEmpresaDao(PymeEmpresa entidad );
	void actualizarEmpresaDao(PymeEmpresa entidad);
	void eliminarEmpresaDao(PymeEmpresa entidad);
	PymeEmpresa getEmpresaDao(Integer id);
	List<PymeEmpresa> getEmpresaDao();
}
