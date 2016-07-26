package com.gotn.service;

import java.util.List;

import com.gotn.model.PymeNdDetCli;



public interface INdDetCliService {
	public boolean guardarNdDetCli(PymeNdDetCli pojo);
	public boolean actualizarNdDetCli(PymeNdDetCli pojo);
	public boolean eliminarNdDetCli(PymeNdDetCli pojo);
	public PymeNdDetCli getNdDetCli(int idMsalidas);
	public List<PymeNdDetCli> getNdDetClis();
}
