package com.gotn.service;

import java.util.List;

import com.gotn.model.PymeMentradas;


public interface IMentradasService {
	public boolean guardarMentradas(PymeMentradas pojo);
	public boolean actualizarMentradas(PymeMentradas pojo);
	public boolean eliminarMentradas(PymeMentradas pojo);
	public PymeMentradas getMentrada(int idEtapa);
	public List<PymeMentradas> getMentradas();
}
