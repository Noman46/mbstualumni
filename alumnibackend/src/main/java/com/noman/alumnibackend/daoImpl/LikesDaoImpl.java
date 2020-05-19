package com.noman.alumnibackend.daoImpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.noman.alumnibackend.dao.LikesDao;
import com.noman.alumnibackend.dto.Likes;

@Repository("likesDao")
@Transactional
public class LikesDaoImpl implements LikesDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public boolean saveLike(Likes like) {
		try {

			sessionFactory.getCurrentSession().persist(like);
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();

			return false;
		}
		
	}

}
