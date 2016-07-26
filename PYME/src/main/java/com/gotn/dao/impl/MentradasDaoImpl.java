package com.gotn.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.gotn.dao.IMentradasDao;
import com.gotn.model.PymeDlistaPrecios;
import com.gotn.model.PymeMentradas;
import antlr.collections.List;



/*Creado por JJARA EL 2016-07-25*/
@Repository("mentradasDao") /*La variable inyectada en el service se debe llamar igual*/
public class MentradasDaoImpl implements IMentradasDao {
	@Autowired
	private SessionFactory sessionFactory; /*Inyecta el bean que se declaro en el applicationContext.xml para el session factory*/
	
	public Session getSession(){  /*Retorna la session activa*/
		return sessionFactory.getCurrentSession();
	}
	public Criteria crearCriteria(){ /*Se utiliza para armar criterios de busqueda segun la analogia de hibernate orientada a objetos*/
		return getSession().createCriteria(PymeMentradas.class);
		
	}
	public void guardarMentradas(PymeMentradas entidad) {
		// TODO Auto-generated method stub
		getSession().save(entidad);
		
		
	}
	public void actualizarMentradas(PymeMentradas entidad) {
		// TODO Auto-generated method stub
		getSession().update(entidad);
	}
	public void eliminarMentradas(PymeMentradas entidad) {
		// TODO Auto-generated method stub
		getSession().delete(entidad);
		
	}
	public PymeMentradas getMentrada(Integer id) {
		// TODO Auto-generated method stub
		return  (PymeMentradas) getSession().get(PymeMentradas.class, id);
	}
	public java.util.List<PymeMentradas> getMentradas() {
		// TODO Auto-generated method stub
		return crearCriteria().list();
	}
}
