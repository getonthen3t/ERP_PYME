package com.gotn.dao;

import java.util.List;

import com.gotn.model.PymeNdEncCli;

//Elaborado por Juan Jara 25-07-2016 16:59

public interface INdEncCliDao {
	void guardarNdEncCli(PymeNdEncCli entidad );
	void actualizarNdEncCli(PymeNdEncCli entidad);
	void eliminarNdEncCli(PymeNdEncCli entidad);
	PymeNdEncCli getNdEncCli(Integer id);
	List<PymeNdEncCli> getNdEncClis();
}
