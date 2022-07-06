package org.example.category;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.common.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "categories")
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Category extends BaseEntity {


    @Column(name = "title",nullable = false)
    private String title;


}
