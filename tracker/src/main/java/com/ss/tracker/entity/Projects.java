package com.ss.tracker.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="projects")
public class Projects {

	@Id
	@GeneratedValue
	private Long id;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	private String indosat;
	private String starhub;
	private String dtac;
	private String omantel;
	private String batelco;
	
	@ManyToOne(cascade=CascadeType.ALL)	
	private IssueTracker issueTracker;
	
	public IssueTracker getIssueTracker() {
		return issueTracker;
	}
	public void setIssueTracker(IssueTracker issueTracker) {
		this.issueTracker = issueTracker;
	}
	public String getIndosat() {
		return indosat;
	}
	public void setIndosat(String indosat) {
		this.indosat = indosat;
	}
	public String getStarhub() {
		return starhub;
	}
	public void setStarhub(String starhub) {
		this.starhub = starhub;
	}
	public String getDtac() {
		return dtac;
	}
	public void setDtac(String dtac) {
		this.dtac = dtac;
	}
	public String getOmantel() {
		return omantel;
	}
	public void setOmantel(String omantel) {
		this.omantel = omantel;
	}
	public String getBatelco() {
		return batelco;
	}
	public void setBatelco(String batelco) {
		this.batelco = batelco;
	}
	
}
