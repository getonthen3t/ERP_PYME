package com.gotn.service;

import java.util.List;

import com.gotn.model.PymeNdEncCli;

public interface INdEncCliService {
	public boolean guardarNdEncCli(PymeNdEncCli pojo);
	public boolean actualizarNdEncCli(PymeNdEncCli pojo);
	public boolean eliminarNdEncCli(PymeNdEncCli pojo);
	public PymeNdEncCli getNdEncCli(int idNdEncCli);
	public List<PymeNdEncCli> getNdEncClis();
}
