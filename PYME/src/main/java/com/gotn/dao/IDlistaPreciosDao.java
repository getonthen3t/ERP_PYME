package com.gotn.dao;
//Elaborado por Juan Jara 25-07-2016 16:59

import java.util.List;

import com.gotn.model.PymeDlistaPrecios;



public interface IDlistaPreciosDao {
	void guardarConsecutivo(PymeDlistaPrecios entidad );
	void actualizarConsecutivo(PymeDlistaPrecios entidad);
	void eliminarConsecutivo(PymeDlistaPrecios entidad);
	PymeDlistaPrecios getConsecutivo(Integer id);
	List<PymeDlistaPrecios> getConsecutivos();
}