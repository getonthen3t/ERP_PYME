package com.gotn.service;

import java.util.List;

import com.gotn.model.PymeSysPermisos;

/*Creado por: asanchez 2016-07-25*/
public interface ISysPermisos {
	public boolean guardarSysPermiso(PymeSysPermisos pojo);
	public boolean actualizarSysPermiso(PymeSysPermisos pojo);
	public boolean eliminarSysPermiso(PymeSysPermisos pojo);
	public PymeSysPermisos getSysPermiso(int idSysPermiso);
	public List<PymeSysPermisos> getSysPermisos();
}
