package com.nagarro.assignment10.dao;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nagarro.assignment10.dto.LoginDto;
import com.nagarro.assignment10.model.User;

/**
 * Dao class for handling user related operations.
 * 
 * @author hiteshgarg
 */
@Repository
public class UserDaoImpl {

	/**
	 * Hibernate Session Factory Object.
	 */
	private SessionFactory sessionFactory;

	/**
	 * Check the existence of user in database.
	 * 
	 * @param loginDto
	 *            username to retrieve
	 * @return obtained user from database
	 */
	public User getUser(LoginDto loginDto) {
		/*return (User) this.sessionFactory.openSession().load(
				User.class, userName);*/
		Criteria cr= this.sessionFactory.openSession().createCriteria(User.class);
		cr.add(Restrictions.eq("userName", loginDto.getUserName()));
		cr.add(Restrictions.eq("password", loginDto.getPassword()));
		User user = (User) cr.uniqueResult();
		return user;
	}

	/**
	 * @return the sessionFactory
	 */
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	/**
	 * @param sessionFactory
	 *            the sessionFactory to set
	 */
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
		System.out.println("Factory Created " + this.sessionFactory);
	}

}
