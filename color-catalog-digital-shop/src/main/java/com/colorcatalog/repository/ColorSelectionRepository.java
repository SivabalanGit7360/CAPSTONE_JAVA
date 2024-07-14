package com.colorcatalog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.colorcatalog.model.ColorSelection;

import java.util.List;

public interface ColorSelectionRepository extends JpaRepository<ColorSelection, Long> {
    List<ColorSelection> findByUsername(String username);
}
