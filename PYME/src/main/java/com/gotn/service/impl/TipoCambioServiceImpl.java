package com.gotn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gotn.dao.ITipoCambioDao;
import com.gotn.dao.ITipoCambioDao;
import com.gotn.model.PymeTipoCambio;
import com.gotn.service.ITipoCambioService;
/*Creado por: asanchez 2016-07-25*/
@Service("tipoCambioService")
public class TipoCambioServiceImpl implements ITipoCambioService {
	@Autowired
	private ITipoCambioDao tipoCambioDao;
	public boolean guardarTipoCambio(PymeTipoCambio pojo) {
		try {
			tipoCambioDao.guardarTipoCambio(pojo);
			return true;
		} catch (Exception e) {
			System.out.println("Error guardando TipoCambio >> " + e);
			return false;
		}
	}

	public boolean actualizarTipoCambio(PymeTipoCambio pojo) {
		try {
			tipoCambioDao.actualizarTipoCambio(pojo);
			return true;
		} catch (Exception e) {
			System.out.println("Error actualizando TipoCambio >> " + e);
			return false;
		}
	}

	public boolean eliminarTipoCambio(PymeTipoCambio pojo) {
		try {
			tipoCambioDao.eliminarTipoCambio(pojo);
			return true;
		} catch (Exception e) {
			System.out.println("Error eliminando TipoCambio >> " + e);
			return false;
		}
	}

	public PymeTipoCambio getTipoCambio(int idTipoCambio) {
		try {
			return tipoCambioDao.getTipoCambio(idTipoCambio);
		} catch (Exception e) {
			System.out.println("Error obteniendo TipoCambio >> " + e);
			return null;
		}
	}

	public List<PymeTipoCambio> getTipoCambios() {
		try {
			return tipoCambioDao.getTiposCambio();
		} catch (Exception e) {
			System.out.println("Error guardando TipoCambioS >> " + e);
			return null;
		}
	}

}
