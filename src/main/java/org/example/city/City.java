package org.example.city;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.category.Category;
import org.example.common.BaseEntity;
import org.example.province.Province;

import javax.persistence.*;

@Entity
@Table(name = "cities")
@AllArgsConstructor
@Data
@NoArgsConstructor
public class City extends BaseEntity {

    @Column(name = "title",nullable = false)
    private String title;

    @ManyToOne
    @JoinColumn(name = "province_id")
    private Province province;


}
