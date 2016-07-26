package com.gotn.dao;

import java.util.List;

import com.gotn.model.PymeEmpresa;


//Elaborado por Juan Jara 25-07-2016 16:59

public interface IEmpresaDao {
	void guardarConsecutivo(PymeEmpresa entidad );
	void actualizarConsecutivo(PymeEmpresa entidad);
	void eliminarConsecutivo(PymeEmpresa entidad);
	PymeEmpresa getConsecutivo(Integer id);
	List<PymeEmpresa> getConsecutivos();
}
