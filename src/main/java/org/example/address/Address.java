package org.example.address;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.example.common.BaseEntity;
import org.example.user.User;

import javax.persistence.*;

@Entity
@Table(name = "addresses")
@Data
@AllArgsConstructor
public class Address extends BaseEntity {

    @Column(name = "context")
    private String context;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
