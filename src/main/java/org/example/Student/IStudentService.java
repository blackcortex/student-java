package org.example.Student;

import java.util.List;

public interface IStudentService {

    Student save(Student product);

    Student getById(Long id);

    List<Student> getAll();

    void update(Student product);

    void delete(Long id);

}
