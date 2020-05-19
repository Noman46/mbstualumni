package com.noman.alumnibackend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.noman.alumnibackend.dao.StudentPostDao;
import com.noman.alumnibackend.dto.ApplicationForm;
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

	@Override
	@SuppressWarnings("unchecked")
	public List<Object[]> getPosts() {
		String selectPost = "SELECT a.post,a.postId,a.applicationId,b.applicationId,b.studentName FROM StudentPost a, ApplicationForm b WHERE a.applicationId = b.applicationId";
		
		Query<Object[]> query = sessionFactory.getCurrentSession().createQuery(selectPost);
		return query.getResultList();
	}


	

}
