package com.noman.alumnibackend.daoImpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.noman.alumnibackend.dao.VerifiedStudentDao;
import com.noman.alumnibackend.dto.VerifiedStudent;

public class VerifiedStudentDaoImpl implements VerifiedStudentDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public boolean saveVerifiedStdent(VerifiedStudent verifiedStudent) {

		try {
            
			sessionFactory.getCurrentSession().persist(verifiedStudent);
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();

			return false;
		}
	}

}
