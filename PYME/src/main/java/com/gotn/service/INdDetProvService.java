package com.gotn.service;

import java.util.List;

import com.gotn.model.PymeNdDetProv;



public interface INdDetProvService {
	public boolean guardarNdDetProv(PymeNdDetProv pojo);
	public boolean actualizarNdDetProv(PymeNdDetProv pojo);
	public boolean eliminarNdDetProv(PymeNdDetProv pojo);
	public PymeNdDetProv getNdDetProv(int idNdDetProv);
	public List<PymeNdDetProv> getNdDetProvs();
}
