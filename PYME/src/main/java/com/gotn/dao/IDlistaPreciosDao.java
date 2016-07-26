package com.gotn.dao;
//Elaborado por Juan Jara 25-07-2016 16:59

import java.util.List;

import com.gotn.model.PymeDlistaPrecios;



public interface IDlistaPreciosDao {
	void guardarDlistaPrecios(PymeDlistaPrecios entidad );
	void actualizarDlistaPrecios(PymeDlistaPrecios entidad);
	void eliminarDlistaPrecios(PymeDlistaPrecios entidad);
	PymeDlistaPrecios getDlistaPrecio(Integer id);
	List<PymeDlistaPrecios> getDlistaPrecios();
}