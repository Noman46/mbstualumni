package com.noman.alumnibackend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.noman.alumnibackend.dao.StudentPersonalInformationDao;
import com.noman.alumnibackend.dto.StudentPersonalInformation;

@Repository("studentPersonalInformationDao")
@Transactional
public class StudentPersonalInformationDaoImpl implements StudentPersonalInformationDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public boolean saveStudentPersonalInformation(StudentPersonalInformation studentPersonalInformation) {

		try {

			sessionFactory.getCurrentSession().persist(studentPersonalInformation);
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();

			return false;
		}
	}

	@Override
	public List<Object[]> getStudentByBloodGroup(String bloodGroup) {
		
		
		
			String studentByBloodGroup = "FROM StudentPersonalInformation WHERE studentBloodGroup = :studentBloodGroup";
			Query<Object[]> query = sessionFactory.getCurrentSession().createQuery(studentByBloodGroup);
			query.setParameter("studentBloodGroup", bloodGroup);
			return query.getResultList();
		
	}
	

}
