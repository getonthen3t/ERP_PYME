package com.gotn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gotn.dao.IConsecutivoDao;
import com.gotn.dao.ISociosDao;
import com.gotn.model.PymeSocios;
import com.gotn.service.ISociosService;
/*Creado por: asanchez 2016-07-25*/
@Service("sociosService")
public class SociosServiceImpl implements ISociosService {
	@Autowired
	private ISociosDao socioDao;
	public boolean guardarSocio(PymeSocios pojo) {
		try {
			socioDao.guardarSocio(pojo);
			return true;
		} catch (Exception e) {
			System.out.println("Error guardando socio >> "+e);
			return false;
		}
	}

	public boolean actualizarSocio(PymeSocios pojo) {
		try {
			socioDao.actualizarSocio(pojo);
			return true;
		} catch (Exception e) {
			System.out.println("Error actualizando socio >> "+e);
			return false;
		}
	}

	public boolean eliminarSocio(PymeSocios pojo) {
		try {
			socioDao.eliminarSocio(pojo);;
			return true;
		} catch (Exception e) {
			System.out.println("Error eliminando socio >> "+e);
			return false;
		}
	}

	public PymeSocios getSocio(int idSocio) {
		try {
			return socioDao.getSocio(idSocio);
		} catch (Exception e) {
			System.out.println("Error obteniendo consecutivo >> "+e);
			return null;
		}
	}

	public List<PymeSocios> getSocios() {
		try {
			return socioDao.getSocios();
		} catch (Exception e) {
			System.out.println("Error guardando consecutivoS >> "+e);
			return null;
		}
	}

}
