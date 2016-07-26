package com.gotn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gotn.dao.IEtapaDao;
import com.gotn.model.PymeEtapa;
import com.gotn.service.IEtapaService;

/*Creado por: jjara 2016-07-25*/
@Service("etapaService")
public class EtapaServiceImpl implements IEtapaService {
	@Autowired
	private IEtapaDao etapaDao;
	
	public boolean guardarEtapa(PymeEtapa pojo) {
		try {
			etapaDao.guardarEtapa(pojo);
			return true;
		} catch (Exception e) {
			System.out.println("Error guardando Etapa >> "+e);
			return false;
		}
	}

	public boolean actualizarEtapa(PymeEtapa pojo) {
		try {
			etapaDao.actualizarEtapa(pojo);
			return true;
		} catch (Exception e) {
			System.out.println("Error actualizando Etapa >> "+e);
			return false;
		}
	}

	public boolean eliminarEtapa(PymeEtapa pojo) {
		try {
			etapaDao.eliminarEtapa(pojo);
			return true;
		} catch (Exception e) {
			System.out.println("Error eliminando Etapa >> "+e);
			return false;
		}
	}

	public PymeEtapa getEtapa(int idEtapa) {
		try {
			return etapaDao.getEtapa(idEtapa);
		} catch (Exception e) {
			System.out.println("Error obteniendo Etapa >> "+e);
			return null;
		}
	}

	public List<PymeEtapa> getEtapas() {
		try {
			return etapaDao.getEtapas();
		} catch (Exception e) {
			System.out.println("Error guardando Etapa >> "+e);
			return null;
		}
	}

}
