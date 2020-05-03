package com.noman.alumnibackend.daoImpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.noman.alumnibackend.dao.StudentPostDao;
import com.noman.alumnibackend.dto.StudentPost;

@Repository("studentPostDaoImpl")
@Transactional
public class StudentPostDaoImpl implements StudentPostDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public boolean saveStudentPost(StudentPost studentPost) {
	try {
            
			sessionFactory.getCurrentSession().persist(studentPost);
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();

			return false;
		}
	}

}
