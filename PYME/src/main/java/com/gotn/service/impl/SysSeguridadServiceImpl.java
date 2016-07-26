package com.gotn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gotn.dao.IConsecutivoDao;
import com.gotn.model.PymeSysSeguridad;
import com.gotn.service.ISysSeguridadService;
/*Creado por: asanchez 2016-07-25*/
@Service("sysSeguridadService")
public class SysSeguridadServiceImpl implements ISysSeguridadService {
	@Autowired
	private ISysSeguridadService sysSeguridadServiceDao;
	
	public boolean guardarSysSeguridad(PymeSysSeguridad pojo) {
		try {
			sysSeguridadServiceDao.guardarSysSeguridad(pojo);
			return true;
		} catch (Exception e) {
			System.out.println("Error guardando consecutivo >> "+e);
			return false;
		}
	}

	public boolean actualizarSysSeguridad(PymeSysSeguridad pojo) {
		try {
			sysSeguridadServiceDao.actualizarSysSeguridad(pojo);
			return true;
		} catch (Exception e) {
			System.out.println("Error actualizando consecutivo >> "+e);
			return false;
		}
	}

	public boolean eliminarSysSeguridad(PymeSysSeguridad pojo) {
		try {;
			sysSeguridadServiceDao.eliminarSysSeguridad(pojo);
			return true;
		} catch (Exception e) {
			System.out.println("Error eliminando consecutivo >> "+e);
			return false;
		}
	}

	public PymeSysSeguridad getSysSeguridad(int idSysSeguridad) {
		try {
			return sysSeguridadServiceDao.getSysSeguridad(idSysSeguridad);
		} catch (Exception e) {
			System.out.println("Error obteniendo consecutivo >> "+e);
			return null;
		}
	}

	public List<PymeSysSeguridad> getSysSeguridades() {
		try {
			return sysSeguridadServiceDao.getSysSeguridades();
		} catch (Exception e) {
			System.out.println("Error guardando consecutivoS >> "+e);
			return null;
		}
	}

}
