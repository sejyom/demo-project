package com.example.demo.featureA.repository;

import com.example.demo.featureA.entity.DemoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DemoEntityRepository extends JpaRepository<DemoEntity, Long> {
}
