package org.example.province;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.common.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "provinces")
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Province extends BaseEntity {

    @Column(name = "title",nullable = false)
    private String title;


}
