package com.gotn.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gotn.dao.ISociosDao;
import com.gotn.model.PymeConsecutivos;
import com.gotn.model.PymeSocios;
@Repository("sociosDao") /*La variable inyectada en el service se debe llamar igual*/
public class SociosDaoImpl implements ISociosDao{
	@Autowired
	private SessionFactory sessionFactory; /*Inyecta el bean que se declaro en el applicationContext.xml para el session factory*/
	
	public Session getSession(){  /*Retorna la session activa*/
		return sessionFactory.getCurrentSession();
	}
	public Criteria crearCriteria(){ /*Se utiliza para armar criterios de busqueda segun la analogia de hibernate orientada a objetos*/
		return getSession().createCriteria(PymeSocios.class);
		
	}
	
	public void guardarSocio(PymeSocios entidad) {
		getSession().save(entidad);
		
	}

	public void actualizarSocio(PymeSocios entidad) {
		getSession().update(entidad);
		
	}

	public void eliminarSocio(PymeSocios entidad) {
		getSession().delete(entidad);
		
	}

	public PymeSocios getSocio(Integer id) {
		return  (PymeSocios) getSession().get(PymeSocios.class, id);
	}

	public List<PymeSocios> getSocios() {
		return crearCriteria().list();
	}

}
