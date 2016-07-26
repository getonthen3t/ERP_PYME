package com.gotn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gotn.dao.IConsecutivoDao;
import com.gotn.dao.IEmpresaDao;
import com.gotn.model.PymeEmpresa;
import com.gotn.service.IEmpresaService;
/*Creado por: jjara 2016-07-25*/
@Service("empresaService")
public class EmpresaServiceImpl implements IEmpresaService {
	@Autowired
	private IEmpresaDao empresaDao;
	public boolean guardarEmpresa(PymeEmpresa pojo) {
		try {
			empresaDao.guardarEmpresa(pojo);
			return true;
		} catch (Exception e) {
			System.out.println("Error guardando Empresa >> "+e);
			return false;
		}
	}

	public boolean actualizarEmpresa(PymeEmpresa pojo) {
		try {
			empresaDao.actualizarEmpresa(pojo);
			return true;
		} catch (Exception e) {
			System.out.println("Error actualizando Empresa >> "+e);
			return false;
		}
	}

	public boolean eliminarEmpresa(PymeEmpresa pojo) {
		try {
			empresaDao.eliminarEmpresa(pojo);
			return true;
		} catch (Exception e) {
			System.out.println("Error eliminando Empresa >> "+e);
			return false;
		}
	}

	public PymeEmpresa getEmpresa(int idDtipos) {
		try {
			return empresaDao.getEmpresa(idDtipos);
		} catch (Exception e) {
			System.out.println("Error obteniendo Empresa >> "+e);
			return null;
		}
	}

	public List<PymeEmpresa> getEmpresas() {
		try {
			return empresaDao.getEmpresas();
		} catch (Exception e) {
			System.out.println("Error guardando Empresa >> "+e);
			return null;
		}
	}

}
