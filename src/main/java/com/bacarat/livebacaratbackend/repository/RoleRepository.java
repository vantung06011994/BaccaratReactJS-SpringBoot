package com.bacarat.livebacaratbackend.repository;

import com.bacarat.livebacaratbackend.entity.Roles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Roles, Long> {
}
