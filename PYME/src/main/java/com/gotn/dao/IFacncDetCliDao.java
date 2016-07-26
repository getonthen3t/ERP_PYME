package com.gotn.dao;

import java.util.List;

import com.gotn.model.PymeFacncDetCli;


//Elaborado por Juan Jara 25-07-2016 16:59

public interface IFacncDetCliDao {
	void guardarFacncDetCli(PymeFacncDetCli entidad );
	void actualizarFacncDetCli(PymeFacncDetCli entidad);
	void eliminarFacncDetCli(PymeFacncDetCli entidad);
	PymeFacncDetCli getFacncDetCli(Integer id);
	List<PymeFacncDetCli> getFacncDetClis();
}