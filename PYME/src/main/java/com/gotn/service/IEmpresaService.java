package com.gotn.service;

import java.util.List;

import com.gotn.model.PymeEmpresa;

public interface IEmpresaService {
	public boolean guardarEmpresa(PymeEmpresa pojo);
	public boolean actualizarEmpresa(PymeEmpresa pojo);
	public boolean eliminarEmpresa(PymeEmpresa pojo);
	public PymeEmpresa getEmpresa(int idDtipos);
	public List<PymeEmpresa> getEmpresas();
}
