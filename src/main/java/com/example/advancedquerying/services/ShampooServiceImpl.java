package com.example.advancedquerying.services;

import com.example.advancedquerying.entities.Shampoo;
import com.example.advancedquerying.entities.Size;
import com.example.advancedquerying.repositories.ShampooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShampooServiceImpl implements ShampooService{

    private final ShampooRepository shampooRepository;

    @Autowired
    public ShampooServiceImpl(ShampooRepository shampooRepository) {
        this.shampooRepository = shampooRepository;
    }

    @Override
    public List<Shampoo> findByBrand(String brand) {
        return this.shampooRepository.findByBrand(brand) ;
    }

    @Override
    public List<Shampoo> findByBrandAndSize(String brand, String size) {
        Size parsed = Size.valueOf(size.toUpperCase());
        return this.shampooRepository.findByBrandAndSize(brand, parsed);
    }

    @Override
    public List<Shampoo> findBySizeOrderById(Size size) {
        return this.shampooRepository.findAllBySizeOrderById(size);
    }
}
