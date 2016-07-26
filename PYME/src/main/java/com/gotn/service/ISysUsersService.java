package com.gotn.service;

import java.util.List;

import com.gotn.model.PymeSysUsers;

public interface ISysUsersService {
	public boolean guardarSysUser(PymeSysUsers pojo);
	public boolean actualizarSysUser(PymeSysUsers pojo);
	public boolean eliminarSysUser(PymeSysUsers pojo);
	public PymeSysUsers getSysUserint (int idSysUser);
	public List<PymeSysUsers> getSysUsers();
}
