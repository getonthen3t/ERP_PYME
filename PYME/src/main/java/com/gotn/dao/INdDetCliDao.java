package com.gotn.dao;

import java.util.List;

import com.gotn.model.PymeNdDetCli;



//Elaborado por Juan Jara 25-07-2016 16:59

public interface INdDetCliDao {
	void guardarNdDetCli(PymeNdDetCli entidad );
	void actualizarNdDetCli(PymeNdDetCli entidad);
	void eliminarNdDetCli(PymeNdDetCli entidad);
	PymeNdDetCli getNdDetCli(Integer id);
	List<PymeNdDetCli> getNdDetClis();
}