package com.mirzarad.pma.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mirzarad.pma.dao.EmployeeRepository;
import com.mirzarad.pma.dao.ProjectRepository;
import com.mirzarad.pma.dto.ChartData;
import com.mirzarad.pma.dto.EmployeeProject;
import com.mirzarad.pma.entities.Project;

@Controller
public class HomeController {

	@Autowired
	ProjectRepository proRepo;
	
	@Autowired
	EmployeeRepository empRepo;
	
	@GetMapping("/")
	public String displayHome(Model model) throws JsonProcessingException {
		
		Map<String, Object> map = new HashMap<>();
		
		List<Project> projects = proRepo.findAll();
		model.addAttribute("projects", projects);
		
		List<ChartData> projectData = proRepo.getProjectStatus();
		
		// Convert projectData object into a json structure for use in JavaScript:
		ObjectMapper objectMapper = new ObjectMapper();	
		String jsonString = objectMapper.writeValueAsString(projectData);
		// [ ["NOTSTARTED", 1], [INPROGRESS,2], ["COMPLETED",1] ]
		
		model.addAttribute("projectStatusCount", jsonString);
		
		List<EmployeeProject> employeesProjectCount = empRepo.employeeProjects();
		model.addAttribute("employeesListProjectCount", employeesProjectCount);
		
		return "main/home";
	}
}
