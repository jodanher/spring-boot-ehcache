package br.com.jdh.ehcache.api.rest;

import br.com.jdh.ehcache.api.bo.GenericBO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public class GenericRestControllerImpl<PK, E> implements GenericRestController<PK, E> {

    protected GenericBO<PK, E> bo;

    public GenericRestControllerImpl(GenericBO<PK, E> bo) {
        this.bo = bo;
    }

    public E get(@PathVariable("id") PK id) {
        return bo.findById(id);
    }

    public E post(@RequestBody E entity) {
        return bo.insert(entity);
    }

    public E put(@PathVariable("id") PK id, @RequestBody E entity) {
        return bo.update(id, entity);
    }

    public void delete(@PathVariable("id") PK id) {
        bo.delete(id);
    }

}
