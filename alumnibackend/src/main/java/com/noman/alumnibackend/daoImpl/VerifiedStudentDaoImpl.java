package com.noman.alumnibackend.daoImpl;


import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.noman.alumnibackend.dao.VerifiedStudentDao;
import com.noman.alumnibackend.dto.ApplicationForm;
import com.noman.alumnibackend.dto.VerifiedStudent;
import com.noman.alumnibackend.utility.RandomCredentials;


@Repository("verifiedStudentDao")
@Transactional
public class VerifiedStudentDaoImpl implements VerifiedStudentDao {

	@Autowired
	private SessionFactory sessionFactory;
	

	
	

	@Override
	public VerifiedStudent loginToSystemAsStudent(VerifiedStudent verifiedStudent) {
		String selectVerifiedStudent = "FROM VerifiedStudent WHERE verifiedStudentEmail = :verifiedStudentEmail AND verifiedStudentPassword = :verifiedStudentPassword";
		
		Query<VerifiedStudent> query = sessionFactory.getCurrentSession().createQuery(selectVerifiedStudent);
		query.setParameter("verifiedStudentEmail", verifiedStudent.getVerifiedStudentEmail());
		query.setParameter("verifiedStudentPassword", verifiedStudent.getVerifiedStudentPassword());
		return query.getSingleResult();
	}

}
