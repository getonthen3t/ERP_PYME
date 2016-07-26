package com.gotn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gotn.dao.IDentradasDao;
import com.gotn.model.PymeDentradas;
import com.gotn.service.IDentradasService;
/*Creado por: jjara 2016-07-25*/

@Service("dentradasService")
public class DentradasServiceImpl implements IDentradasService{
	@Autowired
	private IDentradasDao dentradasDao;

	public boolean guardarDentradas(PymeDentradas pojo) {
		try {
			dentradasDao.guardarDentradas(pojo);
			return true;
		} catch (Exception e) {
			System.out.println("Error guardando Dentrada >> "+e);
			return false;
		}
	}

	public boolean actualizarDentradas(PymeDentradas pojo) {
		try {
			dentradasDao.actualizarDentradas(pojo);
			return true;
		} catch (Exception e) {
			System.out.println("Error actualizando Dentradas >> "+e);
			return false;
		}
	}

	public boolean eliminarDentradas(PymeDentradas pojo) {
		try {
			dentradasDao.eliminarDentradas(pojo);
			return true;
		} catch (Exception e) {
			System.out.println("Error eliminando Dentradas >> "+e);
			return false;
		}
	}

	public PymeDentradas getDentrada(int idDentradas) {
		try {
			return dentradasDao.getDentrada(idDentradas);
		} catch (Exception e) {
			System.out.println("Error obteniendo Dentradas >> "+e);
			return null;
		}
	}

	public List<PymeDentradas> getDentradas() {
		try {
			return dentradasDao.getDentradas();
		} catch (Exception e) {
			System.out.println("Error guardando Dentras >> "+e);
			return null;
		}
	}

	


}
