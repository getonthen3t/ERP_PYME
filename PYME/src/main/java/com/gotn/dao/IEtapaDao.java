package com.gotn.dao;

import java.util.List;
import com.gotn.model.PymeEtapa;

//Elaborado por Juan Jara 25-07-2016 16:59

public interface IEtapaDao {
	void guardarConsecutivo(PymeEtapa entidad );
	void actualizarConsecutivo(PymeEtapa entidad);
	void eliminarConsecutivo(PymeEtapa entidad);
	PymeEtapa getConsecutivo(Integer id);
	List<PymeEtapa> getConsecutivos();
}
