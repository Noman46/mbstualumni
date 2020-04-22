package com.noman.alumnibackend.daoImpl;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.noman.alumnibackend.dao.StudentImagesDao;
import com.noman.alumnibackend.dto.StudentImages;

@Repository("studentImagesDao")
@Transactional
public class StudentImagesDaoImpl implements StudentImagesDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean addStudentImage(int applicationId, String verifiedStudentVersityId, StudentImages studentImages) {
		
		studentImages.setApplicationId(applicationId);
		studentImages.setVerifiedStudentVersityId(verifiedStudentVersityId);
		try {
			sessionFactory.getCurrentSession().persist(studentImages);
			return true;
		}catch(Exception ex) {
			ex.printStackTrace();

			return false;
		}
				
	}

	@Override
	public StudentImages getImageCode(int applicationId, String verifiedStudentVersityId) {
		String queryForStudentImage = "FROM StudentImages WHERE applicationId= :applicationId AND verifiedStudentVersityId= :verifiedStudentVersityId";	
		Query<StudentImages> query = sessionFactory.getCurrentSession().createQuery(queryForStudentImage);
		query.setParameter("applicationId", applicationId);
		query.setParameter("verifiedStudentVersityId", verifiedStudentVersityId);
		return query.getSingleResult();
	}

}
