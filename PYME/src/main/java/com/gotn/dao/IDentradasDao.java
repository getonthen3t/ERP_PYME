package com.gotn.dao;
//Elaborado por Juan Jara 25-07-2016 16:59

import java.util.List;
import com.gotn.model.PymeDentradas;


public interface IDentradasDao {

	void guardarConsecutivo(PymeDentradas entidad );
	void actualizarConsecutivo(PymeDentradas entidad);
	void eliminarConsecutivo(PymeDentradas entidad);
	PymeDentradas getConsecutivo(Integer id);
	List<PymeDentradas> getConsecutivos();
}
