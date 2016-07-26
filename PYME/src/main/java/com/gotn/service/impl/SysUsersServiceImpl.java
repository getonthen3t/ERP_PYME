package com.gotn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gotn.dao.IConsecutivoDao;
import com.gotn.dao.ISysUsersDao;
import com.gotn.model.PymeSysUsers;
import com.gotn.service.ISysUsersService;
/*Creado por: asanchez 2016-07-25*/
@Service("sysUsersService")
public class SysUsersServiceImpl implements ISysUsersService {
	@Autowired
	private ISysUsersDao sysUsersDao;
	
	public boolean guardarSysUser(PymeSysUsers pojo) {
		try {
			sysUsersDao.guardarSysUsers(pojo);
			return true;
		} catch (Exception e) {
			System.out.println("Error guardando consecutivo >> "+e);
			return false;
		}
	}

	public boolean actualizarSysUser(PymeSysUsers pojo) {
		try {
			sysUsersDao.actualizarSysUser(pojo);
			return true;
		} catch (Exception e) {
			System.out.println("Error actualizando consecutivo >> "+e);
			return false;
		}
	}

	public boolean eliminarSysUser(PymeSysUsers pojo) {
		try {
			sysUsersDao.eliminarSysUser(pojo);
			return true;
		} catch (Exception e) {
			System.out.println("Error eliminando consecutivo >> "+e);
			return false;
		}
	}

	public PymeSysUsers getSysUserint(int idSysUser) {
		try {
			return sysUsersDao.getSysUser(idSysUser);
		} catch (Exception e) {
			System.out.println("Error obteniendo consecutivo >> "+e);
			return null;
		}
	}

	public List<PymeSysUsers> getSysUsers() {
		try {
			return sysUsersDao.getSysUsers();
		} catch (Exception e) {
			System.out.println("Error guardando consecutivoS >> "+e);
			return null;
		}
	}

}
