package br.com.jdh.ehcache.api.bo;

public interface GenericBO<PK, E> {

    E findById(PK id);

    E insert(E entity);

    E update(PK id, E entity);

    void delete(PK id);
}
