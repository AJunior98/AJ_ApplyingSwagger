package com.ajunior.ajcatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ajunior.ajcatalog.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}
