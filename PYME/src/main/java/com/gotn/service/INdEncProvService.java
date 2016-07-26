package com.gotn.service;

import java.util.List;

import com.gotn.model.PymeNdEncProv;

public interface INdEncProvService {
	public boolean guardarNdEncProv(PymeNdEncProv pojo);
	public boolean actualizarNdEncProv(PymeNdEncProv pojo);
	public boolean eliminarNdEncProv(PymeNdEncProv pojo);
	public PymeNdEncProv getNdEncProv(int idNdEncProv);
	public List<PymeNdEncProv> getNdEncProvs();
}
