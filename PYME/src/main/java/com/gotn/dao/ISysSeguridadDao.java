package com.gotn.dao;

import java.util.List;

import com.gotn.model.PymeSysSeguridad;



//Elaborado por Juan Jara 25-07-2016 16:59

public interface ISysSeguridadDao{
	void guardarConsecutivo(PymeSysSeguridad entidad );
	void actualizarConsecutivo(PymeSysSeguridad entidad);
	void eliminarConsecutivo(PymeSysSeguridad entidad);
	PymeSysSeguridad getConsecutivo(Integer id);
	List<PymeSysSeguridad> getConsecutivos();
}
