package com.h2db.H2DBExample.Repositories;


import  com.h2db.H2DBExample.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepo extends JpaRepository<User, Long> {
}