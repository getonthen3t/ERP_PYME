package com.gotn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gotn.dao.IFacncDetCliDao;
import com.gotn.dao.IMsalidasDao;
import com.gotn.model.PymeMsalidas;
import com.gotn.service.IMsalidasService;
/*Creado por: jjara 2016-07-26*/
@Service("msalidasService")
public class MsalidasServiceImpl implements IMsalidasService {
	@Autowired
	private IMsalidasDao msalidasDao;
	public boolean guardarMsalidas(PymeMsalidas pojo) {
		try {
			msalidasDao.guardarMsalidas(pojo);
			return true;
		} catch (Exception e) {
			System.out.println("Error guardando Msalidas >> "+e);
			return false;
		}
	}

	public boolean actualizarMsalidas(PymeMsalidas pojo) {
		try {
			msalidasDao.actualizarMsalidas(pojo);
			return true;
		} catch (Exception e) {
			System.out.println("Error actualizando Msalidas >> "+e);
			return false;
		}
	}

	public boolean eliminarMsalidas(PymeMsalidas pojo) {
		try {
			msalidasDao.eliminarMsalidas(pojo);
			return true;
		} catch (Exception e) {
			System.out.println("Error eliminando Msalidas >> "+e);
			return false;
		}
	}

	public PymeMsalidas getMsalida(int idMsalidas) {
		try {
			return msalidasDao.getMsalida(idMsalidas);
		} catch (Exception e) {
			System.out.println("Error obteniendo Msalidas >> "+e);
			return null;
		}
	}

	public List<PymeMsalidas> getMsalidas() {
		try {
			return msalidasDao.getMsalidas();
		} catch (Exception e) {
			System.out.println("Error guardando Msalidas >> "+e);
			return null;
		}
	}

}
