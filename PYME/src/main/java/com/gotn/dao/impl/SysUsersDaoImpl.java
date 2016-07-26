package com.gotn.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gotn.dao.ISysUsersDao;
import com.gotn.model.PymeConsecutivos;
import com.gotn.model.PymeSysUsers;
/*Creado por ASANCHEZ EL 2016-07-25*/
@Repository("sysUsersDao") /*La variable inyectada en el service se debe llamar igual*/
public class SysUsersDaoImpl implements ISysUsersDao   {
	@Autowired
	private SessionFactory sessionFactory; /*Inyecta el bean que se declaro en el applicationContext.xml para el session factory*/
	
	public Session getSession(){  /*Retorna la session activa*/
		return sessionFactory.getCurrentSession();
	}
	public Criteria crearCriteria(){ /*Se utiliza para armar criterios de busqueda segun la analogia de hibernate orientada a objetos*/
		return getSession().createCriteria(PymeSysUsers.class);
		
	}
	public void guardarSysUsers(PymeSysUsers entidad) {
		getSession().save(entidad);
		
	}
	public void actualizarSysUser(PymeSysUsers entidad) {
		getSession().update(entidad);
		
	}
	public void eliminarSysUser(PymeSysUsers entidad) {
		getSession().delete(entidad);
		
	}
	public PymeSysUsers getSysUser(Integer id) {
		return  (PymeSysUsers) getSession().get(PymeSysUsers.class, id);
	}
	public List<PymeSysUsers> getSysUsers() {
		return crearCriteria().list();
	}
	

}
