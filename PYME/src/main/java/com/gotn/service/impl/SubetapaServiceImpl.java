package com.gotn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gotn.model.PymeSubetapa;
import com.gotn.service.ISubetapaService;
/*Creado por: asanchez 2016-07-25*/
@Service("subetapaService")
public class SubetapaServiceImpl implements ISubetapaService {
	@Autowired
	private ISubetapaService subetapaDao;
	
	public boolean guardarSubetapa(PymeSubetapa pojo) {
		try {
			subetapaDao.guardarSubetapa(pojo);
			return true;
		} catch (Exception e) {
			System.out.println("Error guardando subetapa >> "+e);
			return false;
		}
	}

	public boolean actualizarSubetapa(PymeSubetapa pojo) {
		try {
			subetapaDao.actualizarSubetapa(pojo);
			return true;
		} catch (Exception e) {
			System.out.println("Error actualizando subetapa >> "+e);
			return false;
		}
	}

	public boolean eliminarSubetapa(PymeSubetapa pojo) {
		try {
			subetapaDao.eliminarSubetapa(pojo);
			return true;
		} catch (Exception e) {
			System.out.println("Error eliminando subetapa >> "+e);
			return false;
		}
	}

	public PymeSubetapa getSubetapa(int idSubetapa) {
		try {
			return subetapaDao.getSubetapa(idSubetapa);
		} catch (Exception e) {
			System.out.println("Error obteniendo subetapa >> "+e);
			return null;
		}
	}

	public List<PymeSubetapa> getSubetapas() {
		try {
			return subetapaDao.getSubetapas();
		} catch (Exception e) {
			System.out.println("Error guardando subetapaS >> "+e);
			return null;
		}
	}

}
