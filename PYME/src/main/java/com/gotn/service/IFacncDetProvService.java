package com.gotn.service;

import java.util.List;
import com.gotn.model.PymeFacncDetProv;

public interface IFacncDetProvService {
	public boolean guardarFacncDetProv(PymeFacncDetProv pojo);
	public boolean actualizarFacncDetProv(PymeFacncDetProv pojo);
	public boolean eliminarFacncDetProv(PymeFacncDetProv pojo);
	public PymeFacncDetProv getFacncDetProv(int idEtapa);
	public List<PymeFacncDetProv> getFacncDetProvs();
}
