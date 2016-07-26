package com.gotn.dao;

import java.util.List;

import com.gotn.model.PymeMlistaPrecios;


//Elaborado por Juan Jara 25-07-2016 16:59

public interface IMlistaPreciosDao {
	void guardarMlistaPrecios(PymeMlistaPrecios entidad );
	void actualizarMlistaPrecios(PymeMlistaPrecios entidad);
	void eliminarMlistaPrecios(PymeMlistaPrecios entidad);
	PymeMlistaPrecios getMlistaPrecios(Integer id);
	List<PymeMlistaPrecios> getMlistaPrecios();
}
