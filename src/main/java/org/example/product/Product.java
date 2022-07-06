package org.example.product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.category.Category;
import org.example.common.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "products")
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Product extends BaseEntity {

    @Column(name = "title",nullable = false)
    private String title;

    @Column(name = "price",nullable = false)
    private Integer price;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;


}
