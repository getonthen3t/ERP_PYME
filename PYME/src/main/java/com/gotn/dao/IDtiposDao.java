package com.gotn.dao;

import java.util.List;

import com.gotn.model.PymeDtipos;


//Elaborado por Juan Jara 25-07-2016 16:59

public interface IDtiposDao {
	void guardarConsecutivo(PymeDtipos entidad );
	void actualizarConsecutivo(PymeDtipos entidad);
	void eliminarConsecutivo(PymeDtipos entidad);
	PymeDtipos getConsecutivo(Integer id);
	List<PymeDtipos> getConsecutivos();
}