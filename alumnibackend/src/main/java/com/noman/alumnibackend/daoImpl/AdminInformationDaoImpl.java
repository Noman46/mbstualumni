package com.noman.alumnibackend.daoImpl;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.noman.alumnibackend.dao.AdminInformtionDao;
import com.noman.alumnibackend.dto.AdminInformation;
import com.noman.alumnibackend.dto.ApplicationForm;

@Repository("AdminInformtionDao")
@Transactional
public class AdminInformationDaoImpl implements AdminInformtionDao{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public AdminInformation getAdminInformation(String username, String password) {
		String selectAdminInformation = "FROM AdminInformation WHERE admin_username = :adminUsername AND admin_password = :adminPassword ";
		Query<AdminInformation> query = sessionFactory.getCurrentSession().createQuery(selectAdminInformation);
		query.setParameter("adminUsername", username);
		query.setParameter("adminPassword", password);
		return query.getSingleResult();
		
	}

}
