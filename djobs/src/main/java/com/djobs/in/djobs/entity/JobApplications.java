package com.djobs.in.djobs.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="jobapplications")
public class JobApplications {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@OneToOne
	private Job job;
	@Column(name="appliedDate")
	private LocalDateTime appliedDate;
	@Column(name="coverLetter")
	private String coverLetter;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LocalDateTime getAppliedDate() {
		return appliedDate;
	}
	public void setAppliedDate(LocalDateTime appliedDate) {
		this.appliedDate = appliedDate;
	}
	public String getCoverLetter() {
		return coverLetter;
	}
	public void setCoverLetter(String coverLetter) {
		this.coverLetter = coverLetter;
	}
	
	
}
