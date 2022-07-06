package org.example.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.common.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "users")
@AllArgsConstructor
@Data
@NoArgsConstructor
public class User extends BaseEntity {

    @Column(name = "name",nullable = false)
    private String name;

    @Column(name = "last_name",nullable = false)
    private String lastName;

    @Column(name = "father_name",nullable = false)
    private String fatherName;

    @Column(name = "national_code",nullable = false)
    private String nationalCode;

    @Column(name = "birth_place",nullable = false)
    private String birthPlace;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "blood",nullable = false)
    private BloodEnum blood;


}
