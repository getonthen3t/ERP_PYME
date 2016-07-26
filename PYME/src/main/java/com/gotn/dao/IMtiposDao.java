package com.gotn.dao;

import java.util.List;

import com.gotn.model.PymeMtipos;



//Elaborado por Juan Jara 25-07-2016 16:59

public interface IMtiposDao {
	void guardarMtipos(PymeMtipos entidad );
	void actualizarMtipos(PymeMtipos entidad);
	void eliminarMtipos(PymeMtipos entidad);
	PymeMtipos getMtipo(Integer id);
	List<PymeMtipos> getMtipos();
}