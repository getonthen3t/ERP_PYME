package com.gotn.service;

import java.util.List;

import com.gotn.model.PymeSubetapa;

public interface ISubetapaService {
	public boolean guardarSubetapa(PymeSubetapa pojo);
	public boolean actualizarSubetapa(PymeSubetapa pojo);
	public boolean eliminarSubetapa(PymeSubetapa pojo);
	public PymeSubetapa getSubetapa(int idSubetapa);
	public List<PymeSubetapa> getSubetapas();
}
