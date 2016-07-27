package com.gotn.service;

import java.util.List;

import com.gotn.model.PymeMlistaPrecios;



public interface IMlistaPreciosService {
	public boolean guardarMlistaPrecios(PymeMlistaPrecios pojo);
	public boolean actualizarMlistaPrecios(PymeMlistaPrecios pojo);
	public boolean eliminarMlistaPrecios(PymeMlistaPrecios pojo);
	public PymeMlistaPrecios getMlistaPrecio(int idMlistaPrecios);
	public List<PymeMlistaPrecios> getMlistaPrecios();
}
