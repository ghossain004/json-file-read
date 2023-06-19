package com.hossain.json.repository;

import com.hossain.json.entity.Json;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JsonRepository extends JpaRepository<Json, Long> {
}
