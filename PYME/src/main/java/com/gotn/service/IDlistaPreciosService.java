package com.gotn.service;

import java.util.List;

import com.gotn.model.PymeDlistaPrecios;

/*Creado por: jjara 2016-07-25*/
public interface IDlistaPreciosService {
	public boolean guardarlistaPrecios(PymeDlistaPrecios pojo);
	public boolean actualizarlistaPrecios(PymeDlistaPrecios pojo);
	public boolean eliminarlistaPrecios(PymeDlistaPrecios pojo);
	public PymeDlistaPrecios getlistaPrecio(int idListaPrecios);
	public List<PymeDlistaPrecios> getlistaPrecios();
}
