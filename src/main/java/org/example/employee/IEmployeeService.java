package org.example.employee;

import java.util.List;

public interface IEmployeeService {

    Employee save(Employee employee);

    Employee getById(Long id);

    List<Employee> getAll();

    void update(Employee employee);

    void delete(Long id);

}
