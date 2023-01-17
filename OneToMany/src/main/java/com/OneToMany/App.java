package com.OneToMany;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.OneToMany.entity.Cart;
import com.OneToMany.entity.Items;

public class App{
	public static void main(String args[]) {
		SessionFactory s=new Configuration().configure().buildSessionFactory();
		Session session=s.openSession();
		Transaction t=session.beginTransaction();
		
		Items i=new Items();
		i.setItemname("bottles");
		i.setPrice(20000);
		i.setQuantity(3);
		
		Items i2=new Items();
		i2.setItemname("jeans");
		i2.setPrice(3000);
		i2.setQuantity(5);
		
		Items i3=new Items();
		i3.setItemname("watches");
		i3.setPrice(5000);
		i3.setQuantity(1);
		
		Items i4=new Items();
		i4.setItemname("bags");
		i4.setPrice(2035);
		i4.setQuantity(3);
		
		ArrayList<Items>al=new ArrayList<Items>();
		al.add(i);
		al.add(i2);
		al.add(i3);
		al.add(i4);
		
		Cart c=new Cart();
		c.setName("Peso");
		c.setItem(al);
		session.save(c);
		t.commit();
		System.out.println("Inserted");
	}
}
