package com.djobs.in.djobs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.djobs.in.djobs.entity.FreeLancer;

public interface FreelancerRepo extends JpaRepository<FreeLancer, Long> {

	@Query(value="select * from freelancer where username=? and password=?", nativeQuery=true)
	FreeLancer findByCredentialsRepo(String username, String password);
	
	

}
