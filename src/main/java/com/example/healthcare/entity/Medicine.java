	package com.example.healthcare.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="medicine")
public class Medicine {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String descriptionss;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescriptionss() {
		return descriptionss;
	}
	public void setDescriptionss(String descriptionss) {
		this.descriptionss = descriptionss;
	}
	

}
