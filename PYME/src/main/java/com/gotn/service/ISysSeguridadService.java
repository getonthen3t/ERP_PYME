package com.gotn.service;

import java.util.List;

import com.gotn.model.PymeSysSeguridad;
/*Creado por: asanchez 2016-07-25*/
public interface ISysSeguridadService {
	public boolean guardarSysSeguridad(PymeSysSeguridad pojo);
	public boolean actualizarSysSeguridad(PymeSysSeguridad pojo);
	public boolean eliminarSysSeguridad(PymeSysSeguridad pojo);
	public PymeSysSeguridad getSysSeguridad(int idSysSeguridad);
	public List<PymeSysSeguridad> getSysSeguridades();
}
