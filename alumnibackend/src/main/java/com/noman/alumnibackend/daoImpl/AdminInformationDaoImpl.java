package com.noman.alumnibackend.daoImpl;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.noman.alumnibackend.dao.AdminInformationDao;
import com.noman.alumnibackend.dto.AdminInformation;


@Repository("adminInformationDao")
@Transactional
public class AdminInformationDaoImpl implements AdminInformationDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public AdminInformation getAdmin(String username, String password) {
		String selectAdminInfo = "FROM AdminInformation A WHERE A.adminUsername = :username AND A.adminPassword = :password";
		Query<AdminInformation> query = sessionFactory.getCurrentSession().createQuery(selectAdminInfo);
		query.setParameter("username", username);
		query.setParameter("password", password);
		System.out.println("inside the do -----------------------");
		return query.getSingleResult();
		
	}

}
