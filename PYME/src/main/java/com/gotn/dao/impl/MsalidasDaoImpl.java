package com.gotn.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gotn.dao.IMsalidasDao;
import com.gotn.model.PymeConsecutivos;
import com.gotn.model.PymeMsalidas;
/*Creado por ASANCHEZ EL 2016-07-25*/
//@Repository("msalidasDao") /*La variable inyectada en el service se debe llamar igual*/
@Repository
public class MsalidasDaoImpl implements IMsalidasDao{
	@Autowired
	private SessionFactory sessionFactory; /*Inyecta el bean que se declaro en el applicationContext.xml para el session factory*/
	
	public Session getSession(){  /*Retorna la session activa*/
		return sessionFactory.getCurrentSession();
	}
	public Criteria crearCriteria(){ /*Se utiliza para armar criterios de busqueda segun la analogia de hibernate orientada a objetos*/
		return getSession().createCriteria(PymeMsalidas.class);
		
	}
	
	public void guardarMsalidas(PymeMsalidas entidad) {
		getSession().save(entidad);
		
	}

	public void actualizarMsalidas(PymeMsalidas entidad) {
		getSession().update(entidad);
		
	}

	public void eliminarMsalidas(PymeMsalidas entidad) {
		getSession().delete(entidad);
		
	}

	public PymeMsalidas getMsalida(Integer id) {
		return  (PymeMsalidas) getSession().get(PymeMsalidas.class, id);
	}

	public List<PymeMsalidas> getMsalidas() {
		return crearCriteria().list();
	}

}
