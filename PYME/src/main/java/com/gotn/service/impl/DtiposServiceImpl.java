package com.gotn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gotn.dao.IConsecutivoDao;
import com.gotn.dao.IDtiposDao;
import com.gotn.model.PymeDtipos;
import com.gotn.service.IDtiposService;

/*Creado por: jjara 2016-07-25*/
@Service("dtiposService")
public class DtiposServiceImpl implements IDtiposService {

	@Autowired
	private IDtiposDao dtiposDao;
	
	public boolean guardarDtipos(PymeDtipos pojo) {
		try {
			dtiposDao.guardarDtipos(pojo);
			return true;
		} catch (Exception e) {
			System.out.println("Error guardando Dtipos >> "+e);
			return false;
		}
	}

	public boolean actualizarDtipos(PymeDtipos pojo) {
		try {
			dtiposDao.actualizarDtipos(pojo);
			return true;
		} catch (Exception e) {
			System.out.println("Error actualizando Dtipos >> "+e);
			return false;
		}
	}

	public boolean eliminarDtipos(PymeDtipos pojo) {
		try {
			dtiposDao.eliminarDtipos(pojo);
			return true;
		} catch (Exception e) {
			System.out.println("Error eliminando Dtipos >> "+e);
			return false;
		}
	}

	public PymeDtipos getDtipo(int idDtipos) {
		try {
			return dtiposDao.getDtipo(idDtipos);
		} catch (Exception e) {
			System.out.println("Error obteniendo Dtipo >> "+e);
			return null;
		}
	}

	public List<PymeDtipos> getDtipos() {
		try {
			return dtiposDao.getDtipos();
		} catch (Exception e) {
			System.out.println("Error guardando Dtipos >> "+e);
			return null;
		}
	}

}
