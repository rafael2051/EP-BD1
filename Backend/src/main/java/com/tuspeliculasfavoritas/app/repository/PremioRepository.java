package com.tuspeliculasfavoritas.app.repository;

import com.tuspeliculasfavoritas.app.model.Premio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PremioRepository extends JpaRepository<Premio, String> {
}
