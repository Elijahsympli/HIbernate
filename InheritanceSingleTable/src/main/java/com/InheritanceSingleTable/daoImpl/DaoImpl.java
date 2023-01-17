package com.InheritanceSingleTable.daoImpl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.InheritanceSingleTable.config.HibernateUtil;
import com.InheritanceSingleTable.dao.Dao;
import com.InheritanceSingleTable.entity.FourWheels;
import com.InheritanceSingleTable.entity.TwoWheels;

public class DaoImpl implements Dao {
public void addVehicle() {
	Session session=HibernateUtil.activateSession();
	Transaction t =session.beginTransaction();
	
	TwoWheels tw=new TwoWheels();
	tw.setFuel("petrol");
	tw.setEnginePower("500cc");
	tw.setSpeed(200);
	tw.setVtype("Bike");
	tw.setPrice(2000000);
	tw.setModelno(1234);
	tw.setModelname("abc");
	tw.setAbs(true);
	tw.setTyretype(140);
	tw.setBtype("Sports bike");
	
	FourWheels fw=new FourWheels();
	fw.setFuel("electric");
	fw.setEnginePower("1000cc");
	fw.setSpeed(400);
	fw.setVtype("Car");
	fw.setPrice(8000000);
	fw.setModelno(12345);
	fw.setModelname("Swift");
	fw.setMusicSystem(true);
	fw.setEtype("auto");
	fw.setAc(true);
	session.save(tw);
	session.save(fw);
	t.commit();
	System.out.println("joining done....");
		
}
}
