package org.example.Student;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface StudentRepository  extends PagingAndSortingRepository<Student,Long> {


}
