package com.noman.alumnibackend.daoImpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.noman.alumnibackend.dao.MbstuImagesDao;
import com.noman.alumnibackend.dto.MbstuImages;

@Repository("mbstuImagesDao")
@Transactional
public class MbstuImagesDaoImpl implements MbstuImagesDao{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean addMbstuImage(MbstuImages image) {
		
		try {
			sessionFactory.getCurrentSession().persist(image);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}

	@Override
	public List<Object[]> getAllTheMbstuImages() {
		String selectMbstuImages = "SELECT a.mbstuImageId,a.imageCode,a.likes FROM MbstuImages a";
		
		Query<Object[]> query = sessionFactory.getCurrentSession().createQuery(selectMbstuImages);
		return query.getResultList();
		
	}

}
