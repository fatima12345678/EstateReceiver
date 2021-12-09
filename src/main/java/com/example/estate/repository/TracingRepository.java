package com.example.estate.repository;


import com.example.estate.domain.Tracing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TracingRepository extends JpaRepository<Tracing,Long>{
}
