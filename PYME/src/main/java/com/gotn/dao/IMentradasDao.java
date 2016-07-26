package com.gotn.dao;

import java.util.List;

import com.gotn.model.PymeMentradas;

//Elaborado por Juan Jara 25-07-2016 16:59

public interface IMentradasDao {
	void guardarMentradas(PymeMentradas entidad );
	void actualizarMentradas(PymeMentradas entidad);
	void eliminarMentradas(PymeMentradas entidad);
	PymeMentradas getMentrada(Integer id);
	List<PymeMentradas> getMentradas();
}