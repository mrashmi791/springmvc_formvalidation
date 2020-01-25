package com.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.entity.Employee;
import com.demo.service.EmployeeService;

@Controller
public class EmployeeController {
	
	 @Autowired
	    private EmployeeService employeeService;
	 
		@InitBinder
		public void initBinder(WebDataBinder dataBinder) {

			StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);

			dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
		}

	    @GetMapping("/list")
	    public String listEmployee(Model theModel) {
	        List < Employee > list = employeeService.getEmployee();
	        theModel.addAttribute("employeeList", list);
	        return "emp_list";
	    }

		@ModelAttribute("employee")
		public Employee employee() {
			return new Employee();
		}
		
		
	    @GetMapping("/showForm")
	    public String showFormForAdd() {
//	        Employee theEmployee = new Employee();
	       
	        return "employee";
	    }

	    @PostMapping("/saveEmployee")
	    public String saveCustomer(@Valid @ModelAttribute("employee") Employee employee, BindingResult result ) {
	    	

	    	if (result.hasErrors()) {
				return "employee";
			}

	        employeeService.saveEmployee(employee);
	        return "redirect:/list";
	    }
	    
	    @GetMapping("/updateForm")
	    public String showFormForUpdate(@RequestParam("id") int theId,
	        Model theModel) {
	        Employee list = employeeService.getEmployee(theId);
	        theModel.addAttribute("employee", list);
	        return "employee";
	    }

	    @GetMapping("/delete")
	    public String deleteCustomer(@RequestParam("id") int theId) {
	        employeeService.deleteEmployee(theId);
	        return "redirect:/list";
	    }
}
