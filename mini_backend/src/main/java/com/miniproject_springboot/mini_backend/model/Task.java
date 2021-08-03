package com.miniproject_springboot.mini_backend.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String taskName;
    private String taskInfo;
    private String date;


//    @ManyToOne
//    @JoinColumn(name = "user_id")
//    private User user;
}
