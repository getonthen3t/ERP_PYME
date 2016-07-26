package com.gotn.dao;

import java.util.List;

import com.gotn.model.PymeNdEncCli;

//Elaborado por Juan Jara 25-07-2016 16:59

public interface INdEncCliDao {
	void guardarConsecutivo(PymeNdEncCli entidad );
	void actualizarConsecutivo(PymeNdEncCli entidad);
	void eliminarConsecutivo(PymeNdEncCli entidad);
	PymeNdEncCli getConsecutivo(Integer id);
	List<PymeNdEncCli> getConsecutivos();
}
