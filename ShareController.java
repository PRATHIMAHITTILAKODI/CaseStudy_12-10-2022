package com.gl.crudApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.gl.crudApplication.bean.CompanyShare;
import com.gl.crudApplication.service.CompanyShareService;




@RestController
public class ShareController {

	
	@Autowired
	  private CompanyShareService service;
	  
	  @GetMapping("/index")
	  public ModelAndView showIndexPage() {
		  ModelAndView mv= new ModelAndView("index");
		  List<CompanyShare> companyList=service.findAll();
			mv.addObject("companyList",companyList);
			return mv;
	  }
	  
	  @GetMapping("/company-enlist")
	  public ModelAndView showCompanyEntryPage() {
		  CompanyShare company=new CompanyShare();
		  ModelAndView mv=new ModelAndView("company-enlist");
		  mv.addObject("companyRecord",company);
		  return mv;
	  }
	  @PostMapping("/company")
		public ModelAndView savenewCourse(@ModelAttribute("courseRecord") CompanyShare company) {
			Long id=service.generateCourseId();
			company.setCompanyId(id);
			service.save(company);
			return new ModelAndView("redirect:/index");
		}
	  
		@GetMapping("/delete-company/{id}")
		public ModelAndView deleteACompany(@PathVariable long id) {
			service.delete(id);
			return new ModelAndView("redirect:/index");
		}
		@GetMapping("/edit-sharePrice/{id}")
		public ModelAndView showACourseEditPage(@PathVariable long id) {
			CompanyShare company=service.findById(id);
			ModelAndView mv=new ModelAndView("CompanyEdit");
			mv.addObject("companyRecord",company);
			return mv;
		}
		@PostMapping("/edit-sharePrice/edit-sharePrice")
		public ModelAndView editCourse(@ModelAttribute("companyRecord") CompanyShare company) {
			service.save(company);
			return new ModelAndView("redirect:/index");
		
	}
}