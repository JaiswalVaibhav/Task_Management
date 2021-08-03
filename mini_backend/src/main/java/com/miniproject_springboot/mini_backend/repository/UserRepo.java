package com.miniproject_springboot.mini_backend.repository;

import com.miniproject_springboot.mini_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {

    User findByEmailAndPassword(String email , String password);
}
