package com.gotn.dao;

import java.util.List;

import com.gotn.model.PymeSysPermisos;

//Elaborado por Juan Jara 25-07-2016 16:59

public interface ISysPermisosDao{
	void guardarSysPermisos(PymeSysPermisos entidad );
	void actualizarSysPermisos(PymeSysPermisos entidad);
	void eliminarSysPermisos(PymeSysPermisos entidad);
	PymeSysPermisos getSysPermiso(Integer id);
	List<PymeSysPermisos> getSysPermisos();
}
