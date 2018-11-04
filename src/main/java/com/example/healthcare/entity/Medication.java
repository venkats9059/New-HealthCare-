package com.example.healthcare.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "medication")
public class Medication {

	@Id
	@GeneratedValue
	private Long id;

	@ManyToOne
	@JoinColumn(name = "mid")
	private Medicine medicine;

	private String howtouse;

	private Integer quantity;

	private Integer duration;

	@ManyToOne
	@JoinColumn(name = "cid")
	private Complaints complaints;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Medicine getMedicine() {
		return medicine;
	}

	public void setMedicine(Medicine medicine) {
		this.medicine = medicine;
	}

	public String getHowtouse() {
		return howtouse;
	}

	public void setHowtouse(String howtouse) {
		this.howtouse = howtouse;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public Complaints getComplaints() {
		return complaints;
	}

	public void setComplaints(Complaints complaints) {
		this.complaints = complaints;
	}

}
