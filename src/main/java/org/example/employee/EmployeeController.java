package org.example.employee;


import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("employee/")
@AllArgsConstructor
public class EmployeeController {

    private final EmployeeService service;

    private final EmployeeMapper mapper;

    @PostMapping("v1")
    public ResponseEntity<Void> save(@RequestBody EmployeeDTO employeeDTO) {
        service.save(mapper.toEmployee(employeeDTO));
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("v1/{id}")
    public ResponseEntity<EmployeeDTO> getById(@PathVariable Long id) {
        Employee employee = service.getById(id);
        EmployeeDTO employeeDTO = mapper.toEmployeeDTO(employee);
        return ResponseEntity.ok(employeeDTO);
    }

    @GetMapping("v1/")
    public ResponseEntity<List<EmployeeDTO>> getAll() {
        List<Employee> cities = service.getAll();
        List<EmployeeDTO> citiesDTO = mapper.toEmployeeDTOS(cities);
        return ResponseEntity.ok(citiesDTO);
    }


    @DeleteMapping("/v1/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id)
    {
        service.delete(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/v1")
    public ResponseEntity<Void> update(@RequestBody Employee employee)
    {
        service.update(employee);
        return ResponseEntity.ok().build();
    }
}
