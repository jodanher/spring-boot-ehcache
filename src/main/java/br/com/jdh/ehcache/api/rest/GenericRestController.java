package br.com.jdh.ehcache.api.rest;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.io.Serializable;

public interface GenericRestController<PK, E> extends Serializable {

    @GetMapping("/{id}")
    E get(PK id);

    @PostMapping
    E post(E entity);

    @PutMapping("/{id}")
    E put(PK id, E entity);

    @DeleteMapping("/{id}")
    void delete(PK id);

}
