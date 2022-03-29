package com.djobs.in.djobs.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.djobs.in.djobs.entity.FreeLancer;
import com.djobs.in.djobs.repository.FreelancerRepo;

public class FreeLancerServiceImplementation implements FreelancerService{

	@Autowired
	private FreelancerRepo freelancerrepo;
	
	@Override
	public FreeLancer addFreelancer(FreeLancer free) {
		FreeLancer fl=freelancerrepo.save(free);
		
		return fl;
	}

	@Override
	public Long findById(Long id) {
		Optional<FreeLancer>  fl=freelancerrepo.findById(id);
		FreeLancer fr=fl.get();
		return fr.getId();
	}

	@Override
	public FreeLancer updateFreelancer(FreeLancer freer) {
		FreeLancer fl=freelancerrepo.save(freer);
		
		return fl;
	}

	@Override
	public FreeLancer findByCredentials(String username,String password) {
		FreeLancer fl=freelancerrepo.findByCredentialsRepo(username,password);
		
		return fl;
	}

}
