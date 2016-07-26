package com.gotn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gotn.dao.IFacncDetCliDao;
import com.gotn.dao.IMentradasDao;
import com.gotn.model.PymeMentradas;
import com.gotn.service.IMentradasService;
/*Creado por: jjara 2016-07-26*/
@Service("mestradasService")
public class MentradasServiceImpl implements IMentradasService {
	@Autowired
	private IMentradasDao MentradasDao;
	public boolean guardarMentradas(PymeMentradas pojo) {
		try {
			MentradasDao.guardarMentradas(pojo);
			return true;
		} catch (Exception e) {
			System.out.println("Error guardando Mentradas >> "+e);
			return false;
		}
	}

	public boolean actualizarMentradas(PymeMentradas pojo) {
		try {
			MentradasDao.actualizarMentradas(pojo);
			return true;
		} catch (Exception e) {
			System.out.println("Error actualizando Mentradas >> "+e);
			return false;
		}
	}

	public boolean eliminarMentradas(PymeMentradas pojo) {
		try {
			MentradasDao.eliminarMentradas(pojo);
			return true;
		} catch (Exception e) {
			System.out.println("Error eliminando Mentradas >> "+e);
			return false;
		}
	}

	public PymeMentradas getMentrada(int idEtapa) {
		try {
			return MentradasDao.getMentrada(idEtapa);
		} catch (Exception e) {
			System.out.println("Error obteniendo Mentradas >> "+e);
			return null;
		}
	}

	public List<PymeMentradas> getMentradas() {
		try {
			return MentradasDao.getMentradas();
		} catch (Exception e) {
			System.out.println("Error guardando Mentradas >> "+e);
			return null;
		}
	}

}
