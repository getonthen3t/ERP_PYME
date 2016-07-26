package com.gotn.dao;

import java.util.List;

import com.gotn.model.PymeNdDetCli;



//Elaborado por Juan Jara 25-07-2016 16:59

public interface INdDetCliDao {
	void guardarConsecutivo(PymeNdDetCli entidad );
	void actualizarConsecutivo(PymeNdDetCli entidad);
	void eliminarConsecutivo(PymeNdDetCli entidad);
	PymeNdDetCli getConsecutivo(Integer id);
	List<PymeNdDetCli> getConsecutivos();
}