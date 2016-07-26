package com.gotn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gotn.dao.IFacncDetCliDao;
import com.gotn.dao.INdEncProvDao;
import com.gotn.model.PymeNdEncProv;
import com.gotn.service.INdEncProvService;
/*Creado por: jjara 2016-07-26*/
@Service("ndEncProvService")
public class NdEncProvServiceImpl implements INdEncProvService {
	@Autowired
	private INdEncProvDao ndEncProvDao;
	public boolean guardarNdEncProv(PymeNdEncProv pojo) {
		try {
			ndEncProvDao.guardarNdEncProv(pojo);
			return true;
		} catch (Exception e) {
			System.out.println("Error guardando NdEncProv >> "+e);
			return false;
		}
	}

	public boolean actualizarNdEncProv(PymeNdEncProv pojo) {
		try {
			ndEncProvDao.actualizarNdEncProv(pojo);
			return true;
		} catch (Exception e) {
			System.out.println("Error actualizando NdEncProv >> "+e);
			return false;
		}
	}

	public boolean eliminarNdEncProv(PymeNdEncProv pojo) {
		try {
			ndEncProvDao.eliminarNdEncProv(pojo);
			return true;
		} catch (Exception e) {
			System.out.println("Error eliminando NdEncProv >> "+e);
			return false;
		}
	}

	public PymeNdEncProv getNdEncProv(int idNdEncProv) {
		try {
			return ndEncProvDao.getNdEncProv(idNdEncProv);
		} catch (Exception e) {
			System.out.println("Error obteniendo NdEncProv >> "+e);
			return null;
		}
	}

	public List<PymeNdEncProv> getNdEncProvs() {
		try {
			return ndEncProvDao.getNdEncProvs();
		} catch (Exception e) {
			System.out.println("Error guardando NdEncProv >> "+e);
			return null;
		}
	}

}
