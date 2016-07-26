package com.gotn.dao;

import java.util.List;
import com.gotn.model.PymeEtapa;

//Elaborado por Juan Jara 25-07-2016 16:59

public interface IEtapaDao {
	void guardarEtapa(PymeEtapa entidad );
	void actualizarEtapa(PymeEtapa entidad);
	void eliminarEtapa(PymeEtapa entidad);
	PymeEtapa getEtapa(Integer id);
	List<PymeEtapa> getEtapas();
}
