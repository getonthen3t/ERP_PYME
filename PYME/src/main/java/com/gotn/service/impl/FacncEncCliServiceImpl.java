package com.gotn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gotn.dao.IFacncDetCliDao;
import com.gotn.dao.IFacncEncCliDao;
import com.gotn.model.PymeFacncEncCli;
import com.gotn.service.IFacncEncCliService;
/*Creado por: jjara 2016-07-26*/
@Service("facncEncCliService")
public class FacncEncCliServiceImpl implements IFacncEncCliService {
	@Autowired
	private IFacncEncCliDao facncEncCliDao;
	public boolean guardarFacncEncCli(PymeFacncEncCli pojo) {
		try {
			facncEncCliDao.guardarFacncEncCli(pojo);
			return true;
		} catch (Exception e) {
			System.out.println("Error guardando FacncEncCli >> "+e);
			return false;
		}
	}

	public boolean actualizarFacncEncCli(PymeFacncEncCli pojo) {
		try {
			facncEncCliDao.actualizarFacncEncCli(pojo);
			return true;
		} catch (Exception e) {
			System.out.println("Error actualizando FacncEncCli >> "+e);
			return false;
		}
	}

	public boolean eliminarFacncEncCli(PymeFacncEncCli pojo) {
		try {
			facncEncCliDao.eliminarFacncEncCli(pojo);
			return true;
		} catch (Exception e) {
			System.out.println("Error eliminando FacncEncCli >> "+e);
			return false;
		}
	}

	public PymeFacncEncCli getFacncEncCli(int idEtapa) {
		try {
			return facncEncCliDao.getFacncEncCli(idEtapa);
		} catch (Exception e) {
			System.out.println("Error obteniendo FacncEncCli >> "+e);
			return null;
		}
	}

	public List<PymeFacncEncCli> getFacncEncClis() {
		try {
			return facncEncCliDao.getFacncEncClis();
		} catch (Exception e) {
			System.out.println("Error guardando FacncEncCli >> "+e);
			return null;
		}
	}

}
