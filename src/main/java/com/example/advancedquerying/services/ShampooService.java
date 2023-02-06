package com.example.advancedquerying.services;

import com.example.advancedquerying.entities.Shampoo;
import com.example.advancedquerying.entities.Size;
import com.example.advancedquerying.repositories.ShampooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ShampooService {
    List<Shampoo> findByBrand(String brand);
    List<Shampoo> findByBrandAndSize(String brand, String size);
    List<Shampoo> findBySizeOrderById(Size size);
}
