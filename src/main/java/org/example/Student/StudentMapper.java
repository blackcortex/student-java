package org.example.Student;

import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface StudentMapper {


    Student toStudent(StudentDTO studentDTO);

    StudentDTO toStudentDTO(Student student);


    List<StudentDTO> toStudentDTOS(List<Student> students);

    List<Student> toStudents(List<StudentDTO> studentDTOS);


}
