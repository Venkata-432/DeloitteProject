package com.djobs.in.djobs.service;

import com.djobs.in.djobs.entity.FreeLancer;

public interface FreelancerService {
	
	public FreeLancer addFreelancer(FreeLancer free);
	
	public Long findById(Long id);
	public FreeLancer updateFreelancer(FreeLancer freer);

	public FreeLancer findByCredentials(String username,String password);

}
