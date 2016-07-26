package com.gotn.dao;

import java.util.List;

import com.gotn.model.PymeSysPermisos;

//Elaborado por Juan Jara 25-07-2016 16:59

public interface ISysPermisosDao{
	void guardarConsecutivo(PymeSysPermisos entidad );
	void actualizarConsecutivo(PymeSysPermisos entidad);
	void eliminarConsecutivo(PymeSysPermisos entidad);
	PymeSysPermisos getConsecutivo(Integer id);
	List<PymeSysPermisos> getConsecutivos();
}
