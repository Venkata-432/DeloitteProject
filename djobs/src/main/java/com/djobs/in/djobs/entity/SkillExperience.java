package com.djobs.in.djobs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="skillexperience")
public class SkillExperience {
 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@OneToOne
	private Skill skill;
	@Column(name="years")
	private Integer years;
	@OneToOne
	private FreeLancer freelancer;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getYears() {
		return years;
	}
	public void setYears(Integer years) {
		this.years = years;
	}
	
}
