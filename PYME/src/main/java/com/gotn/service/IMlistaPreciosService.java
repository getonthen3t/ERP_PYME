package com.gotn.service;

import java.util.List;

import com.gotn.model.PymeMlistaPrecios;



public interface IMlistaPreciosService {
	public boolean guardarMentradas(PymeMlistaPrecios pojo);
	public boolean actualizarMentradas(PymeMlistaPrecios pojo);
	public boolean eliminarMentradas(PymeMlistaPrecios pojo);
	public PymeMlistaPrecios getMentrada(int idMlistaPrecios);
	public List<PymeMlistaPrecios> getMentradas();
}
