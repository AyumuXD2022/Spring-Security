package com.security.couponsrvice.repository;

import com.security.couponsrvice.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role,Long> {
}
