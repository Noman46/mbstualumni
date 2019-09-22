package com.noman.alumnibackend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.noman.alumnibackend.dao.ApplicationFormDao;
import com.noman.alumnibackend.dto.ApplicationForm;

@Repository("applicationFormDao")
@Transactional
public class ApplicationFormDaoImpl implements ApplicationFormDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public boolean saveApplicationForm(ApplicationForm applicationForm) {

		try {

			sessionFactory.getCurrentSession().persist(applicationForm);

			return true;
		} catch (Exception ex) {
			ex.printStackTrace();

			return false;
		}

	}

	@Override
	public List<ApplicationForm> getApplicationForms() {

		String selectActiveCategory = "FROM ApplicationForm WHERE isActive = :isActive";

		Query<ApplicationForm> query = sessionFactory.getCurrentSession().createQuery(selectActiveCategory);
		query.setParameter("isActive", true);

		return query.getResultList();
	}

	@Override
	public void updateisActive() {
		
		
		ApplicationForm applicationForm =sessionFactory.getCurrentSession().load(ApplicationForm.class, 111);
		applicationForm.setActive(false);
	}

	

}
