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
@Repository("dentradasDaoImpl") /*La variable inyectada en el service se debe llamar igual*/
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
		// TODO Auto-generated method stub
		
	}
	public void actualizarConsecutivo(PymeDentradas entidad) {
		// TODO Auto-generated method stub
		
	}
	public void eliminarConsecutivo(PymeDentradas entidad) {
		// TODO Auto-generated method stub
		
	}
	public PymeDentradas getConsecutivo(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	public List<PymeDentradas> getConsecutivos() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
