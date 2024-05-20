package com.tuuniversidad.demo.repository;

import com.tuuniversidad.demo.models.libro;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LibroRepository {
    private static List<libro> libros = new ArrayList<>();

    @PostConstruct
    public void init() {
        libros.add(new libro(1L, "Fahrenheit 451", "Ray Bradbury", "Minotauro", 1953));
        libros.add(new libro(2L, "El Alquimista", "Paulo Coelho", "Morntserrat", 1988));
    }

    public List<libro> findAll() {
        return libros;
    }

    public libro findById(Long id) {
        return libros.stream()
                .filter(libro -> libro.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public libro save(libro libro) {
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

}