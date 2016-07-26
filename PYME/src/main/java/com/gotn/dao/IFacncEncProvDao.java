package com.gotn.dao;

import java.util.List;

import com.gotn.model.PymeFacncEncProv;

//Elaborado por Juan Jara 25-07-2016 16:59

public interface IFacncEncProvDao {
	void guardarConsecutivo(PymeFacncEncProv entidad );
	void actualizarConsecutivo(PymeFacncEncProv entidad);
	void eliminarConsecutivo(PymeFacncEncProv entidad);
	PymeFacncEncProv getConsecutivo(Integer id);
	List<PymeFacncEncProv> getConsecutivos();
}
