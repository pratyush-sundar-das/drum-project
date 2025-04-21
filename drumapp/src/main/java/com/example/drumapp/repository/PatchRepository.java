package com.example.drumapp.repository;

import com.example.drumapp.model.Patch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatchRepository extends JpaRepository<Patch, String> {
}