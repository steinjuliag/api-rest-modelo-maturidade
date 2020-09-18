package com.julia.apirest.apirest.resource;

import com.julia.apirest.apirest.modelo.Categoria;
import com.julia.apirest.apirest.respository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categorias")

public class CategoriaResource {
    @Autowired
    private CategoriaRepository categoriaRepository;


    @GetMapping
    public List<Categoria> listar() {

        return categoriaRepository.findAll();
    }

}
