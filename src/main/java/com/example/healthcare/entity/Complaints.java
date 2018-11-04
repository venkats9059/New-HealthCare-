package com.example.healthcare.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "complaints")
public class Complaints {

	@Id
	@GeneratedValue
	private Long id;
	private String description;

	@ManyToMany
	@JoinTable(name = "complaints_diseases", joinColumns = { @JoinColumn(name = "cid") }, inverseJoinColumns = {
			@JoinColumn(name = "deid") })
	private List<Diseases> diseases;

	@ManyToOne
	@JoinColumn(name = "vid")
	private Visiting visiting;

	@OneToMany(mappedBy = "complaints", cascade = CascadeType.ALL)
	private List<Medication> medication;

	public List<Medication> getMedication() {
		return medication;
	}

	public void setMedication(List<Medication> medication) {
		this.medication = medication;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Diseases> getDiseases() {
		return diseases;
	}

	public void setDiseases(List<Diseases> diseases) {
		this.diseases = diseases;
	}

	public Visiting getVisiting() {
		return visiting;
	}

	public void setVisiting(Visiting visiting) {
		this.visiting = visiting;
	}

}
