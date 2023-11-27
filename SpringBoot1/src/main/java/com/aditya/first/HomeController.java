package com.aditya.first;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class HomeController {

	@Autowired
	private Repository Repo;

	@RequestMapping("/")
	public ModelAndView home() {
		System.out.println("Home Page Called");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index.jsp");
		return mv;
	}

//Save method is predefine method in Mongo Repository 
	// with this method we will save user in our database
//	@RequestMapping("/addEmployee")
//	public Employee addEmployee(@RequestBody Employee e) {
//		System.out.println("Entered addEmployee");
//
//		System.out.println(e.getEmployee_Id() + " " + e.getEmployee_Name() + " " + e.getPassword());
//		return Repo.save(e);
//	}
	
	  @RequestMapping("/addEmployee") public Employee
	  addEmployee(@RequestParam("employee_Id") int i,@RequestParam("Employee_Name")
	  String n,@RequestParam("Password") String p) {
	  System.out.println("Entered addEmployee"); Employee e= new Employee(i,n,p);
	  System.out.println(i+" "+n+" "+p); return Repo.save(e); }
	 

	// findAll method is predefined method in Mongo Repository
	// with this method we will all user that is save in our database
	@GetMapping("/getEmployee")
	public ResponseEntity<List<Employee>> getAllUser() {
		System.out.println("Entered getEmployee");
		List<Employee> Employees= Repo.findAll();
		  System.out.println("Getting all ") ;
			  
	        // System.out.println(foundEmployee.getEmployee_Name());
   return new ResponseEntity<>(Employees, HttpStatus.OK);
		
	}
	
	

}
