package com.gotn.dao;

import java.util.List;

import com.gotn.model.PymeFacncDetProv;


//Elaborado por Juan Jara 25-07-2016 16:59

public interface IFacncDetProvDao {
	void guardarFacncDetProv(PymeFacncDetProv entidad );
	void actualizarFacncDetProv(PymeFacncDetProv entidad);
	void eliminarFacncDetProv(PymeFacncDetProv entidad);
	PymeFacncDetProv getFacncDetProv(Integer id);
	List<PymeFacncDetProv> getFacncDetProvs();
}