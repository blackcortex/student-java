package org.example.employee;

import lombok.AllArgsConstructor;
import org.example.province.IProvinceService;
import org.example.province.Province;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class EmployeeService implements IEmployeeService {

    private final EmployeeRepository repository;

    @Override
    public Employee save(Employee employee) {
        return repository.save(employee);
    }

    @Override
    public Employee getById(Long id) {
        Optional<Employee> optional = repository.findById(id);
        if(optional.isEmpty()){
            throw new RuntimeException("Not Found");
        }
        return optional.get();
    }

    @Override
    public List<Employee> getAll() {
        return (List<Employee>) repository.findAll();
    }

    @Override
    public void update(Employee employee) {
        Employee newEmployee = getById(employee.getId());
        newEmployee.setFirstname(employee.getFirstname());
        newEmployee.setLastname(employee.getLastname());
        newEmployee.setBirthdate(employee.getBirthdate());
        newEmployee.setChildren(employee.getChildren());
        newEmployee.setIsMarried(employee.getIsMarried());
        newEmployee.setLicense(employee.getLicense());
        repository.save(newEmployee);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
