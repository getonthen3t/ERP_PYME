package com.gotn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gotn.dao.IConsecutivoDao;
import com.gotn.dao.IDsalidasDao;
import com.gotn.model.PymeDsalidas;
import com.gotn.service.IDsalidasService;
/*Creado por: jjara 2016-07-25*/
//@Service("dsalidasService")
@Service
public class DsalidasServiceImpl implements IDsalidasService {
	@Autowired
	private IDsalidasDao idSalidasDao;
	
	public boolean guardarDsalidas(PymeDsalidas pojo) {
		try {
			idSalidasDao.guardarDsalidas(pojo);
			return true;
		} catch (Exception e) {
			System.out.println("Error guardando Idsalidas >> "+e);
			return false;
		}
	}

	public boolean actualizarDsalidas(PymeDsalidas pojo) {
		try {
			idSalidasDao.actualizarDsalidas(pojo);
			return true;
		} catch (Exception e) {
			System.out.println("Error actualizando Idsalidas >> "+e);
			return false;
		}
	}

	public boolean eliminarDsalidas(PymeDsalidas pojo) {
		try {
			idSalidasDao.eliminarDsalidas(pojo);
			return true;
		} catch (Exception e) {
			System.out.println("Error eliminando Idsalidas >> "+e);
			return false;
		}
	}

	public PymeDsalidas getDsalida(int idDsalidas) {
		try {
			return idSalidasDao.getDsalida(idDsalidas);
		} catch (Exception e) {
			System.out.println("Error obteniendo Idsalidas >> "+e);
			return null;
		}
	}

	public List<PymeDsalidas> getDsalidas() {
		try {
			return idSalidasDao.getDsalidas();
		} catch (Exception e) {
			System.out.println("Error guardando Idsalidas >> "+e);
			return null;
		}
	}

}
