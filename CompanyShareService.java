package com.gl.crudApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.crudApplication.bean.CompanyShare;
import com.gl.crudApplication.repository.CompanyShareRepository;


@Service
public class CompanyShareService {
		@Autowired
	 private CompanyShareRepository repository;
	 public void save(CompanyShare company) {
		 repository.save(company);
	 }
	 public List<CompanyShare> findAll(){
		 return repository.findAll();
	 }
	 public CompanyShare findById(Long id) {
		 return repository.getById(id);
	 }
	 public Long generateCourseId() {
	Long val=repository.findMaxCompanyId();
		 if(val==null)
			 val=1000001L;
		 else
			 val=val+1;
		 return val;
		 
	 }
	public void delete(Long id) {
		 repository.deleteById(id);
	 }


}
