package com.program.employee.repository;

import com.program.employee.model.Boss;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BossRepository extends JpaRepository<Boss, Long> {
}
