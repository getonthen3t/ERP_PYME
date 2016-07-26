package com.gotn.dao;

import java.util.List;

import com.gotn.model.PymeSysSeguridad;



//Elaborado por Juan Jara 25-07-2016 16:59

public interface ISysSeguridadDao{
	void guardarSysSeguridad(PymeSysSeguridad entidad );
	void actualizarSysSeguridad(PymeSysSeguridad entidad);
	void eliminarSysSeguridad(PymeSysSeguridad entidad);
	PymeSysSeguridad getSysSeguridad(Integer id);
	List<PymeSysSeguridad> getSysSeguridades();
}
