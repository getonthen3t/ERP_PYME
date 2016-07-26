package com.gotn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gotn.dao.INdEncCliDao;
import com.gotn.model.PymeNdEncCli;
import com.gotn.service.INdEncCliService;

/*Creado por: jjara 2016-07-26*/
@Service("ndEncCliService")

public class NdEncCliServiceImpl implements INdEncCliService {
	@Autowired
	private INdEncCliDao ndEncCliDao;
	
	public boolean guardarNdEncCli(PymeNdEncCli pojo) {
		try {
			ndEncCliDao.guardarNdEncCli(pojo);
			return true;
		} catch (Exception e) {
			System.out.println("Error guardando NdEncCli >> "+e);
			return false;
		}
	}

	public boolean actualizarNdEncCli(PymeNdEncCli pojo) {
		try {
			ndEncCliDao.actualizarNdEncCli(pojo);
			return true;
		} catch (Exception e) {
			System.out.println("Error actualizando NdEncCli >> "+e);
			return false;
		}
	}

	public boolean eliminarNdEncCli(PymeNdEncCli pojo) {
		try {
			ndEncCliDao.eliminarNdEncCli(pojo);
			return true;
		} catch (Exception e) {
			System.out.println("Error eliminando NdEncCli >> "+e);
			return false;
		}
	}

	public PymeNdEncCli getNdEncCli(int idNdEncCli) {
		try {
			return ndEncCliDao.getNdEncCli(idNdEncCli);
		} catch (Exception e) {
			System.out.println("Error obteniendo NdEncCli >> "+e);
			return null;
		}
	}

	public List<PymeNdEncCli> getNdEncClis() {
		try {
			return ndEncCliDao.getNdEncClis();
		} catch (Exception e) {
			System.out.println("Error guardando NdEncCli >> "+e);
			return null;
		}
	}

}
