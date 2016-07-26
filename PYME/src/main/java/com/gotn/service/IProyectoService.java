package com.gotn.service;

import java.util.List;

import com.gotn.model.PymeProyecto;

public interface IProyectoService {
	public boolean guardarProyecto(PymeProyecto pojo);
	public boolean actualizarProyecto(PymeProyecto pojo);
	public boolean eliminarProyecto(PymeProyecto pojo);
	public PymeProyecto getProyecto(int idProyecto);
	public List<PymeProyecto> getProyectos();
}
