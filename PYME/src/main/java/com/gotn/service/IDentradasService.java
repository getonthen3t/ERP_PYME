package com.gotn.service;

import java.util.List;

import com.gotn.model.PymeDentradas;

/*Creado por: jjara 2016-07-25*/
public interface IDentradasService {
	public boolean guardarDentradas(PymeDentradas pojo);
	public boolean actualizarDentradas(PymeDentradas pojo);
	public boolean eliminarDentradas(PymeDentradas pojo);
	public PymeDentradas getDentrada(int idDentradas);
	public List<PymeDentradas> getDentradas();
}

