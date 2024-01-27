package com.Alphatech.app.RestApi.Repo;


import com.Alphatech.app.RestApi.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
