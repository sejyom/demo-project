package com.example.demo.featureA.repository;


import com.example.demo.featureA.entity.DemoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestEntityRepository extends JpaRepository<DemoEntity, Long> {
}
