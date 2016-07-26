package com.gotn.dao;

import java.util.List;

import com.gotn.model.PymeMsalidas;



//Elaborado por Juan Jara 25-07-2016 16:59

public interface IMsalidasDao {
	void guardarMsalidas(PymeMsalidas entidad );
	void actualizarMsalidas(PymeMsalidas entidad);
	void eliminarMsalidas(PymeMsalidas entidad);
	PymeMsalidas getMsalida(Integer id);
	List<PymeMsalidas> getMsalidas();
}