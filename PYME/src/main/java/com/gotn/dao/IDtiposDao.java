package com.gotn.dao;

import java.util.List;

import com.gotn.model.PymeDtipos;


//Elaborado por Juan Jara 25-07-2016 16:59

public interface IDtiposDao {
	void guardarDtipos(PymeDtipos entidad );
	void actualizarDtipos(PymeDtipos entidad);
	void eliminarDtipos(PymeDtipos entidad);
	PymeDtipos getDtipo(Integer id);
	List<PymeDtipos> getDtipos();
}