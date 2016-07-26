package com.gotn.service;

import java.util.List;

import com.gotn.model.PymeMtipos;



public interface IMtiposService {
	public boolean guardarMtipos(PymeMtipos pojo);
	public boolean actualizarMtipos(PymeMtipos pojo);
	public boolean eliminarMtipos(PymeMtipos pojo);
	public PymeMtipos getMtipo(int idMsalidas);
	public List<PymeMtipos> getMtipos();
}
