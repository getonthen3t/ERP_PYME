package com.gotn.service;

import java.util.List;

import com.gotn.model.PymeMsalidas;

public interface IMsalidasService {
	public boolean guardarMsalidas(PymeMsalidas pojo);
	public boolean actualizarMsalidas(PymeMsalidas pojo);
	public boolean eliminarMsalidas(PymeMsalidas pojo);
	public PymeMsalidas getMsalida(int idMsalidas);
	public List<PymeMsalidas> getMsalidas();
}
