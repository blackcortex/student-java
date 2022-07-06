package org.example.employee;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-07-06T21:04:21+0430",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 18-ea (Private Build)"
)
@Component
public class EmployeeMapperImpl implements EmployeeMapper {

    @Override
    public Employee toEmployee(EmployeeDTO employeeDTO) {
        if ( employeeDTO == null ) {
            return null;
        }

        Employee employee = new Employee();

        employee.setId( employeeDTO.getId() );
        employee.setVersion( employeeDTO.getVersion() );
        employee.setCreatedDate( employeeDTO.getCreatedDate() );
        employee.setCreatedBy( employeeDTO.getCreatedBy() );
        employee.setLastModifiedDate( employeeDTO.getLastModifiedDate() );
        employee.setLastModifiedBy( employeeDTO.getLastModifiedBy() );
        employee.setFirstname( employeeDTO.getFirstname() );
        employee.setLastname( employeeDTO.getLastname() );
        employee.setIsMarried( employeeDTO.getIsMarried() );
        employee.setBirthdate( employeeDTO.getBirthdate() );
        employee.setChildren( employeeDTO.getChildren() );
        employee.setLicense( employeeDTO.getLicense() );

        return employee;
    }

    @Override
    public EmployeeDTO toEmployeeDTO(Employee employee) {
        if ( employee == null ) {
            return null;
        }

        EmployeeDTO employeeDTO = new EmployeeDTO();

        employeeDTO.setId( employee.getId() );
        employeeDTO.setVersion( employee.getVersion() );
        employeeDTO.setCreatedDate( employee.getCreatedDate() );
        employeeDTO.setCreatedBy( employee.getCreatedBy() );
        employeeDTO.setLastModifiedDate( employee.getLastModifiedDate() );
        employeeDTO.setLastModifiedBy( employee.getLastModifiedBy() );
        employeeDTO.setFirstname( employee.getFirstname() );
        employeeDTO.setLastname( employee.getLastname() );
        employeeDTO.setIsMarried( employee.getIsMarried() );
        employeeDTO.setBirthdate( employee.getBirthdate() );
        employeeDTO.setChildren( employee.getChildren() );
        employeeDTO.setLicense( employee.getLicense() );

        return employeeDTO;
    }

    @Override
    public List<EmployeeDTO> toEmployeeDTOS(List<Employee> employees) {
        if ( employees == null ) {
            return null;
        }

        List<EmployeeDTO> list = new ArrayList<EmployeeDTO>( employees.size() );
        for ( Employee employee : employees ) {
            list.add( toEmployeeDTO( employee ) );
        }

        return list;
    }

    @Override
    public List<Employee> toCategories(List<EmployeeDTO> employeeDTOS) {
        if ( employeeDTOS == null ) {
            return null;
        }

        List<Employee> list = new ArrayList<Employee>( employeeDTOS.size() );
        for ( EmployeeDTO employeeDTO : employeeDTOS ) {
            list.add( toEmployee( employeeDTO ) );
        }

        return list;
    }
}
