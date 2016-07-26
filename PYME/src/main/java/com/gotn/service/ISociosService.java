package com.gotn.service;

import java.util.List;

import com.gotn.model.PymeSocios;

public interface ISociosService {
	public boolean guardarSocio(PymeSocios pojo);
	public boolean actualizarSocio(PymeSocios pojo);
	public boolean eliminarSocio(PymeSocios pojo);
	public PymeSocios getSocio(int idSocio);
	public List<PymeSocios> getSocios();	
}
