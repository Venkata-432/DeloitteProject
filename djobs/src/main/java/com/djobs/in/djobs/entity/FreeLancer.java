package com.djobs.in.djobs.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="freelancer")
public class FreeLancer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name="username")
	private String userName;
    @Column(name="firstname")
	private String firstName;
    @Column(name="lastname")
	private String lastName;
    @Column(name="password")
	private String password;
    @OneToMany
	private List<JobApplications> appliedJobs;
    @OneToMany
	private List<Feedback> feedbacks;
    @OneToMany
	private List<SkillExperience> skills;
    @OneToMany
	private List<BookmarkedJobs> bookmarkedJobs;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
