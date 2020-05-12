package com.ss.tracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ss.tracker.dao.TrackerDao;
import com.ss.tracker.entity.IssueTracker;
import com.ss.tracker.entity.Projects;

@Controller
public class TrackerController {

	@Autowired
	private TrackerDao trackerDao;

	// Enter the data
	@RequestMapping("display")
	ModelAndView displayTracker() {
		return new ModelAndView("getvalues");
	}

	// saved Data
	@RequestMapping("saveData")
	ModelAndView dataSaved(IssueTracker it) {
		System.out.println("saved data=" + it);
		trackerDao.dataSaved(it);
//		trackerDao.projectData(p);
		return new ModelAndView("getvalues");
	}

	// get Data
	@RequestMapping("getAllData")
	ModelAndView getAllIssues() {
		List<IssueTracker> Issuelist = trackerDao.getAllIssues();
		return new ModelAndView("getvalues", "getList", Issuelist);
	}
	
	//Search Data
	@RequestMapping("searchPage")
	ModelAndView searchIssue(){
		return new ModelAndView("search");
	}
	//Search By Name
	@RequestMapping("getByName")
	ModelAndView getByName(String Clientname){
		List<IssueTracker> nameslist = trackerDao.getByName(Clientname);
		return new ModelAndView("getname","nameslist",nameslist);
}
}