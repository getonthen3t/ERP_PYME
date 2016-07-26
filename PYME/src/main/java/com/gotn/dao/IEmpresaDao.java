package com.gotn.dao;

import java.util.List;

import com.gotn.model.PymeEmpresa;


//Elaborado por Juan Jara 25-07-2016 16:59

public interface IEmpresaDao {
	void guardarEmpresa(PymeEmpresa entidad );
	void actualizarEmpresa(PymeEmpresa entidad);
	void eliminarEmpresa(PymeEmpresa entidad);
	PymeEmpresa getEmpresa(Integer id);
	List<PymeEmpresa> getEmpresas();
}
