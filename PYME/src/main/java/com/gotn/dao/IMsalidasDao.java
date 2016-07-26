package com.gotn.dao;

import java.util.List;

import com.gotn.model.PymeMsalidas;



//Elaborado por Juan Jara 25-07-2016 16:59

public interface IMsalidasDao {
	void guardarConsecutivo(PymeMsalidas entidad );
	void actualizarConsecutivo(PymeMsalidas entidad);
	void eliminarConsecutivo(PymeMsalidas entidad);
	PymeMsalidas getConsecutivo(Integer id);
	List<PymeMsalidas> getConsecutivos();
}