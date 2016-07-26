package com.gotn.dao;
//Elaborado por Juan Jara 25-07-2016 16:59

import java.util.List;
import com.gotn.model.PymeDsalidas;


public interface IDsalidasDao {
	void guardarConsecutivo(PymeDsalidas entidad );
	void actualizarConsecutivo(PymeDsalidas entidad);
	void eliminarConsecutivo(PymeDsalidas entidad);
	PymeDsalidas getConsecutivo(Integer id);
	List<PymeDsalidas> getConsecutivos();
}
