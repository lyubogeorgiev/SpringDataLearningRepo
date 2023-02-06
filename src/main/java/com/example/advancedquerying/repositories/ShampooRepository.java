package com.example.advancedquerying.repositories;

import com.example.advancedquerying.entities.Shampoo;
import com.example.advancedquerying.entities.Size;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShampooRepository extends JpaRepository<Shampoo, Long> {
    List<Shampoo> findByBrand(String brand);
    List<Shampoo> findByBrandAndSize(String brand, Size size);

    List<Shampoo> findAllBySizeOrderById(Size size);
}
