package com.gotn.dao;

import java.util.List;

import com.gotn.model.PymeSocios;


//Elaborado por Juan Jara 25-07-2016 16:59

public interface ISociosDao {
	void guardarConsecutivo(PymeSocios entidad );
	void actualizarConsecutivo(PymeSocios entidad);
	void eliminarConsecutivo(PymeSocios entidad);
	PymeSocios getConsecutivo(Integer id);
	List<PymeSocios> getConsecutivos();
}