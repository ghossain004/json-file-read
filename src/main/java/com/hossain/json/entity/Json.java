package com.hossain.json.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
public class Json {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String address;
}
