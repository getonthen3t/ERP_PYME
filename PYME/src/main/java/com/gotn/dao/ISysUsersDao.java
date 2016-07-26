package com.gotn.dao;

import java.util.List;

import com.gotn.model.PymeSysUsers;


//Elaborado por Juan Jara 25-07-2016 16:59

public interface ISysUsersDao{
	void guardarSysUsers(PymeSysUsers entidad );
	void actualizarSysUser(PymeSysUsers entidad);
	void eliminarSysUser(PymeSysUsers entidad);
	PymeSysUsers getSysUser(Integer id);
	List<PymeSysUsers> getSysUsers();
}
