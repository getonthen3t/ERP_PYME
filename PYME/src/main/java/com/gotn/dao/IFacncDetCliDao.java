package com.gotn.dao;

import java.util.List;

import com.gotn.model.PymeFacncDetCli;


//Elaborado por Juan Jara 25-07-2016 16:59

public interface IFacncDetCliDao {
	void guardarConsecutivo(PymeFacncDetCli entidad );
	void actualizarConsecutivo(PymeFacncDetCli entidad);
	void eliminarConsecutivo(PymeFacncDetCli entidad);
	PymeFacncDetCli getConsecutivo(Integer id);
	List<PymeFacncDetCli> getConsecutivos();
}