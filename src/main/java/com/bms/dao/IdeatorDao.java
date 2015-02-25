package com.bms.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.bms.service.vo.Creator;
import com.bms.service.vo.HibernateUtil;
import com.bms.service.vo.Ideator;
import com.bms.service.vo.UserProfile;

public class IdeatorDao {

	private final SessionFactory sessionFactory = getSessionFactory();
	
	protected SessionFactory getSessionFactory() {
		try {
			return HibernateUtil.getSessionFactory();
		} catch (Exception e) {
			//TODO: Will be logged at error level later
			System.out.println("Could not locate SessionFactory in JNDI" + e);
			
			throw new IllegalStateException(
			"Could not locate SessionFactory in JNDI");
		}
	}
	
	public void persist(Ideator transientInstance) {
		//TODO: Will be logged at debug level later
		System.out.println("persisting GafContext instance");
		
		Session session = null;
		Transaction transaction = null;
		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			session.saveOrUpdate(transientInstance);
			transaction.commit();
			//TODO: Will be logged at debug level later
			System.out.println("persist successful");
		} catch (RuntimeException re) {
			//TODO: Will be logged at error level later
			System.out.println("persist failed" + re);
			
			if(transaction != null){
				transaction.rollback();
			}
			throw re;
		}finally {
			if(session != null && session.isOpen()){
				session.close();
			}
		}
	}
	
	public Ideator findIdeatorByUserId(Long id) {
		System.out.println("getting Ideator instance with id: " + id);
		Session session = null;
		try {
			session = sessionFactory.openSession();
			Ideator instance = (Ideator) session.get(
							"com.bms.service.vo.Ideator",
							id);
			if (instance == null) {
				//TODO: Will be logged at debug level later
				System.out.println("get successful, no instance found");
			} else {
				//TODO: Will be logged at debug level later
				System.out.println("get successful, instance found");
			}			
			return instance;
		} catch (RuntimeException re) {
			//TODO: Will be logged at error level later
			System.out.println("get failed" + re);
			throw re;
		}finally {
			if(session != null && session.isOpen()){
				session.close();
			}
		}
	}
	
	public Ideator findIdeatorByUserName(String userName) {
		System.out.println("getting Ideator instance with id: " + userName);
		Session session = null;
		try {
			session = sessionFactory.openSession();
//			Ideator instance = (Ideator) session.get(
//							"com.bms.service.vo.Ideator",
//							id);
			List ideatorList = session.createQuery(" from Ideator i where i.userName = '" + userName + "'").list();
			
			Ideator instance = (Ideator)ideatorList.get(0);
			if (instance == null) {
				//TODO: Will be logged at debug level later
				System.out.println("get successful, no instance found");
			} else {
				//TODO: Will be logged at debug level later
				System.out.println("get successful, instance found");
			}			
			return instance;
		} catch (RuntimeException re) {
			//TODO: Will be logged at error level later
			System.out.println("get failed" + re);
			throw re;
		}finally {
			if(session != null && session.isOpen()){
				session.close();
			}
		}
	}
}
