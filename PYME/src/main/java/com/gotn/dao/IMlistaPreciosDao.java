package com.gotn.dao;

import java.util.List;

import com.gotn.model.PymeMlistaPrecios;


//Elaborado por Juan Jara 25-07-2016 16:59

public interface IMlistaPreciosDao {
	void guardarConsecutivo(PymeMlistaPrecios entidad );
	void actualizarConsecutivo(PymeMlistaPrecios entidad);
	void eliminarConsecutivo(PymeMlistaPrecios entidad);
	PymeMlistaPrecios getConsecutivo(Integer id);
	List<PymeMlistaPrecios> getConsecutivos();
}
