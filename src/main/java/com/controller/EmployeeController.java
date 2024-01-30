package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entity.EmployeeEntity;
import com.repository.EmployeeRepository;
import com.repository.JobTypeRepository;

@Controller
@RequestMapping("employee")
public class EmployeeController {

	@Autowired
	EmployeeRepository employeeRepo;
	
	@Autowired
	JobTypeRepository jobTypeRepo;
	
	@GetMapping("new")
	public String newEmployee(Model model) {

		model.addAttribute("jobs",jobTypeRepo.findAll());	
		return "NewEmployee";
	}
	
	@PostMapping("save")
	public String saveEmployee(EmployeeEntity employeeEntity) {
		employeeRepo.save(employeeEntity);
		return "redirect:/employee/all";
	}
	
	@GetMapping("all")
	public String getAllEmpl(Model model) {
		model.addAttribute("employees",employeeRepo.findAll());	
		return  "ListEmployee";
	}

}
