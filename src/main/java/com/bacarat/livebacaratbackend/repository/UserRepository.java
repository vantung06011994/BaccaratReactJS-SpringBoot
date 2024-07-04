package com.bacarat.livebacaratbackend.repository;

import com.bacarat.livebacaratbackend.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<Users, Long> {

    Users findByUsername(String username);

}
