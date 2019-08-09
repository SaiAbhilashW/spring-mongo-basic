package project.coffeeSCM.MongoSpringCoffee.services;

import org.springframework.stereotype.Service;

import project.coffeeSCM.MongoSpringCoffee.model.Employee;
import project.coffeeSCM.MongoSpringCoffee.repository.EmployeeRepository;

@Service
public class EmployeeDbService {
	private EmployeeRepository employeeRepository;
	
	public Employee getEmployeeById(String empId) {
		return this.employeeRepository.findByEmpId(empId);
	}
	
	public Employee insertEmployee(Employee emp) {
		return this.employeeRepository.insert(emp);
	}
}
