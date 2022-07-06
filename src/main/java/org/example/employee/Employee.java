package org.example.employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.common.BaseEntity;
import org.example.province.Province;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "employees")
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Employee extends BaseEntity {

    @Column(name = "firstname",nullable = false)
    private String firstname;

    @Column(name = "lastname",nullable = false)
    private String lastname;

    @Column(name = "is_married",nullable = false)
    private Boolean isMarried;

    @Column(name = "birthdate",nullable = false)
    private Date birthdate;

    @Column(name = "children",nullable = false)
    private Integer children;

    @Column(name = "license")
    private String license;


}
