package com.gotn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gotn.dao.IConsecutivoDao;
import com.gotn.model.PymeConsecutivos;
import com.gotn.service.IConsecutivoService;
/*Creado por: jjara 2016-07-25*/
@Service("consecutivoService")
public class ConsecutivoServiceImpl implements IConsecutivoService {
	@Autowired
	private IConsecutivoDao consecutivoDao;
	
	public boolean guardarConsecutivo(PymeConsecutivos pojo) {
		try {
			consecutivoDao.guardarConsecutivo(pojo);
			return true;
		} catch (Exception e) {
			System.out.println("Error guardando consecutivo >> "+e);
			return false;
		}
	}

	public boolean actualizarConsecutivo(PymeConsecutivos pojo) {
		try {
			consecutivoDao.actualizarConsecutivo(pojo);
			return true;
		} catch (Exception e) {
			System.out.println("Error actualizando consecutivo >> "+e);
			return false;
		}
	}

	public boolean eliminarConsecutivo(PymeConsecutivos pojo) {
		try {
			consecutivoDao.eliminarConsecutivo(pojo);
			return true;
		} catch (Exception e) {
			System.out.println("Error eliminando consecutivo >> "+e);
			return false;
		}
	}

	public PymeConsecutivos getConsecutivo(int idConsecutivo) {
		try {
			return consecutivoDao.getConsecutivo(idConsecutivo);
		} catch (Exception e) {
			System.out.println("Error obteniendo consecutivo >> "+e);
			return null;
		}
	}

	public List<PymeConsecutivos> getConsecutivos() {
		try {
			return consecutivoDao.getConsecutivos();
		} catch (Exception e) {
			System.out.println("Error guardando consecutivoS >> "+e);
			return null;
		}
	}

}
