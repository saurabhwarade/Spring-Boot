package com.example.SpringBootJPA.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "detail")
public class Student {

    @Id
    private int id;
    private String name;
    private String phone;
    private String email;
    private String address;

}
