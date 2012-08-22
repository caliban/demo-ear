package ch.bd.demo.ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ch.bd.demo.entities.Person;

@Stateless
@LocalBean
@TransactionAttribute(TransactionAttributeType.SUPPORTS)
public class PersonBean {

	@PersistenceContext
	private EntityManager em; 
	
	public Person searchByName(String name)
	{
		return em.createNamedQuery("getByName", Person.class).setParameter("name", name).getSingleResult(); 
	}
}
