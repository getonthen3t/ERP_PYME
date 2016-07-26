package com.gotn.dao;

import java.util.List;
import com.gotn.model.PymeFacncEncCli;


//Elaborado por Juan Jara 25-07-2016 16:59

public interface IFacncEncCliDao {
	void guardarFacncEncCli(PymeFacncEncCli entidad );
	void actualizarFacncEncCli(PymeFacncEncCli entidad);
	void eliminarFacncEncCli(PymeFacncEncCli entidad);
	PymeFacncEncCli getFacncEncCli(Integer id);
	List<PymeFacncEncCli> getFacncEncClis();
}
