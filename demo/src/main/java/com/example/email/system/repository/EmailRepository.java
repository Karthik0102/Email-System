package com.example.email.system.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.email.system.enums.Status;
import com.example.email.system.model.Email;

@Repository
public interface EmailRepository extends JpaRepository<Email, Long> {

	List<Email> findByStatus(Status status);
}