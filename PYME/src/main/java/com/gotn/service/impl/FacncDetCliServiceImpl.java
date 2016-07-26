package com.gotn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gotn.dao.IFacncDetCliDao;
import com.gotn.model.PymeFacncDetCli;
import com.gotn.service.IFacncDetCliService;

/*Creado por: jjara 2016-07-26*/
@Service("facncDetCliService")
public class FacncDetCliServiceImpl implements IFacncDetCliService {
	@Autowired
	private IFacncDetCliDao facncDetCliDao;
	
	public boolean guardarFacncDetCli(PymeFacncDetCli pojo) {
		try {
			facncDetCliDao.guardarFacncDetCli(pojo);
			return true;
		} catch (Exception e) {
			System.out.println("Error guardando FacncDetCli >> "+e);
			return false;
		}
	}

	public boolean actualizarFacncDetCli(PymeFacncDetCli pojo) {
		try {
			facncDetCliDao.actualizarFacncDetCli(pojo);
			return true;
		} catch (Exception e) {
			System.out.println("Error actualizando FacncDetCli >> "+e);
			return false;
		}
	}

	public boolean eliminarFacncDetCli(PymeFacncDetCli pojo) {
		try {
			facncDetCliDao.eliminarFacncDetCli(pojo);
			return true;
		} catch (Exception e) {
			System.out.println("Error eliminando FacncDetCli >> "+e);
			return false;
		}
	}

	public PymeFacncDetCli getFacncDetCli(int idEtapa) {
		try {
			return facncDetCliDao.getFacncDetCli(idEtapa);
		} catch (Exception e) {
			System.out.println("Error obteniendo FacncDetCli >> "+e);
			return null;
		}
	}

	public List<PymeFacncDetCli> getFacncDetClis() {
		try {
			return facncDetCliDao.getFacncDetClis();
		} catch (Exception e) {
			System.out.println("Error guardando FacncDetCli >> "+e);
			return null;
		}
	}

}
