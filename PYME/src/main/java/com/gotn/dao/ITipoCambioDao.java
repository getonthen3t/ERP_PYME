package com.gotn.dao;

import java.util.List;

import com.gotn.model.PymeTipoCambio;



//Elaborado por Juan Jara 25-07-2016 16:59

public interface ITipoCambioDao{
	void guardarTipoCambio(PymeTipoCambio entidad );
	void actualizarTipoCambio(PymeTipoCambio entidad);
	void eliminarTipoCambio(PymeTipoCambio entidad);
	PymeTipoCambio getTipoCambio(Integer id);
	List<PymeTipoCambio> getTiposCambio();
}