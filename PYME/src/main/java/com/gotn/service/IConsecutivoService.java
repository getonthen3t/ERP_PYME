package com.gotn.service;

import java.util.List;

import com.gotn.model.PymeConsecutivos;
/*Creado por: asanchez 2016-07-25*/
public interface IConsecutivoService {
	public boolean guardarConsecutivo(PymeConsecutivos pojo);
	public boolean actualizarConsecutivo(PymeConsecutivos pojo);
	public boolean eliminarConsecutivo(PymeConsecutivos pojo);
	public PymeConsecutivos getConsecutivo(int idConsecutivo);
	public List<PymeConsecutivos> getConsecutivos();
}
