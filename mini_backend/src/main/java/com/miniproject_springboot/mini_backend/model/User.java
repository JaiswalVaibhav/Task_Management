package com.miniproject_springboot.mini_backend.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;
    private String password;
    private String MobileNo;

//    @OneToMany(mappedBy = "user")
//    private List<Task> taskList;

}
