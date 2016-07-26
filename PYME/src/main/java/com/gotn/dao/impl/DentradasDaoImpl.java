package com.gotn.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.gotn.dao.IDentradasDao;
import com.gotn.model.PymeDentradas;


/*Creado por JJARA EL 2016-07-25*/
@Repository("dentradasDao") /*La variable inyectada en el service se debe llamar igual*/
public class DentradasDaoImpl implements IDentradasDao {
	@Autowired
	private SessionFactory sessionFactory; /*Inyecta el bean que se declaro en el applicationContext.xml para el session factory*/
	
	public Session getSession(){  /*Retorna la session activa*/
		return sessionFactory.getCurrentSession();
	}
	public Criteria crearCriteria(){ /*Se utiliza para armar criterios de busqueda segun la analogia de hibernate orientada a objetos*/
		return getSession().createCriteria(PymeDentradas.class);
		
	}
	public void guardarConsecutivo(PymeDentradas entidad) {
		getSession().save(entidad);
	}

	public void actualizarConsecutivo(PymeDentradas entidad) {
		getSession().update(entidad);
	}

	public void eliminarConsecutivo(PymeDentradas entidad) {
		getSession().delete(entidad);
	}

	public PymeDentradas getConsecutivo(Integer id) {
		return  (PymeDentradas) getSession().get(PymeDentradas.class, id);
	}
	public List<PymeDentradas> getConsecutivos() {
		return crearCriteria().list();
	}

}
