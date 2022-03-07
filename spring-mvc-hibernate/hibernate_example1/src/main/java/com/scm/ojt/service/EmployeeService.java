package com.scm.ojt.service;

import java.util.List;

import com.scm.ojt.model.Employee;

public interface EmployeeService {
	public void addEmployee(Employee employee);

	public List<Employee> listEmployeess();

	public Employee getEmployee(int empId);

	public void deleteEmployee(Employee employee);
}
