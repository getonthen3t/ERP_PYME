package com.gotn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gotn.dao.IFacncDetCliDao;
import com.gotn.dao.IMtiposDao;
import com.gotn.model.PymeMtipos;
import com.gotn.service.IMtiposService;
/*Creado por: jjara 2016-07-26*/
@Service("mtiposService")
public class MtiposServiceImpl implements IMtiposService {
	@Autowired
	private IMtiposDao mtiposDao;
	public boolean guardarMtipos(PymeMtipos pojo) {
		try {
			mtiposDao.guardarMtipos(pojo);
			return true;
		} catch (Exception e) {
			System.out.println("Error guardando Mtipos >> "+e);
			return false;
		}
	}

	public boolean actualizarMtipos(PymeMtipos pojo) {
		try {
			mtiposDao.actualizarMtipos(pojo);
			return true;
		} catch (Exception e) {
			System.out.println("Error actualizando Mtipos >> "+e);
			return false;
		}
	}

	public boolean eliminarMtipos(PymeMtipos pojo) {
		try {
			mtiposDao.eliminarMtipos(pojo);
			return true;
		} catch (Exception e) {
			System.out.println("Error eliminando Mtipos >> "+e);
			return false;
		}
	}

	public PymeMtipos getMtipo(int idMsalidas) {
		try {
			return mtiposDao.getMtipo(idMsalidas);
		} catch (Exception e) {
			System.out.println("Error obteniendo Mtipos >> "+e);
			return null;
		}
	}

	public List<PymeMtipos> getMtipos() {
		try {
			return mtiposDao.getMtipos();
		} catch (Exception e) {
			System.out.println("Error guardando Mtipos >> "+e);
			return null;
		}
	}

}
