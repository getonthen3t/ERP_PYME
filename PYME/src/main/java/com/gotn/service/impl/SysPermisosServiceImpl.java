package com.gotn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gotn.dao.IConsecutivoDao;
import com.gotn.model.PymeSysPermisos;
import com.gotn.service.ISysPermisos;
/*Creado por: asanchez 2016-07-25*/
@Service("consecutivoService")
public class SysPermisosServiceImpl implements ISysPermisos {
	@Autowired
	private ISysPermisos sysPermisosDao;
	
	public boolean guardarSysPermiso(PymeSysPermisos pojo) {
		try {
			sysPermisosDao.guardarSysPermiso(pojo);
			return true;
		} catch (Exception e) {
			System.out.println("Error guardando permiso >> "+e);
			return false;
		}
	}

	public boolean actualizarSysPermiso(PymeSysPermisos pojo) {
		try {
			sysPermisosDao.actualizarSysPermiso(pojo);
			return true;
		} catch (Exception e) {
			System.out.println("Error actualizando permiso >> "+e);
			return false;
		}
	}

	public boolean eliminarSysPermiso(PymeSysPermisos pojo) {
		try {
			sysPermisosDao.eliminarSysPermiso(pojo);
			return true;
		} catch (Exception e) {
			System.out.println("Error eliminando permiso >> "+e);
			return false;
		}
	}

	public PymeSysPermisos getSysPermiso(int idSysPermiso) {
		try {
			return sysPermisosDao.getSysPermiso(idSysPermiso);
		} catch (Exception e) {
			System.out.println("Error obteniendo permiso >> "+e);
			return null;
		}
	}

	public List<PymeSysPermisos> getSysPermisos() {
		try {
			return sysPermisosDao.getSysPermisos();
		} catch (Exception e) {
			System.out.println("Error consultando permisos >> "+e);
			return null;
		}
	}

}
