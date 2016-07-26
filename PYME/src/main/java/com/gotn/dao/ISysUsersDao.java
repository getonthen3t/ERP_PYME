package com.gotn.dao;

import java.util.List;

import com.gotn.model.PymeSysUsers;


//Elaborado por Juan Jara 25-07-2016 16:59

public interface ISysUsersDao{
	void guardarConsecutivo(PymeSysUsers entidad );
	void actualizarConsecutivo(PymeSysUsers entidad);
	void eliminarConsecutivo(PymeSysUsers entidad);
	PymeSysUsers getConsecutivo(Integer id);
	List<PymeSysUsers> getConsecutivos();
}