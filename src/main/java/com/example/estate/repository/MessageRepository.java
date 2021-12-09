package com.example.estate.repository;

import com.example.estate.domain.EstateModel;
import com.example.estate.domain.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends JpaRepository<Message,Long> {
}
