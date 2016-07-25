package com.gotn.dao;

import java.util.List;

import com.gotn.model.PymeConsecutivos;

public interface IConsecutivoDao {

	void guardarConsecutivo(PymeConsecutivos entidad );
	void actualizarConsecutivo(PymeConsecutivos entidad);
	void eliminarConsecutivo(PymeConsecutivos entidad);
	PymeConsecutivos getConsecutivo(Integer id);
	List<PymeConsecutivos> getConsecutivos();
}
