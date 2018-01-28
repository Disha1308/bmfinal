package com.mkyong.controller;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class NumberDAO {
	
	private SessionFactory s;
	
	 public SessionFactory getS() {
		return s;
	}

	public void setS(SessionFactory s) {
		this.s = s;
	}
	

@Transactional
	public void addLog(Numbers n) {
	        Session session = this.s.getCurrentSession();
	        session.persist(n);
	        System.out.println("Entry saved in db");
	    }
}
