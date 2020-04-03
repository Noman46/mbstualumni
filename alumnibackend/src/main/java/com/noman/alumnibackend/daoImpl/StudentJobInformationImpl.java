package com.noman.alumnibackend.daoImpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.noman.alumnibackend.dao.StudentJobInformationDao;
import com.noman.alumnibackend.dto.StudentJobInformation;

@Repository("studentJobInformationDao")
@Transactional
public class StudentJobInformationImpl implements StudentJobInformationDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public boolean saveStudentJobInformation(StudentJobInformation studentJobInformation) {
		try {
            
			sessionFactory.getCurrentSession().persist(studentJobInformation);
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();

			return false;
		}
	}

}
