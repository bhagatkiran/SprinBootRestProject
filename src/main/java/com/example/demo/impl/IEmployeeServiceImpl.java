package com.example.demo.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repo.MyRepo;
import com.example.demo.service.IEmployeeService;

@Service
public class IEmployeeServiceImpl implements IEmployeeService {
	@Autowired
	private MyRepo repo;

	@Override
	public Integer saveEmpolyee(Employee e) {

		double eSal = e.getEsal();
		double ehra = eSal * 20 / 100.0;
		double eda = eSal * 6 / 100.0;
		e.setHra(ehra);
		e.setDa(eda);
		e = repo.save(e);
		return e.getEid();
	}

	@Override
	public List<Employee> getallEmployee() {

		return repo.findAll();
	}

	@Override
	public Integer removeEmployee(Integer id) {
	repo.deleteById(id);
	return id;
		
	}

	@Override
	public Employee editEmployee(Integer id) {
	Optional<Employee>opt=	repo.findById(id);
	if(opt.isEmpty()) {
	Employee e=opt.get();
	return e;
 }
			return null ;
	}

	public void updateEmployee(Employee e) {
		if(repo.existsById(e.getEid())) {
			//calculations
			double esal = e.getEsal();
			double hra = esal * 20/100.0;
			double da = esal * 10/100.0;
			e.setHra(hra);
			e.setDa(da);
			repo.save(e);
		} else {
			//throw EmployeeNotFoundException
		}
	}



	@Override
	public Page<Employee> getallEmployee(org.springframework.data.domain.Pageable pageable) {
		Page<Employee> page = repo.findAll(pageable);
		return page;
	}
}
