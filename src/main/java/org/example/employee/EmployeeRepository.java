package org.example.employee;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface EmployeeRepository  extends PagingAndSortingRepository<Employee,Long> {


}
