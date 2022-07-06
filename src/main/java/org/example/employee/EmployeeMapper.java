package org.example.employee;

import org.example.province.ProvinceMapper;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {


    Employee toEmployee(EmployeeDTO employeeDTO);

    EmployeeDTO toEmployeeDTO(Employee employee);


    List<EmployeeDTO> toEmployeeDTOS(List<Employee> employees);

    List<Employee> toCategories(List<EmployeeDTO> employeeDTOS);


}
