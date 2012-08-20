package ch.bd.demo.ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

@Stateless
@LocalBean
@TransactionAttribute(TransactionAttributeType.SUPPORTS)
public class NoInterfaceLocalBean {

	public String greeting()
	{
		return "greeting earthlings"; 
	}
}
