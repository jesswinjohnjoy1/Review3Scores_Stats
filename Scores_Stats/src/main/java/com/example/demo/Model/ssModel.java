package com.example.demo.Model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class ssModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sign_no;
	private String name;
	private String teams;
	private int runs;
	private int matches;
	private int average;
	private int strikerate;
	private int highscore;
	private int fiftyes;
	private int centuries;
	private int id;
	@Column(unique = true)
	private String uname;
	private String pwd;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="ssMapping_sign_no")
	private ssMapping ss_map;
	public int getSign_no() {
		return sign_no;
	}
	public void setSign_no(int sign_no) {
		this.sign_no = sign_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTeams() {
		return teams;
	}
	public void setTeams(String teams) {
		this.teams = teams;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public int getMatches() {
		return matches;
	}
	public void setMatches(int matches) {
		this.matches = matches;
	}
	public int getAverage() {
		return average;
	}
	public void setAverage(int average) {
		this.average = average;
	}
	public int getStrikerate() {
		return strikerate;
	}
	public void setStrikerate(int strikerate) {
		this.strikerate = strikerate;
	}
	public int getHighscore() {
		return highscore;
	}
	public void setHighscore(int highscore) {
		this.highscore = highscore;
	}
	public int getFiftyes() {
		return fiftyes;
	}
	public void setFiftyes(int fiftyes) {
		this.fiftyes = fiftyes;
	}
	public int getCenturies() {
		return centuries;
	}
	public void setCenturies(int centuries) {
		this.centuries = centuries;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public ssMapping getSs_map() {
		return ss_map;
	}
	public void setSs_map(ssMapping ss_map) {
		this.ss_map = ss_map;
	}
	public ssModel() {
		super();
	}
	@Override
	public String toString() {
		return "ssModel [sign_no=" + sign_no + ", name=" + name + ", teams=" + teams + ", runs=" + runs + ", matches="
				+ matches + ", average=" + average + ", strikerate=" + strikerate + ", highscore=" + highscore
				+ ", fiftyes=" + fiftyes + ", centuries=" + centuries + ", id=" + id + ", uname=" + uname + ", pwd="
				+ pwd + ", ss_map=" + ss_map + "]";
	}
}
	