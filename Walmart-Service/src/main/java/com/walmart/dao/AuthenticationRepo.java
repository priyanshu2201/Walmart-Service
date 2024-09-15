package com.walmart.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.walmart.model.User;

@Repository
public interface AuthenticationRepo extends JpaRepository<User, Integer> {

	@Query(value = "SELECT f_name FROM user WHERE email_id=?1" ,nativeQuery = true)//hql sql
	public List<String> findUserEmailId(String email );
}
