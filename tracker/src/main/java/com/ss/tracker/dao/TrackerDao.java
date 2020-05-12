package com.ss.tracker.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ss.tracker.entity.IssueTracker;
import com.ss.tracker.entity.Projects;

@Repository
public class TrackerDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
 // Insert into the IssueTracker
	public void dataSaved(IssueTracker it) {
		jdbcTemplate.update(
				"insert into tracker.issue(id,clientname,time,service_impacted,server_log_details,operation_impact,commercial_impact,root_cause_analysis,Resolution)"
						+ " values(?,?,?,?,?,?,?,?,?)",
				it.getId(), it.getClientname(), it.getTime(), it.getServiceImpacted(),
				it.getServerLogDetails(), it.getOperationImpact(), it.getCommercialImpact(), it.getRootCauseAnalysis(),
				it.getResolution());
	}
		//Insert into the projects

/*	public void projectData(Projects p){
		jdbcTemplate.update("insert into tracker.projects(id,indosat,starhub,dtac,omantel,batelco)" + "values(?,?,?,?,?,?)",p.getId(),p.getIndosat(),p.getStarhub(),p.getDtac(),p.getOmantel(),p.getBatelco());
	}*/
	
//Get All Data
	public List<IssueTracker> getAllIssues() {
		List<IssueTracker> list = jdbcTemplate.query("select * from tracker.issue",
				new BeanPropertyRowMapper<IssueTracker>(IssueTracker.class));
		return list;

	}
	//Get BY ClientName
	public List<IssueTracker> getByName(String issueName){
		List<IssueTracker> list1 = jdbcTemplate.query("SELECT * FROM tracker.issue i where i.clientname like  ? ", new BeanPropertyRowMapper<IssueTracker>(IssueTracker.class),issueName);
		return list1;
	}
}
