package com.bh.banking.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;

    private String name;

    private String surname;

    @NaturalId
    private String email;

    private String phone;

    @OneToMany(mappedBy = "owner")
    private List<Account> accounts;
}
