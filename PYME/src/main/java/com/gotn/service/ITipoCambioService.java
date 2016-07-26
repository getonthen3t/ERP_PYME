package com.gotn.service;

import java.util.List;

import com.gotn.model.PymeTipoCambio;

public interface ITipoCambioService {
	public boolean guardarTipoCambio(PymeTipoCambio pojo);
	public boolean actualizarTipoCambio(PymeTipoCambio pojo);
	public boolean eliminarTipoCambio(PymeTipoCambio pojo);
	public PymeTipoCambio getTipoCambio(int idTipoCambio);
	public List<PymeTipoCambio> getTipoCambios();
}
