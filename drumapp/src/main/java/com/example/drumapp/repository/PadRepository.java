package com.example.drumapp.repository;

import com.example.drumapp.model.Pad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PadRepository extends JpaRepository<Pad, String> {
}