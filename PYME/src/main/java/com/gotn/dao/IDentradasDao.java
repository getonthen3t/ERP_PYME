package com.gotn.dao;
//Elaborado por Juan Jara 25-07-2016 16:59

import java.util.List;
import com.gotn.model.PymeDentradas;


public interface IDentradasDao {

	void guardarDentradas(PymeDentradas entidad );
	void actualizarDentradas(PymeDentradas entidad);
	void eliminarDentradas(PymeDentradas entidad);
	PymeDentradas getDentrada(Integer id);
	List<PymeDentradas> getDentradas();
}
