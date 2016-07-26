package com.gotn.dao;

import java.util.List;

import com.gotn.model.PymeFacncEncProv;

//Elaborado por Juan Jara 25-07-2016 16:59

public interface IFacncEncProvDao {
	void guardarFacncEncProv(PymeFacncEncProv entidad );
	void actualizarFacncEncProv(PymeFacncEncProv entidad);
	void eliminarFacncEncProv(PymeFacncEncProv entidad);
	PymeFacncEncProv getFacncEncProv(Integer id);
	List<PymeFacncEncProv> getFacncEncProvs();
}
