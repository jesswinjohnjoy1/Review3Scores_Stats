package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity
public class ssMapping {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sign_no;
	private int worldranking;
	private String country;
	public int getSign_no() {
		return sign_no;
	}
	public void setSign_no(int sign_no) {
		this.sign_no = sign_no;
	}
	public int getWorldranking() {
		return worldranking;
	}
	public void setWorldranking(int worldranking) {
		this.worldranking = worldranking;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "ssMapping [sign_no=" + sign_no + ", worldranking=" + worldranking + ", country=" + country + "]";
	}
	
}
