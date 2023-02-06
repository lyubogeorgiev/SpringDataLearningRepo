package com.example.advancedquerying;

import com.example.advancedquerying.entities.Shampoo;
import com.example.advancedquerying.entities.Size;
import com.example.advancedquerying.repositories.ShampooRepository;
import com.example.advancedquerying.services.ShampooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Main implements CommandLineRunner {

    private final ShampooService shampooService;

    @Autowired
    public Main(ShampooService shampooService) {
        this.shampooService = shampooService;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello");

        List<Shampoo> shampoos = this.shampooService.findBySizeOrderById(Size.MEDIUM);
        for (Shampoo shampoo : shampoos) {
            System.out.println(shampoo);
        }
    }
}
