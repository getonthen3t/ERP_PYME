package com.gotn.dao;

import java.util.List;

import com.gotn.model.PymeMtipos;



//Elaborado por Juan Jara 25-07-2016 16:59

public interface IMtiposDao {
	void guardarConsecutivo(PymeMtipos entidad );
	void actualizarConsecutivo(PymeMtipos entidad);
	void eliminarConsecutivo(PymeMtipos entidad);
	PymeMtipos getConsecutivo(Integer id);
	List<PymeMtipos> getConsecutivos();
}