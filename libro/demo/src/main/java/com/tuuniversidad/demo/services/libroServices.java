package com.tuuniversidad.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tuuniversidad.demo.models.libro;
import com.tuuniversidad.demo.repository.LibroRepository;
import java.util.List;

@Service
public class libroServices {
    @Autowired
    private LibroRepository libroRepository;

    public List<libro> findAll() {
        return libroRepository.findAll();
    }

    public libro findById(Long id) {
        return libroRepository.findById(id).orElse(null);
    }

    public libro save(libro libro) {
        return libroRepository.save(libro);
    }
}