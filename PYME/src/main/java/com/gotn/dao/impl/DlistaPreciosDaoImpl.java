package com.gotn.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.gotn.dao.IDentradasDao;
import com.gotn.dao.IDlistaPreciosDao;
import com.gotn.model.PymeDlistaPrecios;



/*Creado por JJARA EL 2016-07-25*/
@Repository("dlistaPreciosDaoImpl") /*La variable inyectada en el service se debe llamar igual*/
public class DlistaPreciosDaoImpl implements IDlistaPreciosDao {
	@Autowired
	private SessionFactory sessionFactory; /*Inyecta el bean que se declaro en el applicationContext.xml para el session factory*/
	
	public Session getSession(){  /*Retorna la session activa*/
		return sessionFactory.getCurrentSession();
	}
	public Criteria crearCriteria(){ /*Se utiliza para armar criterios de busqueda segun la analogia de hibernate orientada a objetos*/
		return getSession().createCriteria(PymeDlistaPrecios.class);
		
	}
	public void guardarConsecutivo(PymeDlistaPrecios entidad) {
		getSession().save(entidad);
	}

	public void actualizarConsecutivo(PymeDlistaPrecios entidad) {
		getSession().update(entidad);
	}

	public void eliminarConsecutivo(PymeDlistaPrecios entidad) {
		getSession().delete(entidad);
	}

	public PymeDlistaPrecios getConsecutivo(Integer id) {
		return  (PymeDlistaPrecios) getSession().get(PymeDlistaPrecios.class, id);
	}
	public List<PymeDlistaPrecios> getConsecutivos() {
		return crearCriteria().list();
	}

}