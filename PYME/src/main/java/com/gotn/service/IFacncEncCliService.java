package com.gotn.service;

import java.util.List;

import com.gotn.model.PymeFacncEncCli;



public interface IFacncEncCliService {
	public boolean guardarFacncEncCli(PymeFacncEncCli pojo);
	public boolean actualizarFacncEncCli(PymeFacncEncCli pojo);
	public boolean eliminarFacncEncCli(PymeFacncEncCli pojo);
	public PymeFacncEncCli getFacncEncCli(int idEtapa);
	public List<PymeFacncEncCli> getFacncEncClis();
}
