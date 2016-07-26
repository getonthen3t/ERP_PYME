package com.gotn.service;

import java.util.List;
import com.gotn.model.PymeDsalidas;
/*Creado por: jjara 2016-07-25*/
public interface IDsalidasService {

	public boolean guardarDsalidas(PymeDsalidas pojo);
	public boolean actualizarDsalidas(PymeDsalidas pojo);
	public boolean eliminarDsalidas(PymeDsalidas pojo);
	public PymeDsalidas getDsalida(int idDsalidas);
	public List<PymeDsalidas> getDsalidas();
}
