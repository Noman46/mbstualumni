package com.noman.alumnibackend.daoImpl;

import org.hibernate.SessionFactory;
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
	
	@Autowired
	private VerifiedStudent verifiedStudent;
	
	@Autowired
	private RandomCredentials randomCredentials;

	@Override
	@Transactional
	public boolean saveVerifiedStdent(ApplicationForm applicationForm) {

		verifiedStudent.setApplicationId(applicationForm.getApplicationId());
		verifiedStudent.setVerifiedStudentEmail(applicationForm.getStudentemail());
		verifiedStudent.setVerifiedStudentPassword(randomCredentials.giveRandomPassword());
		verifiedStudent.setVerifiedStudentVersityId(applicationForm.getVersityId());
		
		try {
            
			sessionFactory.getCurrentSession().persist(verifiedStudent);
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();

			return false;
		}
	}

}
