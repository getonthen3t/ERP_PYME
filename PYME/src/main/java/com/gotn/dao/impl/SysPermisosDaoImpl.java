package com.gotn.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gotn.dao.ISysPermisosDao;
import com.gotn.model.PymeConsecutivos;
import com.gotn.model.PymeSysPermisos;
//@Repository("sysPermisosDao") /*La variable inyectada en el service se debe llamar igual*/
@Repository
public class SysPermisosDaoImpl implements ISysPermisosDao{
	@Autowired
	private SessionFactory sessionFactory; /*Inyecta el bean que se declaro en el applicationContext.xml para el session factory*/
	
	public Session getSession(){  /*Retorna la session activa*/
		return sessionFactory.getCurrentSession();
	}
	public Criteria crearCriteria(){ /*Se utiliza para armar criterios de busqueda segun la analogia de hibernate orientada a objetos*/
		return getSession().createCriteria(PymeSysPermisos.class);
		
	}
	
	public void guardarSysPermisos(PymeSysPermisos entidad) {
		getSession().save(entidad);
		
	}

	public void actualizarSysPermisos(PymeSysPermisos entidad) {
		getSession().update(entidad);	
	}

	public void eliminarSysPermisos(PymeSysPermisos entidad) {
		getSession().delete(entidad);
	}

	public PymeSysPermisos getSysPermiso(Integer id) {
		return  (PymeSysPermisos) getSession().get(PymeSysPermisos.class, id);
	}

	public List<PymeSysPermisos> getSysPermisos() {
		return crearCriteria().list();
	}

}
