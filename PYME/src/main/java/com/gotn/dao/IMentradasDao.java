package com.gotn.dao;

import java.util.List;

import com.gotn.model.PymeMentradas;

//Elaborado por Juan Jara 25-07-2016 16:59

public interface IMentradasDao {
	void guardarConsecutivo(PymeMentradas entidad );
	void actualizarConsecutivo(PymeMentradas entidad);
	void eliminarConsecutivo(PymeMentradas entidad);
	PymeMentradas getConsecutivo(Integer id);
	List<PymeMentradas> getConsecutivos();
}