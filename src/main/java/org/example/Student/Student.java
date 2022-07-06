package org.example.Student;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.common.BaseEntity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "students")
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Student extends BaseEntity {

    @Column(name = "name",nullable = false)
    private String name;

    @Column(name = "lastname",nullable = false)
    private String lastname;

    @Column(name = "national_code",nullable = false)
    private String nationalCode;

    @Column(name = "age",nullable = false)
    private Integer age;

    @Column(name = "birthdate",nullable = false)
    private Date birthdate;

    @Column(name = "file",nullable = false)
    private String file;

}
