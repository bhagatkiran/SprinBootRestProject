package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Employee;
import com.example.demo.service.IEmployeeService;

@Controller
public class MyController {
	
	@Autowired
	private IEmployeeService service;

	@GetMapping("/register")
	private String RegisterEmp() {
		return "EmpRegister";
	}

	@PostMapping("/save")
	public String saveemployee(@ModelAttribute Employee employee, Model model) {
		System.out.println("in show" + employee.toString());
		Integer eid = service.saveEmpolyee(employee);
		String message = "Employee '" + eid + "' Employee";
		model.addAttribute("msg", message);

		return "EmpRegister";

	}
	@GetMapping("/all")
	private String showAllEmpl(Model model) {
		System.out.println("in all");
		List<Employee> list = service.getallEmployee();
		System.out.println(list);
		model.addAttribute("list", list);
		return "AllEmp";
	}

	@GetMapping("/delete")
	public String DeletEmployee( @RequestParam Integer eid,Model model) {
	
		try {
			service.removeEmployee(eid);
		}catch(Exception e) {
			throw e;
		}
		
		return "redirect:all";
	}
	@GetMapping("/edit")
	public String editEmployee(@RequestParam Integer eid ,Model model) {
		
Employee emp=service.editEmployee(eid);
	model.addAttribute("employee", emp);	
		return "Empedit";
	
	}

	@PostMapping("/update")
	public String updateEmp(
			//read Form Data
			@ModelAttribute Employee employee
			) 
	{
		//call service
		service.updateEmployee(employee);
		//back to Data page
		return "employee";
	}
}
