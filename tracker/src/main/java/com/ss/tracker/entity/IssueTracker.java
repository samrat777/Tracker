package com.ss.tracker.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "issue")
public class IssueTracker {
	public String getServiceImpacted() {
		return ServiceImpacted;
	}

	public void setServiceImpacted(String serviceImpacted) {
		ServiceImpacted = serviceImpacted;
	}

	public String getServerLogDetails() {
		return ServerLogDetails;
	}

	public void setServerLogDetails(String serverLogDetails) {
		ServerLogDetails = serverLogDetails;
	}

	public String getOperationImpact() {
		return OperationImpact;
	}

	public void setOperationImpact(String operationImpact) {
		OperationImpact = operationImpact;
	}

	public String getCommercialImpact() {
		return CommercialImpact;
	}

	public void setCommercialImpact(String commercialImpact) {
		CommercialImpact = commercialImpact;
	}

	public String getRootCauseAnalysis() {
		return RootCauseAnalysis;
	}

	public void setRootCauseAnalysis(String rootCauseAnalysis) {
		RootCauseAnalysis = rootCauseAnalysis;
	}

	@Id
	@GeneratedValue
	@Column(name = "id")
	private long id;

	@Column(name = "component_name")
	private String componentname;
	@Column(name = "clientname")
	private String Clientname;
	@Column(name = "Time")
	private String Time;
	@Column(name = "service_Impacted")
	private String ServiceImpacted;
	@Column(name = "server_log_details")
	private String ServerLogDetails;
	@Column(name = "operation_Impact")
	private String OperationImpact;
	@Column(name = "commercial_impact")
	private String CommercialImpact;
	@Column(name = "Root_Cause_Analysis")
	private String RootCauseAnalysis;
	@Column(name = "Resolution")
	private String Resolution;
	@Override
	public String toString() {
		return "IssueTracker [id=" + id + ", Properties=" +  ", componentname=" + componentname
				+ ", Clientname=" + Clientname + ", Time=" + Time + ", ServiceImpacted=" + ServiceImpacted
				+ ", ServerLogDetails=" + ServerLogDetails + ", OperationImpact=" + OperationImpact
				+ ", CommercialImpact=" + CommercialImpact + ", RootCauseAnalysis=" + RootCauseAnalysis
				+ ", Resolution=" + Resolution + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	

	public String getComponentname() {
		return componentname;
	}

	public void setComponentname(String componentname) {
		this.componentname = componentname;
	}

	public String getClientname() {
		return Clientname;
	}

	public void setClientname(String clientname) {
		Clientname = clientname;
	}

	public String getTime() {
		return Time;
	}

	public void setTime(String time) {
		Time = time;
	}

	public String getResolution() {
		return Resolution;
	}

	public void setResolution(String resolution) {
		Resolution = resolution;
	}

	/*public List<Projects> getProjects() {
		return projects;
	}

	public void setProjects(List<Projects> projects) {
		this.projects = projects;
	}

	@OneToMany
	private List<Projects> projects;*/

}
