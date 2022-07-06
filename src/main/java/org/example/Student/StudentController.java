package org.example.Student;


import lombok.AllArgsConstructor;
import org.example.file_upload.MinioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("student/")
@AllArgsConstructor
public class StudentController {

    private final IStudentService service;

    private final StudentMapper mapper;

    private final MinioService minioService;

    @PostMapping("v1")
    public ResponseEntity<Void> save(@RequestBody StudentDTO studentDTO,@RequestPart(value = "file",required = false) MultipartFile files) {
        String gKey = minioService.uploadFile(files);
        studentDTO.setFile(gKey);
        service.save(mapper.toStudent(studentDTO));

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("v1/{id}")
    public ResponseEntity<StudentDTO> getById(@PathVariable Long id) {
        Student student = service.getById(id);
        StudentDTO studentDTO = mapper.toStudentDTO(student);
        return ResponseEntity.ok(studentDTO);
    }

    @GetMapping("v1/")
    public ResponseEntity<List<StudentDTO>> getAll() {
        List<Student> cities = service.getAll();
        List<StudentDTO> citiesDTO = mapper.toStudentDTOS(cities);
        return ResponseEntity.ok(citiesDTO);
    }


    @DeleteMapping("/v1/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id)
    {
        service.delete(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/v1")
    public ResponseEntity<Void> update(@RequestBody Student student)
    {
        service.update(student);
        return ResponseEntity.ok().build();
    }
}
