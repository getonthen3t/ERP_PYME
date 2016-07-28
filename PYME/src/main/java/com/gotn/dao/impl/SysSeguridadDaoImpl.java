package com.gotn.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gotn.dao.ISysSeguridadDao;
import com.gotn.model.PymeConsecutivos;
import com.gotn.model.PymeSysSeguridad;
//@Repository("sysSeguridadDao") /*La variable inyectada en el service se debe llamar igual*/
@Repository
public class SysSeguridadDaoImpl implements ISysSeguridadDao{
	@Autowired
	private SessionFactory sessionFactory; /*Inyecta el bean que se declaro en el applicationContext.xml para el session factory*/
	
	public Session getSession(){  /*Retorna la session activa*/
		return sessionFactory.getCurrentSession();
	}
	public Criteria crearCriteria(){ /*Se utiliza para armar criterios de busqueda segun la analogia de hibernate orientada a objetos*/
		return getSession().createCriteria(PymeSysSeguridad.class);
		
	}
	public void guardarSysSeguridad(PymeSysSeguridad entidad) {
		getSession().save(entidad);
		
	}

	public void actualizarSysSeguridad(PymeSysSeguridad entidad) {
		getSession().update(entidad);
		
	}

	public void eliminarSysSeguridad(PymeSysSeguridad entidad) {
		getSession().delete(entidad);
	}

	public PymeSysSeguridad getSysSeguridad(Integer id) {
		return  (PymeSysSeguridad) getSession().get(PymeSysSeguridad.class, id);
	}

	public List<PymeSysSeguridad> getSysSeguridades() {
		return crearCriteria().list();
	}

}
