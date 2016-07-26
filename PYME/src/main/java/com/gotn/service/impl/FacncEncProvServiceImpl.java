package com.gotn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gotn.dao.IFacncDetCliDao;
import com.gotn.dao.IFacncEncProvDao;
import com.gotn.model.PymeFacncEncProv;
import com.gotn.service.IFacncEncProvService;
/*Creado por: jjara 2016-07-26*/
@Service("facncEncProvService")
public class FacncEncProvServiceImpl implements IFacncEncProvService {
	@Autowired
	private IFacncEncProvDao facncEncProvDao;
	public boolean guardarFacncEncProv(PymeFacncEncProv pojo) {
		try {
			facncEncProvDao.guardarFacncEncProv(pojo);
			return true;
		} catch (Exception e) {
			System.out.println("Error guardando FacncEncProv >> "+e);
			return false;
		}
	}

	public boolean actualizarFacncEncProv(PymeFacncEncProv pojo) {
		try {
			facncEncProvDao.actualizarFacncEncProv(pojo);
			return true;
		} catch (Exception e) {
			System.out.println("Error actualizando FacncEncProv >> "+e);
			return false;
		}
	}

	public boolean eliminarFacncEncProv(PymeFacncEncProv pojo) {
		try {
			facncEncProvDao.eliminarFacncEncProv(pojo);
			return true;
		} catch (Exception e) {
			System.out.println("Error eliminando FacncEncProv >> "+e);
			return false;
		}
	}

	public PymeFacncEncProv getFacncEncProv(int idEtapa) {
		try {
			return facncEncProvDao.getFacncEncProv(idEtapa);
		} catch (Exception e) {
			System.out.println("Error obteniendo FacncEncProv >> "+e);
			return null;
		}
	}

	public List<PymeFacncEncProv> getFacncEncProvs() {
		try {
			return facncEncProvDao.getFacncEncProvs();
		} catch (Exception e) {
			System.out.println("Error guardando FacncEncProv >> "+e);
			return null;
		}
	}

}
