package com.gotn.service;

import java.util.List;

import com.gotn.model.PymeFacncDetCli;

public interface IFacncDetCliService {
	public boolean guardarFacncDetCli(PymeFacncDetCli pojo);
	public boolean actualizarFacncDetCli(PymeFacncDetCli pojo);
	public boolean eliminarFacncDetCli(PymeFacncDetCli pojo);
	public PymeFacncDetCli getFacncDetCli(int idEtapa);
	public List<PymeFacncDetCli> getFacncDetClis();
}
