package org.example.Student;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class StudentService implements IStudentService {

    private final StudentRepository repository;

    private final IStudentService service;

    @Override
    public Student save(Student student) {
        return repository.save(student);
    }

    @Override
    public Student getById(Long id) {
        Optional<Student> optional = repository.findById(id);
        if(optional.isEmpty()){
            throw new RuntimeException("Not Found");
        }
        return optional.get();
    }

    @Override
    public List<Student> getAll() {
        return (List<Student>) repository.findAll();
    }

    @Override
    public void update(Student student) {
        Student newStudent = getById(student.getId());
        newStudent.setName(student.getName());
        newStudent.setLastname(student.getLastname());
        newStudent.setAge(student.getAge());
        newStudent.setNationalCode(student.getNationalCode());
        newStudent.setBirthdate(student.getBirthdate());
        repository.save(newStudent);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
