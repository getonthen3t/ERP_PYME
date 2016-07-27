package com.gotn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gotn.dao.IFacncDetCliDao;
import com.gotn.dao.IMlistaPreciosDao;
import com.gotn.model.PymeMlistaPrecios;
import com.gotn.service.IMlistaPreciosService;
/*Creado por: jjara 2016-07-26*/
@Service("mlistaPreciosService")
public class MlistaPreciosServiceImpl implements IMlistaPreciosService {
	@Autowired
	private IMlistaPreciosDao mlistaPreciosDao;
	public boolean guardarMlistaPrecios(PymeMlistaPrecios pojo) {
		try {
			mlistaPreciosDao.guardarMlistaPrecios(pojo);
			return true;
		} catch (Exception e) {
			System.out.println("Error guardando MlistaPrecios >> "+e);
			return false;
		}
	}

	public boolean actualizarMlistaPrecios(PymeMlistaPrecios pojo) {
		try {
			mlistaPreciosDao.actualizarMlistaPrecios(pojo);
			return true;
		} catch (Exception e) {
			System.out.println("Error actualizando MlistaPrecios >> "+e);
			return false;
		}
	}

	public boolean eliminarMlistaPrecios(PymeMlistaPrecios pojo) {
		try {
			mlistaPreciosDao.eliminarMlistaPrecios(pojo);
			return true;
		} catch (Exception e) {
			System.out.println("Error eliminando MlistaPrecios >> "+e);
			return false;
		}
	}

	public PymeMlistaPrecios getMlistaPrecio(int idMlistaPrecios) {
		try {
			return mlistaPreciosDao.getMlistaPrecio(idMlistaPrecios);
		} catch (Exception e) {
			System.out.println("Error obteniendo MlistaPrecios >> "+e);
			return null;
		}
	}

	public List<PymeMlistaPrecios> getMlistaPrecios() {
		try {
			return mlistaPreciosDao.getMlistaPrecios();
		} catch (Exception e) {
			System.out.println("Error guardando MlistaPrecios >> "+e);
			return null;
		}
	}

}
