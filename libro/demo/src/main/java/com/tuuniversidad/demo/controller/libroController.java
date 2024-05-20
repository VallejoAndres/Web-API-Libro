package com.tuuniversidad.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.tuuniversidad.demo.models.libro;
import com.tuuniversidad.demo.services.libroServices;

import java.util.List;

@RestController
@RequestMapping("/libros")

public class libroController {
    @Autowired
    private libroServices libroService;

    @GetMapping
    public List<libro> findAll() {
        return libroService.findAll();
    }

    @GetMapping("/{id}")
    public libro findById(@PathVariable Long id) {
        return libroService.findById(id);
    }

    @PostMapping
    public void save(@RequestBody libro libro) {
        libroService.save(libro);
    }
}
