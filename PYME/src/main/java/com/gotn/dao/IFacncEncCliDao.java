package com.gotn.dao;

import java.util.List;
import com.gotn.model.PymeFacncEncCli;


//Elaborado por Juan Jara 25-07-2016 16:59

public interface IFacncEncCliDao {
	void guardarConsecutivo(PymeFacncEncCli entidad );
	void actualizarConsecutivo(PymeFacncEncCli entidad);
	void eliminarConsecutivo(PymeFacncEncCli entidad);
	PymeFacncEncCli getConsecutivo(Integer id);
	List<PymeFacncEncCli> getConsecutivos();
}
