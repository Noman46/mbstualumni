package com.noman.alumnibackend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.noman.alumnibackend.dao.BloodGroupDao;

@Repository("bloodGroupDaoImpl")
@Transactional
public class BloodGroupDaoImpl implements BloodGroupDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	@SuppressWarnings("unchecked")
	public List<Object[]> getBloodDonor(String bloodGroup) {
		String selectBloodDonor = "SELECT a.studentname,a.applicationid,a.versityid,"
				+ "b.applicationid,b.verifiedstudentversityid,b.studentbloodgroup"
				+ " FROM APPLICATIONFORM a, STUDENTPERSONALINFORMATION b "
	            + "WHERE a.applicationId = b.applicationId AND b.studentbloodgroup = :bloodGroup";
		Query<Object[]> query = sessionFactory.getCurrentSession().createQuery(selectBloodDonor);
		query.setParameter("bloodGroup", bloodGroup);
		return query.getResultList();
	}

}
