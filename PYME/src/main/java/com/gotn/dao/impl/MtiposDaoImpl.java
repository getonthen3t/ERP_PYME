package com.gotn.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gotn.dao.IMtiposDao;
import com.gotn.model.PymeConsecutivos;
import com.gotn.model.PymeMtipos;
/*Creado por ASANCHEZ EL 2016-07-25*/
@Repository("mtiposDao") /*La variable inyectada en el service se debe llamar igual*/
public class MtiposDaoImpl implements IMtiposDao{
	@Autowired
	private SessionFactory sessionFactory; /*Inyecta el bean que se declaro en el applicationContext.xml para el session factory*/
	
	public Session getSession(){  /*Retorna la session activa*/
		return sessionFactory.getCurrentSession();
	}
	public Criteria crearCriteria(){ /*Se utiliza para armar criterios de busqueda segun la analogia de hibernate orientada a objetos*/
		return getSession().createCriteria(PymeMtipos.class);
		
	}
	public void guardarMtipos(PymeMtipos entidad) {
		getSession().save(entidad);
		
	}

	public void actualizarMtipos(PymeMtipos entidad) {
		getSession().update(entidad);
		
	}

	public void eliminarMtipos(PymeMtipos entidad) {
		getSession().delete(entidad);
		
	}

	public PymeMtipos getMtipo(Integer id) {
		return  (PymeMtipos) getSession().get(PymeMtipos.class, id);
	}

	public List<PymeMtipos> getMtipos() {
		return crearCriteria().list();
	}

}
