package com.gotn.service;

import java.util.List;

import com.gotn.model.PymeNdEncProv;

public interface INdEncProvService {
	public boolean guardarNdEncProv(INdEncProvService pojo);
	public boolean actualizarNdEncProv(INdEncProvService pojo);
	public boolean eliminarNdEncProv(INdEncProvService pojo);
	public INdEncProvService getNdEncProv(int idNdEncProv);
	public List<INdEncProvService> getNdEncProvs();
}
