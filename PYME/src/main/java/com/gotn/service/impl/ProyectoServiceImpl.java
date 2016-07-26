package com.gotn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gotn.dao.IFacncDetCliDao;
import com.gotn.dao.IProyectoDao;
import com.gotn.model.PymeProyecto;
import com.gotn.service.IProyectoService;
/*Creado por: jjara 2016-07-26*/
@Service("proyectoService")
public class ProyectoServiceImpl implements IProyectoService {
	@Autowired
	private IProyectoDao proyectoDao;
	public boolean guardarProyecto(PymeProyecto pojo) {
		try {
			proyectoDao.guardarProyecto(pojo);
			return true;
		} catch (Exception e) {
			System.out.println("Error guardando Proyecto >> "+e);
			return false;
		}
	}

	public boolean actualizarProyecto(PymeProyecto pojo) {
		try {
			proyectoDao.actualizarProyecto(pojo);
			return true;
		} catch (Exception e) {
			System.out.println("Error actualizando Proyecto >> "+e);
			return false;
		}
	}

	public boolean eliminarProyecto(PymeProyecto pojo) {
		try {
			proyectoDao.eliminarProyecto(pojo);
			return true;
		} catch (Exception e) {
			System.out.println("Error eliminando Proyecto >> "+e);
			return false;
		}
	}

	public PymeProyecto getProyecto(int idProyecto) {
		try {
			return proyectoDao.getProyecto(idProyecto);
		} catch (Exception e) {
			System.out.println("Error obteniendo Proyecto >> "+e);
			return null;
		}
	}

	public List<PymeProyecto> getProyectos() {
		try {
			return proyectoDao.getProyectos();
		} catch (Exception e) {
			System.out.println("Error guardando Proyecto >> "+e);
			return null;
		}
	}

}
