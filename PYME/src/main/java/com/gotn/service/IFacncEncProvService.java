package com.gotn.service;

import java.util.List;

import com.gotn.model.PymeFacncEncProv;



public interface IFacncEncProvService {
	public boolean guardarFacncEncProv(PymeFacncEncProv pojo);
	public boolean actualizarFacncEncProv(PymeFacncEncProv pojo);
	public boolean eliminarFacncEncProv(PymeFacncEncProv pojo);
	public PymeFacncEncProv getFacncEncProv(int idEtapa);
	public List<PymeFacncEncProv> getFacncEncProvs();
}
