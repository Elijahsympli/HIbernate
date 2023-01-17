package com.OneToOne.daoImpl;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.OneToOne.config.HibernateUtil;
import com.OneToOne.dao.CitizenDao;
import com.OneToOne.entity.Address;
import com.OneToOne.entity.Citizen;

public class CitizenDaoImpl implements CitizenDao{
	//creating instance objects so we can excess globally
	Session session =HibernateUtil.activateSession();
	Transaction t =session.beginTransaction();
	Scanner sc=new Scanner(System.in);
	

	public void addCitizen() {
		//adding citizen properties
		Citizen c =new Citizen();
		c.setCname("El");
		c.setSurname("Sy");
		c.setPhone(6546464646l);
		c.setEmail("Elsy@gmail.com");
		c.setDob("2001-01-28");
		
		//adding address properties
		Address a =new Address();
		a.setId(12346);
		a.setIdType("aadhar");
		a.setAddress("xyz1 House");
		a.setCity("Megha");
		a.setState("Kht");
		a.setPincode(793000);
		
		
		//setting aggregation property to citizen object
		c.setAddress(a);
		
		session.save(c);
		System.out.println("adding done");
		
		t.commit();
}

	public void fetchCitizen() {
@SuppressWarnings("rawtypes")
Query q=session.createQuery("from Citizen");

//list with Citizen entity
@SuppressWarnings("unchecked")
List<Citizen> a1=q.getResultList();

//traverse
Iterator<Citizen> itr=a1.iterator();
while(itr.hasNext()) {
Citizen c1=itr.next();
Address al=c1.getAddress();
//output
System.out.println("Customer details:"+c1.getCid()+" "+c1.getCname()+" "+c1.getSurname()+" "+c1.getPhone()+" "+c1.getEmail()+" "+c1.getDob());
System.out.println("Address details:"+al.getId()+" "+al.getIdType()+" "+al.getCity()+" "+al.getState()+" "+al.getAddress());

}
	}	
}
