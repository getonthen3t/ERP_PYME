package com.gotn.dao;

import java.util.List;

import com.gotn.model.PymeFacncDetProv;


//Elaborado por Juan Jara 25-07-2016 16:59

public interface IFacncDetProvDao {
	void guardarConsecutivo(PymeFacncDetProv entidad );
	void actualizarConsecutivo(PymeFacncDetProv entidad);
	void eliminarConsecutivo(PymeFacncDetProv entidad);
	PymeFacncDetProv getConsecutivo(Integer id);
	List<PymeFacncDetProv> getConsecutivos();
}