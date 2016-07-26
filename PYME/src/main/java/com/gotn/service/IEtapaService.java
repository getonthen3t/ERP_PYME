package com.gotn.service;

import java.util.List;
import com.gotn.model.PymeEtapa;

public interface IEtapaService {
	public boolean guardarEtapa(PymeEtapa pojo);
	public boolean actualizarEtapa(PymeEtapa pojo);
	public boolean eliminarEtapa(PymeEtapa pojo);
	public PymeEtapa getEtapa(int idEtapa);
	public List<PymeEtapa> getEtapas();

}
