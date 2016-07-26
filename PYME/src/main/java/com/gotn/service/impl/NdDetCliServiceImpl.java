package com.gotn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gotn.dao.IFacncDetCliDao;
import com.gotn.dao.INdDetCliDao;
import com.gotn.model.PymeNdDetCli;
import com.gotn.service.INdDetCliService;
/*Creado por: jjara 2016-07-26*/
@Service("ndDetCliService")
public class NdDetCliServiceImpl implements INdDetCliService {
	
	@Autowired
	private INdDetCliDao ndDetCliDao;
	
	public boolean guardarNdDetCli(PymeNdDetCli pojo) {
		try {
			ndDetCliDao.guardarNdDetCli(pojo);
			return true;
		} catch (Exception e) {
			System.out.println("Error guardando NdDetCli >> "+e);
			return false;
		}
	}

	public boolean actualizarNdDetCli(PymeNdDetCli pojo) {
		try {
			ndDetCliDao.actualizarNdDetCli(pojo);
			return true;
		} catch (Exception e) {
			System.out.println("Error actualizando NdDetCli >> "+e);
			return false;
		}
	}

	public boolean eliminarNdDetCli(PymeNdDetCli pojo) {
		try {
			ndDetCliDao.eliminarNdDetCli(pojo);
			return true;
		} catch (Exception e) {
			System.out.println("Error eliminando NdDetCli >> "+e);
			return false;
		}
	}

	public PymeNdDetCli getNdDetCli(int idMsalidas) {
		try {
			return ndDetCliDao.getNdDetCli(idMsalidas);
		} catch (Exception e) {
			System.out.println("Error obteniendo NdDetCli >> "+e);
			return null;
		}
	}

	public List<PymeNdDetCli> getNdDetClis() {
		try {
			return ndDetCliDao.getNdDetClis();
		} catch (Exception e) {
			System.out.println("Error guardando NdDetCli >> "+e);
			return null;
		}
	}

}
