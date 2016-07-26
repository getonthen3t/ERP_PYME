package com.gotn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gotn.dao.IFacncDetCliDao;
import com.gotn.dao.IFacncDetProvDao;
import com.gotn.model.PymeFacncDetProv;
import com.gotn.service.IFacncDetProvService;
/*Creado por: jjara 2016-07-26*/
@Service("facncDetProvService")
public class FacncDetProvServiceImpl implements IFacncDetProvService {
	@Autowired
	private IFacncDetProvDao facncDetProvDao;
	public boolean guardarFacncDetProv(PymeFacncDetProv pojo) {
		try {
			facncDetProvDao.guardarFacncDetProv(pojo);
			return true;
		} catch (Exception e) {
			System.out.println("Error guardando FacncDetProv >> "+e);
			return false;
		}
	}

	public boolean actualizarFacncDetProv(PymeFacncDetProv pojo) {
		try {
			facncDetProvDao.actualizarFacncDetProv(pojo);
			return true;
		} catch (Exception e) {
			System.out.println("Error actualizando FacncDetProv >> "+e);
			return false;
		}
	}

	public boolean eliminarFacncDetProv(PymeFacncDetProv pojo) {
		try {
			facncDetProvDao.eliminarFacncDetProv(pojo);
			return true;
		} catch (Exception e) {
			System.out.println("Error eliminando FacncDetProv >> "+e);
			return false;
		}
	}

	public PymeFacncDetProv getFacncDetProv(int idEtapa) {
		try {
			return facncDetProvDao.getFacncDetProv(idEtapa);
		} catch (Exception e) {
			System.out.println("Error obteniendo FacncDetProv >> "+e);
			return null;
		}
	}

	public List<PymeFacncDetProv> getFacncDetProvs() {
		try {
			return facncDetProvDao.getFacncDetProvs();
		} catch (Exception e) {
			System.out.println("Error guardando FacncDetProv >> "+e);
			return null;
		}
	}

}
