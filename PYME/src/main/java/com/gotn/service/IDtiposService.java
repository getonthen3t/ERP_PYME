package com.gotn.service;

import java.util.List;
import com.gotn.model.PymeDtipos;

public interface IDtiposService {
	public boolean guardarDtipos(PymeDtipos pojo);
	public boolean actualizarDtipos(PymeDtipos pojo);
	public boolean eliminarDtipos(PymeDtipos pojo);
	public PymeDtipos getDtipo(int idDtipos);
	public List<PymeDtipos> getDtipos();
}
