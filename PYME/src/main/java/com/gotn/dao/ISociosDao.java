package com.gotn.dao;

import java.util.List;

import com.gotn.model.PymeSocios;


//Elaborado por Juan Jara 25-07-2016 16:59

public interface ISociosDao {
	void guardarSocio(PymeSocios entidad );
	void actualizarSocio(PymeSocios entidad);
	void eliminarSocio(PymeSocios entidad);
	PymeSocios getSocio(Integer id);
	List<PymeSocios> getSocios();
}