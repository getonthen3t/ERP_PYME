package com.gotn.dao;

import java.util.List;

import com.gotn.model.PymeTipoCambio;



//Elaborado por Juan Jara 25-07-2016 16:59

public interface ITipoCambioDao{
	void guardarConsecutivo(PymeTipoCambio entidad );
	void actualizarConsecutivo(PymeTipoCambio entidad);
	void eliminarConsecutivo(PymeTipoCambio entidad);
	PymeTipoCambio getConsecutivo(Integer id);
	List<PymeTipoCambio> getConsecutivos();
}