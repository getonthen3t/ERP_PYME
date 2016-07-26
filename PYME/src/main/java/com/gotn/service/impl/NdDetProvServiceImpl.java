package com.gotn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gotn.dao.IFacncDetCliDao;
import com.gotn.dao.INdDetProvDao;
import com.gotn.model.PymeNdDetProv;
import com.gotn.service.INdDetProvService;
/*Creado por: jjara 2016-07-26*/
@Service("ndDetProvService")
public class NdDetProvServiceImpl implements INdDetProvService {
	
	
	@Autowired
	private INdDetProvDao ndDetProvDao;
	
	public boolean guardarNdDetProv(PymeNdDetProv pojo) {
		try {
			ndDetProvDao.guardarNdDetProv(pojo);
			return true;
		} catch (Exception e) {
			System.out.println("Error guardando NdDetProv >> "+e);
			return false;
		}
	}

	public boolean actualizarNdDetProv(PymeNdDetProv pojo) {
		try {
			ndDetProvDao.actualizarNdDetProv(pojo);
			return true;
		} catch (Exception e) {
			System.out.println("Error actualizando NdDetProv >> "+e);
			return false;
		}
	}

	public boolean eliminarNdDetProv(PymeNdDetProv pojo) {
		try {
			ndDetProvDao.eliminarNdDetProv(pojo);
			return true;
		} catch (Exception e) {
			System.out.println("Error eliminando NdDetProv >> "+e);
			return false;
		}
	}

	public PymeNdDetProv getNdDetProv(int idNdDetProv) {
		try {
			return ndDetProvDao.getNdDetProv(idNdDetProv);
		} catch (Exception e) {
			System.out.println("Error obteniendo NdDetProv >> "+e);
			return null;
		}
	}

	public List<PymeNdDetProv> getNdDetProvs() {
		try {
			return ndDetProvDao.getNdDetProvs();
		} catch (Exception e) {
			System.out.println("Error guardando NdDetProv >> "+e);
			return null;
		}

}
