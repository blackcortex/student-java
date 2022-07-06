package org.example.Student;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-07-06T21:03:10+0430",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 18-ea (Private Build)"
)
@Component
public class StudentMapperImpl implements StudentMapper {

    @Override
    public Student toStudent(StudentDTO studentDTO) {
        if ( studentDTO == null ) {
            return null;
        }

        Student student = new Student();

        student.setId( studentDTO.getId() );
        student.setVersion( studentDTO.getVersion() );
        student.setCreatedDate( studentDTO.getCreatedDate() );
        student.setCreatedBy( studentDTO.getCreatedBy() );
        student.setLastModifiedDate( studentDTO.getLastModifiedDate() );
        student.setLastModifiedBy( studentDTO.getLastModifiedBy() );
        student.setName( studentDTO.getName() );
        student.setLastname( studentDTO.getLastname() );
        student.setNationalCode( studentDTO.getNationalCode() );
        student.setAge( studentDTO.getAge() );
        student.setBirthdate( studentDTO.getBirthdate() );
        student.setFile( studentDTO.getFile() );

        return student;
    }

    @Override
    public StudentDTO toStudentDTO(Student student) {
        if ( student == null ) {
            return null;
        }

        StudentDTO studentDTO = new StudentDTO();

        studentDTO.setId( student.getId() );
        studentDTO.setVersion( student.getVersion() );
        studentDTO.setCreatedDate( student.getCreatedDate() );
        studentDTO.setCreatedBy( student.getCreatedBy() );
        studentDTO.setLastModifiedDate( student.getLastModifiedDate() );
        studentDTO.setLastModifiedBy( student.getLastModifiedBy() );
        studentDTO.setName( student.getName() );
        studentDTO.setLastname( student.getLastname() );
        studentDTO.setNationalCode( student.getNationalCode() );
        studentDTO.setAge( student.getAge() );
        studentDTO.setBirthdate( student.getBirthdate() );
        studentDTO.setFile( student.getFile() );

        return studentDTO;
    }

    @Override
    public List<StudentDTO> toStudentDTOS(List<Student> students) {
        if ( students == null ) {
            return null;
        }

        List<StudentDTO> list = new ArrayList<StudentDTO>( students.size() );
        for ( Student student : students ) {
            list.add( toStudentDTO( student ) );
        }

        return list;
    }

    @Override
    public List<Student> toStudents(List<StudentDTO> studentDTOS) {
        if ( studentDTOS == null ) {
            return null;
        }

        List<Student> list = new ArrayList<Student>( studentDTOS.size() );
        for ( StudentDTO studentDTO : studentDTOS ) {
            list.add( toStudent( studentDTO ) );
        }

        return list;
    }
}
