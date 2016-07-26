package com.gotn.dao;
//Elaborado por Juan Jara 25-07-2016 16:59

import java.util.List;
import com.gotn.model.PymeDsalidas;


public interface IDsalidasDao {
	void guardarDsalidas(PymeDsalidas entidad );
	void actualizarDsalidas(PymeDsalidas entidad);
	void eliminarDsalidas(PymeDsalidas entidad);
	PymeDsalidas getDsalida(Integer id);
	List<PymeDsalidas> getDsalidas();
}
