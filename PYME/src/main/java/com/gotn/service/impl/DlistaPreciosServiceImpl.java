package com.gotn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gotn.dao.IDlistaPreciosDao;
import com.gotn.model.PymeDlistaPrecios;
import com.gotn.service.IDlistaPreciosService;

/*Creado por: jjara 2016-07-25*/

@Service("dlistaPreciosService")

public class DlistaPreciosServiceImpl implements IDlistaPreciosService{
	
	@Autowired
	private IDlistaPreciosDao dlistaPreciosDao;

	public boolean guardarlistaPrecios(PymeDlistaPrecios pojo) {
		try {
			dlistaPreciosDao.guardarDlistaPrecios(pojo);
			return true;
		} catch (Exception e) {
			System.out.println("Error guardando ListaPrecios >> "+e);
			return false;
		}
	}

	public boolean actualizarlistaPrecios(PymeDlistaPrecios pojo) {
		try {
			dlistaPreciosDao.actualizarDlistaPrecios(pojo);
			return true;
		} catch (Exception e) {
			System.out.println("Error actualizando ListaPrecios >> "+e);
			return false;
		}
	}

	public boolean eliminarlistaPrecios(PymeDlistaPrecios pojo) {
		try {
			dlistaPreciosDao.eliminarDlistaPrecios(pojo);
			return true;
		} catch (Exception e) {
			System.out.println("Error eliminando ListaPrecios >> "+e);
			return false;
		}
	}

	public PymeDlistaPrecios getlistaPrecio(int idListaPrecios) {
		try {
			return dlistaPreciosDao.getDlistaPrecio(idListaPrecios);
		} catch (Exception e) {
			System.out.println("Error obteniendo Listprecios >> "+e);
			return null;
		}
	}

	public List<PymeDlistaPrecios> getlistaPrecios() {
		try {
			return dlistaPreciosDao.getDlistaPrecios();
		} catch (Exception e) {
			System.out.println("Error guardando ListPrecios >> "+e);
			return null;
		}
	}

}
